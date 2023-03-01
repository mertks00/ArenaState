package me.mertks00.marena;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class MArena extends JavaPlugin {

    private ArenaState state;

    @Override
    public void onEnable() {

        setState(ArenaState.WAITING);

        getCommand("start").setExecutor(new ArenaCommand(this));

        Bukkit.getPluginManager().registerEvents(new ArenaListener(this), this);

    }

    public ArenaState getState() {
        return state;
    }

    public void setState(ArenaState state) {
        this.state = state;
    }

}
