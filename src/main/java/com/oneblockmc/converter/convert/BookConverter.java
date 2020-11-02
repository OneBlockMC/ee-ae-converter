package com.oneblockmc.converter.convert;

import de.tr7zw.changeme.nbtapi.NBTItem;
import lombok.NonNull;
import org.bukkit.Material;

public class BookConverter implements Converter {

    private final static String CONVERTED_NBT_KEY = "book_convert";
    private final static int CONVERTED_NBT_VERSION = 1;

    private final static String ELITE_ENCHANTMENTS__NBT_KEY = "eliteenchantments_all";

    @Override
    public boolean can(Material material, @NonNull NBTItem nbtItem) {
        return false;
    }

    @Override
    public boolean execute(@NonNull NBTItem nbtItem) {
        return false;
    }
}
