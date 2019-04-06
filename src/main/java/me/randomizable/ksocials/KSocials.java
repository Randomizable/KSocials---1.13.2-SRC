package me.randomizable.ksocials;

import me.randomizable.ksocials.commands.*;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class KSocials extends JavaPlugin {

    FileManager FileManager = new FileManager();

    private static KSocials instance;

    public static KSocials getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;
        getCommand("website").setExecutor(new WebsiteCommand(this));
        getCommand("discord").setExecutor(new DiscordCommand (this));
        getCommand("facebook").setExecutor(new FacebookCommand(this));
        getCommand("github").setExecutor(new GithubCommand(this));
        getCommand("googleplus").setExecutor(new GoogleplusCommand (this));
        getCommand("instagram").setExecutor(new InstagramCommand (this));
        getCommand("mcmarket").setExecutor(new McmarketCommand (this));
        getCommand("reddit").setExecutor(new RedditCommand (this));
        getCommand("snapchat").setExecutor(new SnapchatCommand (this));
        getCommand("teamspeak").setExecutor(new TeamspeakCommand (this));
        getCommand("telegram").setExecutor(new TelegramCommand (this));
        getCommand("twitch").setExecutor(new TwitchCommand (this));
        getCommand("youtube").setExecutor(new YoutubeCommand (this));
        getServer().getConsoleSender().sendMessage(ChatColor.WHITE.toString() + ChatColor.STRIKETHROUGH + "-----------------------------------");
        getServer().getConsoleSender().sendMessage(ChatColor.WHITE.toString() + "                                ");
        getServer().getConsoleSender().sendMessage(ChatColor.WHITE.toString() + "                                ");
        getServer().getConsoleSender().sendMessage(ChatColor.AQUA.toString() + "------ x KSocials Injected x ------");
        getServer().getConsoleSender().sendMessage(ChatColor.WHITE.toString() + "                                ");
        getServer().getConsoleSender().sendMessage(ChatColor.WHITE.toString() + "                                ");
        getServer().getConsoleSender().sendMessage(ChatColor.WHITE.toString() + "------- Welcome To KSocials --------         ");
        getServer().getConsoleSender().sendMessage(ChatColor.WHITE.toString() + "------x--By Randomizable--x---------");
        getServer().getConsoleSender().sendMessage(ChatColor.WHITE.toString() + "                                ");
        getServer().getConsoleSender().sendMessage(ChatColor.WHITE.toString() + "                                ");
        getServer().getConsoleSender().sendMessage(ChatColor.WHITE.toString() + ChatColor.STRIKETHROUGH + "-----------------------------------");
        FileManager.Setup();
        loadConfig();

    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.WHITE.toString() + ChatColor.STRIKETHROUGH + "-----------------------------------");
        getServer().getConsoleSender().sendMessage(ChatColor.WHITE.toString() + "                                ");
        getServer().getConsoleSender().sendMessage(ChatColor.WHITE.toString() + "                                ");
        getServer().getConsoleSender().sendMessage(ChatColor.AQUA.toString() + "------ x KSocials Destructed x ------");
        getServer().getConsoleSender().sendMessage(ChatColor.WHITE.toString() + "                                ");
        getServer().getConsoleSender().sendMessage(ChatColor.WHITE.toString() + "                                ");
        getServer().getConsoleSender().sendMessage(ChatColor.WHITE.toString() + "------- See you next time! --------         ");
        getServer().getConsoleSender().sendMessage(ChatColor.WHITE.toString() + "------x--By Randomizable--x---------");
        getServer().getConsoleSender().sendMessage(ChatColor.WHITE.toString() + "                                ");
        getServer().getConsoleSender().sendMessage(ChatColor.WHITE.toString() + "                                ");
        getServer().getConsoleSender().sendMessage(ChatColor.WHITE.toString() + ChatColor.STRIKETHROUGH + "-----------------------------------");
    }

    public void loadConfig() {
        getConfig().options().copyDefaults(true);
        saveConfig();
    }

}
