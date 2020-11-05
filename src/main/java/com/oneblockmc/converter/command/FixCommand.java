package com.oneblockmc.converter.command;

import com.oneblockmc.converter.ConverterPlugin;
import com.oneblockmc.converter.convert.Converter;
import de.tr7zw.changeme.nbtapi.NBTItem;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class FixCommand implements CommandExecutor {

    private final ConverterPlugin plugin;
    public FixCommand(ConverterPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            ItemStack hand = player.getInventory().getItemInMainHand();

            if (hand != null && hand.getType() != Material.AIR) {
                NBTItem nbtItem = new NBTItem(hand);

                boolean handled = false;
                Material newType = null;

                for (Converter converter : plugin.getConverters()) {
                    if (converter.can(hand.getType(), nbtItem) && converter.execute(nbtItem)) {
                        handled = true;
                        if (converter.type() != null && converter.type() != hand.getType()) {
                            newType = converter.type();
                        }
                    }
                }

                if (handled) {
                    ItemStack replace = nbtItem.getItem();
                    if (newType != null) {
                        replace.setType(newType);
                    }
                    player.getInventory().setItemInMainHand(replace);

                    sender.sendMessage(ChatColor.GREEN + "Enchantments have been fixed.");
                } else {
                    sender.sendMessage(ChatColor.RED + "You cannot fix this item.");
                }
            }
        }

        return true;
    }
}
