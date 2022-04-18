package it.axiid.listeners;

import it.axiid.Main;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class PlaceEvent implements Listener
{

    @EventHandler
    public void onPlace(BlockPlaceEvent e) {

        Player p = e.getPlayer();

        if(!Main.builders.contains(p.getUniqueId())) {
            e.setCancelled(true);
        }

    }

}
