package com.oneblockmc.converter.convert;

import de.tr7zw.changeme.nbtapi.NBTItem;
import lombok.NonNull;
import org.bukkit.Material;

public class BlackScrollConverter implements Converter {

    private final static String CONVERTED_NBT_KEY = "blackscroll_convert";
    private final static int CONVERTED_NBT_VERSION = 1;

    private final static String EE_BLACKSCROLL_NBT_KEY = "blackscroll";
    private final static String AE_SUCCESS_NBT_KEY = "success";

    @Override
    public boolean can(Material material, @NonNull NBTItem nbtItem) {
        return nbtItem.hasKey(EE_BLACKSCROLL_NBT_KEY)
                && (!nbtItem.hasKey(CONVERTED_NBT_KEY)
                    || nbtItem.getInteger(CONVERTED_NBT_KEY) < CONVERTED_NBT_VERSION);
    }

    @Override
    public boolean execute(@NonNull NBTItem nbtItem) {
        if (nbtItem.hasKey(EE_BLACKSCROLL_NBT_KEY)) {
            nbtItem.setString(AE_SUCCESS_NBT_KEY,
                    String.valueOf(nbtItem.getInteger(EE_BLACKSCROLL_NBT_KEY)));
            nbtItem.setInteger(CONVERTED_NBT_KEY, CONVERTED_NBT_VERSION);
            return true;
        }

        return false;
    }

    @Override
    public Material type() {
        return Material.INK_SAC;
    }
}
