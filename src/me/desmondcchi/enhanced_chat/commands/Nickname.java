package me.desmondcchi.enhanced_chat.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class Nickname implements CommandExecutor {
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
						
						return true;
					}
					
					player.setDisplayName(args[0]);
					player.setPlayerListName(args[0]);
					player.sendMessage(ChatColor.AQUA + "Your nickname is now: " + ChatColor.RESET + args[0]);
				}
			}
		}
		
		return true;
	}
}
