package com.oneblockmc.converter;

import com.oneblockmc.converter.command.FixCommand;
import com.oneblockmc.converter.command.NbtCommand;
import com.oneblockmc.converter.convert.BookConverter;
import com.oneblockmc.converter.convert.Converter;
import com.oneblockmc.converter.convert.ToolArmourConverter;
import com.oneblockmc.converter.convert.UnopenedBookConverter;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashSet;
import java.util.Set;

public class ConverterPlugin extends JavaPlugin {

    @Getter
    private EnchantRegistry enchantRegistry;

    @Getter
    private Set<Converter> converters;

    @Override
    public void onEnable() {
        setupRegistry();
        setupConverters();
        registerListeners();
        registerCommands();
    }

    private void setupRegistry() {
        this.enchantRegistry = new EnchantRegistry();
    }

    private void setupConverters() {
        this.converters = new HashSet<>();
        this.converters.add(new ToolArmourConverter(enchantRegistry));
        this.converters.add(new BookConverter(enchantRegistry));
        this.converters.add(new UnopenedBookConverter());
    }

    private void registerListeners() {
        getServer().getPluginManager().registerEvents(new PlayerListener(this), this);
    }

    private void registerCommands() {
        getCommand("dumpnbt").setExecutor(new NbtCommand());
        getCommand("fixenchants").setExecutor(new FixCommand(this));
    }
}
