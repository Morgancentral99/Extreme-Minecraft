package me.morgancentral99.creative.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import me.morgancentral99.creative.PlayerOverride;

public class OnPlayerJoinLeaveEvent implements Listener {
	
	PlayerOverride po;
	
	@EventHandler
	public void onPlayerJoinEvent(PlayerJoinEvent e) {
	Player p = e.getPlayer();
	if(p.hasPermission("Server.Staff")) {
		po.Staff.add(e.getPlayer().getUniqueId().toString());
	}
	}

}
