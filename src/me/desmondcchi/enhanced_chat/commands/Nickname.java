package me.desmondcchi.enhanced_chat.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import net.md_5.bungee.api.ChatColor;

public class Nickname implements CommandExecutor {
	private Plugin plugin;
	
	public Nickname(Plugin plugin) {
		this.plugin = plugin;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (label.equalsIgnoreCase("nick") || label.equalsIgnoreCase("nickname")) {
			if (sender instanceof Player) {
				Player player = (Player) sender;
				
				if (args.length == 0) {
					player.sendMessage(ChatColor.AQUA + "Your nickname is: " + ChatColor.RESET + player.getDisplayName());
					
					return true;
				}
				else if (args.length == 1) {
					if (args[0].equalsIgnoreCase("reset")) {
						player.setDisplayName(player.getName());
						player.setPlayerListName(player.getName());
						player.sendMessage(ChatColor.AQUA + "Your nickname has been reset!");
						
						plugin.getConfig().set(player.getUniqueId().toString(), null);
						plugin.saveConfig();
						
						return true;
					}
					
					String formattedName = colorFormat(args[0]);
					player.setDisplayName(formattedName);
					player.setPlayerListName(formattedName);
					player.sendMessage(ChatColor.AQUA + "Your nickname is now: " + ChatColor.RESET + formattedName);
					
					plugin.getConfig().set(player.getUniqueId().toString(), formattedName);
					plugin.saveConfig();
				}
			}
		}
		
		return true;
	}
	
	private String colorFormat(String msg) {
		return ChatColor.translateAlternateColorCodes('&', msg);
	}
}
