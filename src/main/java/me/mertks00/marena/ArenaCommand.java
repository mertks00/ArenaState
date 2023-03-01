package me.mertks00.marena;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class ArenaCommand implements CommandExecutor {

    private MArena plugin;

    public ArenaCommand(MArena plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player) {

            Player player = (Player) sender;

            Bukkit.broadcastMessage("PvP 10 saniye sonra açılıcak!");
            new BukkitRunnable() {

                @Override
                public void run() {

                    plugin.setState(ArenaState.STARTING);
                    Bukkit.broadcastMessage("PvP açıldı");

                }

            }.runTaskLater(plugin, 200);

        }

        return true;
    }
}
