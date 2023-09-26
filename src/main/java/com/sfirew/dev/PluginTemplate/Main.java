package com.sfirew.dev.PluginTemplate;

import java.util.logging.Logger;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    private final Logger logger = Bukkit.getLogger();

    @Override
    public void onEnable() {
        saveDefaultConfig();

        Bukkit.getPluginManager().registerEvents(new PlayerEventListener(), this);

        // Bukkit.getConsoleSender().sendMessage("[SFireWPluginTemplate] plugin loaded!");
        logger.info("plugin loaded!");
    }

    @Override
    public void onDisable() {
        // Bukkit.getConsoleSender().sendMessage("[SFireWPluginTemplate] plugin stopped!");
        logger.info("plugin stopped!");
    }
}
