package com.miaoyww.raceHorse.commands.subCommands;

import com.miaoyww.raceHorse.RaceHorse;
import com.miaoyww.raceHorse.interfaces.ISubCommand;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Axolotl;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Horse;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.HorseJumpEvent;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.logging.Level;

public class TestCommand extends ISubCommand {
    @Override
    public String getName() {
        return "test";
    }

    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public String getSyntax() {
        return "";
    }

    @Override
    public void perform(Player player, String[] args) {
        Horse horse = (Horse) player.getWorld().spawnEntity(player.getLocation(), EntityType.HORSE);
        Bukkit.getMobGoals().removeAllGoals(horse);
        RaceHorse.entity = horse;

        Bukkit.getScheduler()
                .runTaskTimer(RaceHorse.getPlugin(), () -> {
            Bukkit.getMobGoals().removeAllGoals(horse);
            horse.getPathfinder().moveTo(new Location(player.getWorld(),-55.31,92.00,93.50));
            Bukkit.getLogger().log(Level.INFO, "Horse location: " + horse.getLocation());
        }, 20,20L);
       
    }
}
