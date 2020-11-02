package com.oneblockmc.converter;

import com.oneblockmc.converter.convert.Converter;
import de.tr7zw.changeme.nbtapi.NBTItem;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class PlayerListener implements Listener {

    private final ConverterPlugin plugin;
    public PlayerListener(ConverterPlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        PlayerInventory playerInventory = player.getInventory();

        for (int i = 0; i < playerInventory.getSize(); i++) {
            ItemStack item = playerInventory.getItem(i);
            if (item != null && item.getType() != Material.AIR) {
                NBTItem nbtItem = new NBTItem(item);

                boolean handled = false;
                for (Converter converter : plugin.getConverters()) {
                    if (converter.can(item.getType(), nbtItem) && converter.execute(nbtItem)) {
                        handled = true;
                    }
                }

                if (handled) {
                    playerInventory.setItem(i, nbtItem.getItem());
                }
            }
        }
    }
}
