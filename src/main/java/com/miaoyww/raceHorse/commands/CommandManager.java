package com.miaoyww.raceHorse.commands;

import com.miaoyww.raceHorse.utils.Messages;
import org.bukkit.entity.Player;
import com.miaoyww.raceHorse.commands.subCommands.*;
import com.miaoyww.raceHorse.interfaces.ICommandManager;


public class CommandManager extends ICommandManager {
    public CommandManager() {
        SubCommands.add(new TestCommand());
        SubCommands.add(new FastCommand());
    }

    @Override
    public String getName() {
        return "main";
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
        Messages.sendHelpMessage(player);
    }
}
