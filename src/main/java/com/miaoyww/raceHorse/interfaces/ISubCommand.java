package com.miaoyww.raceHorse.interfaces;

import org.bukkit.entity.Player;

public abstract class ISubCommand {
    public abstract String getName();
    public abstract String getDescription();
    public abstract String getSyntax();
    public abstract void perform(Player player, String args[]);

}
