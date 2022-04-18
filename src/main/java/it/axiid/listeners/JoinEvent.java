package it.axiid.listeners;

import it.axiid.Main;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEvent implements Listener
{

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {

        Player p = e.getPlayer();

        if(p.hasPermission("antibuild.use")) {
            if(Main.builders.contains(p.getUniqueId())) {
                Main.builders.remove(p.getUniqueId());
            }
        }
    }
}
