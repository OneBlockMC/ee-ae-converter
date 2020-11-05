package com.oneblockmc.converter.convert;

import de.tr7zw.changeme.nbtapi.NBTItem;
import lombok.NonNull;
import org.bukkit.Material;

public class UnopenedBookConverter implements Converter {

    private final static String CONVERTED_NBT_KEY = "unopenedbook_convert";
    private final static int CONVERTED_NBT_VERSION = 1;

    private final static String EE_BOOK_NBT_KEY = "book";

    private final static String AE_RCBOOK_NBT_KEY = "rcbook";
    private final static String AE_RCBOOK_NBT_VALUE = "ae_book;%s;";

    @Override
    public boolean can(Material material, @NonNull NBTItem nbtItem) {
        boolean isType = false;
        if (nbtItem.hasKey(EE_BOOK_NBT_KEY)) {
            String type = nbtItem.getString(EE_BOOK_NBT_KEY);
            isType = type.equals(type.toUpperCase());
        }
        return material == Material.BOOK
                && isType
                && (!nbtItem.hasKey(CONVERTED_NBT_KEY)
                    || nbtItem.getInteger(CONVERTED_NBT_KEY) < CONVERTED_NBT_VERSION);
    }

    @Override
    public boolean execute(@NonNull NBTItem nbtItem) {
        if (nbtItem.hasKey(EE_BOOK_NBT_KEY)) {
            String type = nbtItem.getString(EE_BOOK_NBT_KEY);
            nbtItem.setString(AE_RCBOOK_NBT_KEY,
                    String.format(AE_RCBOOK_NBT_VALUE, type.toUpperCase()));

            nbtItem.setInteger(CONVERTED_NBT_KEY, CONVERTED_NBT_VERSION);
            return true;
        }
        return false;
    }
}
