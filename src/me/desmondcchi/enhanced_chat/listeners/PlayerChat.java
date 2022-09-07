package me.desmondcchi.enhanced_chat.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;

import net.md_5.bungee.api.ChatColor;

public class PlayerChat implements Listener {
	@EventHandler
	public void onPlayerChat(AsyncPlayerChatEvent event) {
		event.setFormat("%s" + ChatColor.GRAY + ": " + ChatColor.WHITE + "%s");
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		
		player.setDisplayName(ChatColor.DARK_PURPLE + player.getName());
		player.setPlayerListName(ChatColor.DARK_PURPLE + player.getName());
	}
}
