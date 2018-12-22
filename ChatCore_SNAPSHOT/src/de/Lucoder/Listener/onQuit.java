package de.Lucoder.Listener;

import de.Lucoder.ChatCore.Main;
import de.Lucoder.FormatSystem.ChatFormat;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class onQuit implements Listener {

    static Player player;

    public onQuit(Main main) {
        main.getServer().getPluginManager().registerEvents(this, Main.getInstance());
    }

    @EventHandler
    public static void onQuit(PlayerQuitEvent playerQuitEvent) {

        player = playerQuitEvent.getPlayer();

        if (player.hasPermission("team.quitmessage")) {
            playerQuitEvent.setQuitMessage(getRankPrefix() + player.getDisplayName() + " §8ist nun nicht mehr zu erreichen.");
        } else
            playerQuitEvent.setQuitMessage("");

    }

    public static String getRankPrefix() {

        if (player.hasPermission("team.owner")) {
            return "§4";
        } else if (player.hasPermission("team.admin")) {
            return "§c";
        } else if (player.hasPermission("team.headdeveloper")) {
            return "§3";
        } else if (player.hasPermission("team.headmoderator")) {
            return "§5";
        } else if (player.hasPermission("team.moderator")) {
            return "§5";
        } else if (player.hasPermission("team.supporter")) {
            return "§5";
        } else if (player.hasPermission("team.probesupporter")) {
            return "§5";
        } else if (player.hasPermission("team.developer")) {
            return "§b";
        } else if (player.hasPermission("team.probedeveloper")) {
            return "§b";
        } else if (player.hasPermission("team.architekt")) {
            return "§2";
        } else if (player.hasPermission("team.builder")) {
            return "§a";
        } else {
            return "§8";
        }
    }


}
