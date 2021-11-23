package me.TurtlesAreHot.KillHeal;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new onKill(), this);
    }

    @Override
    public void onDisable() {

    }
}
