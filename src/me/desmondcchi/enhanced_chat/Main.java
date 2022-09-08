package me.desmondcchi.enhanced_chat;

import org.bukkit.plugin.java.JavaPlugin;

import me.desmondcchi.enhanced_chat.commands.Nickname;
import me.desmondcchi.enhanced_chat.listeners.PlayerChat;
import me.desmondcchi.enhanced_chat.listeners.PlayerJoinAndLeave;

public class Main extends JavaPlugin {
	@Override
	public void onEnable() {
		// Commands
		this.getCommand("nickname").setExecutor(new Nickname());
		
		// Listeners
		this.getServer().getPluginManager().registerEvents(new PlayerChat(), this);
		this.getServer().getPluginManager().registerEvents(new PlayerJoinAndLeave(), this);
	}
	
	@Override
	public void onDisable() {
		
	}
}
