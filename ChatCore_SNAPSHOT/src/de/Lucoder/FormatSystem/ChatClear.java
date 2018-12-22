package de.Lucoder.FormatSystem;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class ChatClear implements Listener, CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args) {

        if (sender instanceof Player) {

            Player player = (Player) sender;

            if (command.getName().equalsIgnoreCase("clearchat")) {

                for (int i = 0; i <= 60; i++) {

                    Bukkit.broadcastMessage("§b ");

                }

                Bukkit.broadcastMessage("§bDer Chat wurde von §6" + player.getName() + " §bgecleart§7!");
            }

        } else {

            for (int i = 0; i <= 60; i++) {
                Bukkit.broadcastMessage(" ");
            }

            Bukkit.broadcastMessage("§bDer Chat wurde von der §6Konsole §bgecleart§7!");

        }

        return true;
    }

}
