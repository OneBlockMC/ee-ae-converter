package com.oneblockmc.converter.command;

import com.oneblockmc.converter.Converter;
import de.tr7zw.changeme.nbtapi.NBTItem;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class FixCommand implements CommandExecutor {

    private final Converter converter;
    public FixCommand(Converter converter) {
        this.converter = converter;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            ItemStack hand = player.getInventory().getItemInMainHand();

            if (hand != null && hand.getType() != Material.AIR) {
                NBTItem nbtItem = new NBTItem(hand);
                if (converter.can(nbtItem)) {
                    if (converter.convert(nbtItem)) {
                        sender.sendMessage(ChatColor.GREEN + "Enchants have been fixed.");
                    } else {
                        sender.sendMessage(ChatColor.RED + "You cannot fix this item.");
                    }
                } else {
                    sender.sendMessage(ChatColor.RED + "You cannot fix this item.");
                }
            }
        }

        return true;
    }
}
