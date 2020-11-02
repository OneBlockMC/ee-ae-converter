package com.oneblockmc.converter.convert;

import com.oneblockmc.converter.EnchantRegistry;
import com.oneblockmc.converter.type.AEEnchant;
import com.oneblockmc.converter.type.EliteEnchant;
import de.tr7zw.changeme.nbtapi.NBTCompound;
import de.tr7zw.changeme.nbtapi.NBTItem;
import lombok.NonNull;
import org.bukkit.Material;

import java.util.Optional;

public class ToolArmourConverter implements Converter {

    private final static String CONVERTED_NBT_KEY = "toolarmour_convert";
    private final static int CONVERTED_NBT_VERSION = 1;

    private final static String ELITE_ENCHANTMENTS_NBT_KEY = "eliteenchantments_all";

    private final EnchantRegistry enchantRegistry;
    public ToolArmourConverter(EnchantRegistry enchantRegistry) {
        this.enchantRegistry = enchantRegistry;
    }

    @Override
    public boolean can(Material material, @NonNull NBTItem nbtItem) {
        return nbtItem.hasKey(ELITE_ENCHANTMENTS_NBT_KEY)
                && (!nbtItem.hasKey(CONVERTED_NBT_KEY)
                || nbtItem.getInteger(CONVERTED_NBT_KEY) < CONVERTED_NBT_VERSION);
    }

    @Override
    public boolean execute(@NonNull NBTItem nbtItem) {
        if (nbtItem.hasKey(ELITE_ENCHANTMENTS_NBT_KEY)) {
            NBTCompound compound = nbtItem.getCompound(ELITE_ENCHANTMENTS_NBT_KEY);
            for (String enchantKey : compound.getKeys()) {
                EliteEnchant enchant = EliteEnchant.of(enchantKey);
                if (enchant != null) {
                    Optional<AEEnchant> aeEnchantOptional = enchantRegistry.getEquivalent(enchant);
                    if (aeEnchantOptional.isPresent()) {
                        AEEnchant aeEnchant = aeEnchantOptional.get();
                        aeEnchant.add(nbtItem, enchant.getLevel(nbtItem));
                    }
                }
            }

            nbtItem.setInteger(CONVERTED_NBT_KEY, CONVERTED_NBT_VERSION);
            return true;
        }

        return false;
    }
}
