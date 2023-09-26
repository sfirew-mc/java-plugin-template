package com.sfirew.dev.PluginTemplate;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
    int tps;

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
        // Bukkit.getConsoleSender().sendMessage("[SFireWPluginTemplate] plugin loaded!");
        getLogger().info("plugin loaded!");
    }

    @Override
    public void onDisable() {
        // Bukkit.getConsoleSender().sendMessage("[SFireWPluginTemplate] plugin stopped!");
        getLogger().info("plugin stopped!");
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.getPlayer().sendMessage("Hello, " + event.getPlayer().getName() + "!");
    }
}
