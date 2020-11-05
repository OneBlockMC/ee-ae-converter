package com.oneblockmc.converter.convert;

import de.tr7zw.changeme.nbtapi.NBTItem;
import lombok.NonNull;
import org.bukkit.Material;

public interface Converter {

    boolean can(Material material, @NonNull NBTItem nbtItem);

    boolean execute(@NonNull NBTItem nbtItem);

    Material type();

}
