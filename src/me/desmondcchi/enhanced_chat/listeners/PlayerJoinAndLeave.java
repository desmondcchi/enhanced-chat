package me.desmondcchi.enhanced_chat.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.Plugin;

import net.md_5.bungee.api.ChatColor;

public class PlayerJoinAndLeave implements Listener {
	private Plugin plugin;
	
	public PlayerJoinAndLeave(Plugin plugin) {
		this.plugin = plugin;
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		
		player.setDisplayName(plugin.getConfig().getString(player.getUniqueId().toString()));
		player.setPlayerListName(plugin.getConfig().getString(player.getUniqueId().toString()));
		
		event.setJoinMessage(player.getDisplayName() + ChatColor.GREEN + " has joined.");
	}
	
	@EventHandler
	public void onPlayerLeave(PlayerQuitEvent event) {
		Player player = event.getPlayer();
		
		event.setQuitMessage(player.getDisplayName() + ChatColor.RED + " has left.");
	}
}
