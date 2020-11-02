package com.oneblockmc.converter;

import com.oneblockmc.converter.command.FixCommand;
import com.oneblockmc.converter.command.NbtCommand;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

public class ConverterPlugin extends JavaPlugin {

    @Getter
    private EnchantRegistry enchantRegistry;

    @Getter
    private Converter converter;

    @Override
    public void onEnable() {
        setupRegistry();
        registerCommands();
    }

    private void setupRegistry() {
        this.enchantRegistry = new EnchantRegistry();
        this.converter = new Converter(enchantRegistry);
    }

    private void registerCommands() {
        getCommand("dumpnbt").setExecutor(new NbtCommand());
        getCommand("fixenchants").setExecutor(new FixCommand(converter));
    }
}
