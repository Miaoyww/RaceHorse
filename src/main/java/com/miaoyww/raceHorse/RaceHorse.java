package com.miaoyww.raceHorse;

import com.miaoyww.raceHorse.commands.CommandManager;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.*;
import org.bukkit.event.entity.HorseJumpEvent;
import org.bukkit.entity.Axolotl;
import org.bukkit.entity.Horse;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class RaceHorse extends JavaPlugin implements Listener {

    public static Entity entity;
    public static RaceHorse plugin;
    @Override
    public void onEnable() {
        plugin = this;
        
        getCommand("race").setExecutor(new CommandManager());
        getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    
    public static RaceHorse getPlugin() {
        return plugin;
    }
    
    @EventHandler
    public void onPlayerInteract(PlayerInteractAtEntityEvent event) {
        if (event.getHand() != EquipmentSlot.HAND) return;
        if (!(event.getRightClicked() instanceof Axolotl entity)) return;

    }
}
