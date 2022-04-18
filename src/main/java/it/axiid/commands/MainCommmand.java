package it.axiid.commands;

import it.axiid.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

public class MainCommmand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        FileConfiguration config = Main.getInstance().getConfig();

        if(sender instanceof Player) {
            Player p = (Player) sender;
            if (args.length == 0) {
                if(p.hasPermission("antibuild.use")) {
                    if(Main.builders.contains(p.getUniqueId())) {
                        Main.builders.remove(p.getUniqueId());
                        p.sendMessage("§cHai disattivato la modalità costruttore.");
                    }else {
                        Main.builders.add(p.getUniqueId());
                        p.sendMessage("§aHai attivato la modalità costruttore.");
                    }
                }else {
                    p.sendMessage("§cNessun permesso.");
                }
            }else {
                p.sendMessage("§cUsa /antibuild");
            }
        }else {
            sender.sendMessage("Non puoi eseguire questo comando.");
        }

        return true;
    }
}
