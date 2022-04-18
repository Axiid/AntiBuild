package it.axiid;

import it.axiid.commands.MainCommmand;
import it.axiid.listeners.BreakEvent;
import it.axiid.listeners.JoinEvent;
import it.axiid.listeners.PlaceEvent;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.UUID;

public class Main extends JavaPlugin {

    private static Main instance;

    public static Main getInstance() {
        return instance;
    }

    public static ArrayList<UUID> builders = new ArrayList<>();

    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;

        getCommand("antibuild").setExecutor(new MainCommmand());
        Bukkit.getPluginManager().registerEvents(new PlaceEvent(), this);
        Bukkit.getPluginManager().registerEvents(new BreakEvent(), this);
        Bukkit.getPluginManager().registerEvents(new JoinEvent(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
