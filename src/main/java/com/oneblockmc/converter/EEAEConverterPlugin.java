package com.oneblockmc.converter;

import com.oneblockmc.converter.command.NbtCommand;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

public class EEAEConverterPlugin extends JavaPlugin {

    @Getter
    private ConverterRegistry converterRegistry;

    @Override
    public void onEnable() {
        setupRegistry();
        registerCommands();
    }

    private void setupRegistry() {
        this.converterRegistry = new ConverterRegistry();
    }

    private void registerCommands() {
        getCommand("dumpnbt").setExecutor(new NbtCommand());
    }
}
