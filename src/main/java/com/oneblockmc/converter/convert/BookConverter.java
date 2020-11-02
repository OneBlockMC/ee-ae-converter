package com.oneblockmc.converter.convert;

import com.oneblockmc.converter.EnchantRegistry;
import com.oneblockmc.converter.type.AEEnchant;
import com.oneblockmc.converter.type.EliteEnchant;
import de.tr7zw.changeme.nbtapi.NBTItem;
import lombok.NonNull;
import org.bukkit.Material;

import java.util.Optional;

public class BookConverter implements Converter {

    private final static String CONVERTED_NBT_KEY = "book_convert";
    private final static int CONVERTED_NBT_VERSION = 1;

    private final static String EE_BOOK_ENCHANTMENT_NBT_KEY = "enchantment";
    private final static String EE_BOOK_ENCHANTMENT_LEVEL_NBT_KEY = "enchantment_level";
    private final static String EE_BOOK_SUCCESS_NBT_KEY = "success";
    private final static String EE_BOOK_DESTROY_NBT_KEY = "destroy";

    private final EnchantRegistry enchantRegistry;
    public BookConverter(EnchantRegistry enchantRegistry) {
        this.enchantRegistry = enchantRegistry;
    }

    @Override
    public boolean can(Material material, @NonNull NBTItem nbtItem) {
        return material == Material.BOOK
                && nbtItem.hasKey(EE_BOOK_ENCHANTMENT_NBT_KEY)
                && nbtItem.hasKey(EE_BOOK_ENCHANTMENT_LEVEL_NBT_KEY)
                && nbtItem.hasKey(EE_BOOK_SUCCESS_NBT_KEY)
                && nbtItem.hasKey(EE_BOOK_DESTROY_NBT_KEY)
                && (!nbtItem.hasKey(CONVERTED_NBT_KEY)
                    || nbtItem.getInteger(CONVERTED_NBT_KEY) < CONVERTED_NBT_VERSION);
    }

    @Override
    public boolean execute(@NonNull NBTItem nbtItem) {
        if (nbtItem.hasKey(EE_BOOK_ENCHANTMENT_NBT_KEY)
                && nbtItem.hasKey(EE_BOOK_ENCHANTMENT_LEVEL_NBT_KEY)) {
            String enchantName = nbtItem.getString(EE_BOOK_ENCHANTMENT_NBT_KEY);
            int enchantLevel = nbtItem.getInteger(EE_BOOK_ENCHANTMENT_LEVEL_NBT_KEY);

            int success = Math.round(nbtItem.getFloat(EE_BOOK_SUCCESS_NBT_KEY));
            int destroy = 100 - success;

            EliteEnchant enchant = EliteEnchant.of(enchantName);
            if (enchant != null) {
                Optional<AEEnchant> aeEnchantOptional = enchantRegistry.getEquivalent(enchant);
                if (aeEnchantOptional.isPresent()) {
                    AEEnchant aeEnchant = aeEnchantOptional.get();
                    aeEnchant.addBook(nbtItem, enchantLevel, success, destroy);

                    nbtItem.setInteger(CONVERTED_NBT_KEY, CONVERTED_NBT_VERSION);
                    return true;
                }
            }
        }

        return false;
    }
}
