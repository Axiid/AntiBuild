package it.axiid.listeners;

import it.axiid.Main;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BreakEvent implements Listener
{

    @EventHandler
    public void onBreak(BlockBreakEvent e) {

        Player p = e.getPlayer();

        if(!Main.builders.contains(p.getUniqueId())) {
            e.setCancelled(true);
        }

    }

}
