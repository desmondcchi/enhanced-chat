package me.desmondcchi.enhanced_chat.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import net.md_5.bungee.api.ChatColor;

public class PlayerJoinAndLeave implements Listener {
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		
		event.setJoinMessage(player.getDisplayName() + ChatColor.GREEN + " has joined.");
	}
	
	@EventHandler
	public void onPlayerLeave(PlayerQuitEvent event) {
		Player player = event.getPlayer();
		
		event.setQuitMessage(player.getDisplayName() + ChatColor.RED + " has left.");
	}
}
