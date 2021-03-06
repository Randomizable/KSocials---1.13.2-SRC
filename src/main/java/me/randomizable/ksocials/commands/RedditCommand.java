package me.randomizable.ksocials.commands;


import me.randomizable.ksocials.KSocials;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;


public class RedditCommand implements CommandExecutor, Listener {

    private KSocials plugin;

    public RedditCommand(KSocials plugin) {
        this.plugin = plugin;
    }


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = ((Player) sender).getPlayer();
            if (KSocials.getInstance().getConfig().getBoolean("enable_reddit_command")) {
                if (player.hasPermission("ksocials.reddit")){
                    if (!player.isDead()) {
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getInstance().getConfig().getString("reddit_message")));
                    }
                }else{
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getInstance().getConfig().getString("no_permission_message")));
                    return true;
                }
            } else {
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getInstance().getConfig().getString("commands_disabled_message")));
            }
        } else {
            Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getInstance().getConfig().getString("players_only_message")));
        }
        return true;
    }
}
