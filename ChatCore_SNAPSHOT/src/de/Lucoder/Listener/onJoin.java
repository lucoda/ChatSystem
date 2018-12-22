package de.Lucoder.Listener;

import de.Lucoder.ChatCore.Main;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class onJoin implements Listener {

    public onJoin(Main main) {
        main.getServer().getPluginManager().registerEvents(this, Main.getInstance());
    }

    static Player player;

    @EventHandler
    public static void onJoin(PlayerJoinEvent event) {

        player = event.getPlayer();

        if (player.hasPermission("team.joinmessage")){

            event.setJoinMessage(getRankPrefix() + player.getDisplayName() + " §8ist gejoint.");

        }else
            event.setJoinMessage("");
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
