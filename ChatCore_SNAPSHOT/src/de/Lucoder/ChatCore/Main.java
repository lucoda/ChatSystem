package de.Lucoder.ChatCore;

import de.Lucoder.FormatSystem.ChatClear;
import de.Lucoder.FormatSystem.ChatFormat;
import de.Lucoder.Listener.onJoin;
import de.Lucoder.Listener.onQuit;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public final String prefix = "§7[§bChatCore§7]";
    public static Main instance;

    @Override
    public void onEnable() {

        instance = this;

        init();

        sendConsole(prefix + " §6wurde aktiviert§7.");

    }

    @Override
    public void onDisable() {

        sendConsole(prefix + " §cwurde deaktiviert§7.");

    }

    public void init() {

        new ChatFormat(this);

        new onJoin(this);
        new onQuit(this);

        getCommand("clearchat").setExecutor(new ChatClear());

    }

    public static Main getInstance() {
        return instance;
    }

    public void sendConsole(String message) {
        Bukkit.getServer().getConsoleSender().sendMessage(message);
    }

}