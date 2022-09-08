package me.desmondcchi.enhanced_chat.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class Colors implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (label.equalsIgnoreCase("colors") & args.length == 0) {
			if (sender instanceof Player) {
				Player player = (Player) sender;
				
				player.sendMessage(ChatColor.AQUA + "==========" + ChatColor.BLUE + "C" + ChatColor.RED + "o" + ChatColor.YELLOW + "l" + ChatColor.BLUE + "o" + ChatColor.GREEN + "r" + ChatColor.RED + "s" + ChatColor.AQUA + "===========");
				player.sendMessage(ChatColor.DARK_GRAY + "Black: &0");
				player.sendMessage(ChatColor.DARK_BLUE + "Dark Blue: &1");
				player.sendMessage(ChatColor.DARK_GREEN + "Dark Green: &2");
				player.sendMessage(ChatColor.DARK_AQUA + "Dark Aqua: &3");
				player.sendMessage(ChatColor.DARK_RED + "Dark Red: &4");
				player.sendMessage(ChatColor.DARK_PURPLE + "Purple: &5");
				player.sendMessage(ChatColor.GOLD + "Gold: &6");
				player.sendMessage(ChatColor.GRAY + "Gray: &7");
				player.sendMessage(ChatColor.DARK_GRAY + "Dark Gray: &8");
				player.sendMessage(ChatColor.LIGHT_PURPLE + "Indigo: &9");
				player.sendMessage(ChatColor.GREEN + "Bright Green: &a");
				player.sendMessage(ChatColor.AQUA + "Aqua: &b");
				player.sendMessage(ChatColor.RED + "Red: &c");
				player.sendMessage(ChatColor.LIGHT_PURPLE + "Pink: &d");
				player.sendMessage(ChatColor.YELLOW + "Yellow: &e");
				player.sendMessage(ChatColor.WHITE + "White: &f");
				player.sendMessage(ChatColor.BOLD + "" + ChatColor.DARK_GRAY + "Bold: &l");
				player.sendMessage(ChatColor.ITALIC + "" + ChatColor.DARK_GRAY + "Italic: &o");
				player.sendMessage(ChatColor.MAGIC + "" + ChatColor.DARK_GRAY + "Magic: " + ChatColor.RESET + "" + ChatColor.DARK_GRAY + "&b");
				player.sendMessage(ChatColor.UNDERLINE + "" + ChatColor.DARK_GRAY + "Underline: &n");
				player.sendMessage(ChatColor.STRIKETHROUGH + "" + ChatColor.DARK_GRAY + "Strikethrough: &m");
				player.sendMessage(ChatColor.RESET + "Reset: &r");
			}
		}
		
		return true;
	}
}
