package me.mertks00.marena;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.scheduler.BukkitRunnable;

public class ArenaListener implements Listener {

    private MArena plugin;

    public ArenaListener(MArena plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPvP(EntityDamageEvent e) {

        Player player = (Player) e.getEntity();

        if(plugin.getState() == ArenaState.STARTING) {

            e.setCancelled(false);

        } else {
            e.setCancelled(true);
        }

    }

}
