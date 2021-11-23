package me.TurtlesAreHot.KillHeal;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class onKill implements Listener {

    @EventHandler
    public void onPlayerKill(PlayerDeathEvent e) {
        Player killer = e.getEntity().getKiller();
        if(killer instanceof Player) {
            killer.sendMessage(ChatColor.GRAY + "You had " + killer.getHealth() + " left. You were healed for killing someone.");
            killer.setHealth(20.0);
        }
    }
}
