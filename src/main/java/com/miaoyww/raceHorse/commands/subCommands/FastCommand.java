package com.miaoyww.raceHorse.commands.subCommands;

import com.miaoyww.raceHorse.RaceHorse;
import com.miaoyww.raceHorse.interfaces.ISubCommand;
import org.bukkit.Bukkit;
import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Horse;
import org.bukkit.entity.Player;

public class FastCommand extends ISubCommand {
    @Override
    public String getName() {
        return "fast";
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
        ((Horse)RaceHorse.entity).damage(1);
        AttributeInstance attribute = ((Horse)RaceHorse.entity).getAttribute(Attribute.GENERIC_MOVEMENT_SPEED);

        if (attribute != null) {
            // 设置马的速度属性 (标准马的速度通常在 0.2 左右)
            attribute.setBaseValue(0.4); // 将速度提高一倍
        }
    }
}
