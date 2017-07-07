package me.morgancentral99.creative.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import me.morgancentral99.creative.CreativeCore;
import me.morgancentral99.creative.PlayerOverride;

public class OnPlayerJoinLeaveEvent implements Listener {
	
	PlayerOverride po;
	
	@EventHandler
	public void onPlayerJoinEvent(PlayerJoinEvent e) {
	Player p = e.getPlayer();
	if(p.hasPermission("Server.Staff")) {
		po.Staff.add(e.getPlayer().getUniqueId().toString());
	}
	if(!p.hasPlayedBefore()) {
		Bukkit.broadcastMessage(CreativeCore.format(CreativeCore.getPrefix() + "Wisp Something can go here"));
	} 
	//Player Join message
	Bukkit.broadcastMessage(CreativeCore.format(""));
	}
	
	@EventHandler
	public void onPlayerLeaveEvent(PlayerQuitEvent e) {
		//Player Leave message
		Bukkit.broadcastMessage(CreativeCore.format(""));
	}

}
