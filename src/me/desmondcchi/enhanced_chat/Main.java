package me.desmondcchi.enhanced_chat;

import org.bukkit.plugin.java.JavaPlugin;

import me.desmondcchi.enhanced_chat.listeners.PlayerChat;

public class Main extends JavaPlugin {
	@Override
	public void onEnable() {
		this.getServer().getPluginManager().registerEvents(new PlayerChat(), this);
	}
	
	@Override
	public void onDisable() {
		
	}
}
