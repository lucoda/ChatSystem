package de.Lucoder.FormatSystem;

import de.Lucoder.ChatCore.Main;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatFormat implements Listener {

    static Player player;

    public ChatFormat(Main main) {
        main.getServer().getPluginManager().registerEvents(this, Main.getInstance());
    }

    @EventHandler
    public static void onChat(AsyncPlayerChatEvent event) {

        event.setCancelled(true);

        player = event.getPlayer();

        String message = event.getMessage();

        if (player.hasPermission("team.owner")) {

            String msg = message.replaceAll("&", "§");

            for (Player all : Bukkit.getOnlinePlayers()) {

                all.sendMessage("§4§lOwner §7● §4§l" + player.getDisplayName() + " §r§7| §f" + msg);

            }

            Bukkit.getServer().getConsoleSender().sendMessage("§4§lOwner §7● §4§l" + player.getDisplayName() + " §r§7| §f" + msg);

        } else if (player.hasPermission("team.admin")) {

            String msg = message.replaceAll("&", "§");

            for (Player all : Bukkit.getOnlinePlayers()) {

                all.sendMessage("§c§lAdmin §7● §c§l" + player.getDisplayName() + " §7| §f" + msg);

            }

            Bukkit.getServer().getConsoleSender().sendMessage("§c§lAdmin §7● §c§l" + player.getDisplayName() + " §7| §f" + msg);

        } else if (player.hasPermission("team.headdeveloper")) {

            String msg = message.replaceAll("&", "§");

            for (Player all : Bukkit.getOnlinePlayers()) {

                all.sendMessage("§3§lHead-Developer §7● §3§l" + player.getDisplayName() + " §7| §f" + msg);

            }

            Bukkit.getServer().getConsoleSender().sendMessage("§3§lHead-Developer §7● §3§l" + player.getDisplayName() + " §7| §f" + msg);

        } else if (player.hasPermission("team.headmoderator")) {

            String msg = message.replaceAll("&", "§");

            for (Player all : Bukkit.getOnlinePlayers()) {

                all.sendMessage("§5§lHead-Moderator §7● §5§l" + player.getDisplayName() + " §7| §f" + msg);

            }

            Bukkit.getServer().getConsoleSender().sendMessage("§5§lHead-Moderator §7● §5§l" + player.getDisplayName() + " §7| §f" + msg);

        } else if (player.hasPermission("team.moderator")) {

            String msg = message.replaceAll("&", "§");

            for (Player all : Bukkit.getOnlinePlayers()) {

                all.sendMessage("§5§lModerator §7● §5§l" + player.getDisplayName() + " §7| §f" + msg);

            }

            Bukkit.getServer().getConsoleSender().sendMessage("§5§lModerator §7● §5§l" + player.getDisplayName() + " §r§7| §f" + msg);

        } else if (player.hasPermission("team.supporter")) {

            String msg = message.replaceAll("&", "§");

            for (Player all : Bukkit.getOnlinePlayers()) {

                all.sendMessage("§d§lSupporter §7● §d§l" + player.getDisplayName() + " §7| §f" + msg);
                Bukkit.getServer().getConsoleSender().sendMessage("§d§lSupporter §7● §d§l" + player.getDisplayName() + " §7| §f" + msg);

            }

            Bukkit.getServer().getConsoleSender().sendMessage("§d§lSupporter §7● §d§l" + player.getDisplayName() + " §7| §f" + msg);

        } else if (player.hasPermission("team.probesupporter")) {

            String msg = message.replaceAll("&", "§");

            for (Player all : Bukkit.getOnlinePlayers()) {

                all.sendMessage("§d§lProbeSupporter §7● §d§l" + player.getDisplayName() + " §7| §f" + msg);

            }

            Bukkit.getServer().getConsoleSender().sendMessage("§d§lProbeSupporter §7● §d§l" + player.getDisplayName() + " §7| §f" + msg);

        } else if (player.hasPermission("team.developer")) {

            String msg = message.replaceAll("&", "§");

            for (Player all : Bukkit.getOnlinePlayers()) {

                all.sendMessage("§b§lDeveloper §7● §b§l" + player.getDisplayName() + " §7| §f" + msg);

            }

            Bukkit.getServer().getConsoleSender().sendMessage("§b§lDeveloper §7● §b§l" + player.getDisplayName() + " §7| §f" + msg);

        } else if (player.hasPermission("team.probedeveloper")) {

            String msg = message.replaceAll("&", "§");

            for (Player all : Bukkit.getOnlinePlayers()) {

                all.sendMessage("§b§lProbe-Developer §7● §b§l" + player.getDisplayName() + " §7| §f" + msg);

            }

            Bukkit.getServer().getConsoleSender().sendMessage("§b§lProbe-Developer §7● §b§l" + player.getDisplayName() + " §7| §f" + msg);

        } else if (player.hasPermission("team.architekt")) {

            String msg = message.replaceAll("&", "§");

            for (Player all : Bukkit.getOnlinePlayers()) {

                all.sendMessage("§2§lArchitekt §7● §2§l" + player.getDisplayName() + " §7| §f" + msg);

            }

            Bukkit.getServer().getConsoleSender().sendMessage("§2§lArchitekt §7● §2§l" + player.getDisplayName() + " §7| §f" + msg);

        } else if (player.hasPermission("team.builder")) {

            String msg = message.replaceAll("&", "§");

            for (Player all : Bukkit.getOnlinePlayers()) {

                all.sendMessage("§a§lBuilder §7● §a§l" + player.getDisplayName() + " §7| §f" + msg);

            }

            Bukkit.getServer().getConsoleSender().sendMessage("§a§lBuilder §7● §a§l" + player.getDisplayName() + " §7| §f" + msg);

        } else {

            String msg = message.replaceAll("&", "§");

            for (Player all : Bukkit.getOnlinePlayers()) {

                all.sendMessage("§8§lSpieler §7● §8" + player.getDisplayName() + " §7| §8" + msg);

            }

            Bukkit.getServer().getConsoleSender().sendMessage("§8Spieler §7● §8" + player.getDisplayName() + " §7| §8" + msg);


        }

    }

}