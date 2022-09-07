package me.desmondcchi.enhanced_chat.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import net.md_5.bungee.api.ChatColor;

public class PlayerChat implements Listener {
	@EventHandler
	public void onPlayerChat(AsyncPlayerChatEvent event) {
		event.setFormat(ChatColor.AQUA + "%s" + ChatColor.GRAY + ": " + ChatColor.WHITE + "%s");
	}
}
