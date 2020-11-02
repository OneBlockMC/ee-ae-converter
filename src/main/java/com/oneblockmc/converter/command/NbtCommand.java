package com.oneblockmc.converter.command;

import de.tr7zw.changeme.nbtapi.NBTCompound;
import de.tr7zw.changeme.nbtapi.NBTItem;
import lombok.NonNull;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class NbtCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player && sender.hasPermission("aeconverter.dumpnbt")) {
            Player player = (Player) sender;
            ItemStack hand = player.getInventory().getItemInMainHand();

            if (hand != null && hand.getType() != Material.AIR) {
                NBTItem nbtItem = new NBTItem(hand);

                if (args.length == 0) {
                    sender.sendMessage("Keys = " + nbtItem.getKeys().toString());
                } else if (args.length == 1) {
                    sender.sendMessage("Keys = " + nbtItem.getKeys().toString());
                    outputNbtCompoundKey(sender, args[0], nbtItem);
                } else if (args.length == 2) {
                    NBTCompound nbtCompound = nbtItem.getCompound(args[0]);
                    if (nbtCompound != null) {
                        sender.sendMessage("Path = " + args[0] + " -> " + args[1]);
                        sender.sendMessage("Keys = " + nbtCompound.getKeys().toString());
                        outputNbtCompoundKey(sender, args[1], nbtCompound);
                    }
                } else if (args.length == 3) {
                    NBTCompound nbtCompound = nbtItem
                            .getCompound(args[0])
                            .getCompound(args[1]);

                    if (nbtCompound != null) {
                        sender.sendMessage("Path = " + args[0] + " -> " + args[1] + " -> " + args[2]);
                        sender.sendMessage("Keys = " + nbtCompound.getKeys().toString());
                        outputNbtCompoundKey(sender, args[2], nbtCompound);
                    }
                }
            }
        }

        return true;
    }

    private void outputNbtCompoundKey(@NonNull CommandSender sender,
                                 @NonNull String key,
                                 @NonNull NBTCompound nbtCompound) {
        NBTCompound nextCompound = nbtCompound.getCompound(key);
        sender.sendMessage(key + " (compound) = " + (nextCompound != null ? nextCompound.getKeys().toString() : "false"));
        sender.sendMessage(key + " (string) = " + nbtCompound.getString(key));
        sender.sendMessage(key + " (boolean) = " + nbtCompound.getBoolean(key));
        sender.sendMessage(key + " (long) = " + nbtCompound.getLong(key));
        sender.sendMessage(key + " (double) = " + nbtCompound.getDouble(key));
        sender.sendMessage(key + " (float) = " + nbtCompound.getFloat(key));
        sender.sendMessage(key + " (integer) = " + nbtCompound.getInteger(key));
        sender.sendMessage(key + " (string list) = " + nbtCompound.getStringList(key).toString());
        sender.sendMessage(key + " (int list) = " + nbtCompound.getIntegerList(key).toString());
    }
}
