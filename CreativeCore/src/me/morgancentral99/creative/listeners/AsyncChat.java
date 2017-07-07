package me.morgancentral99.creative.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import me.morgancentral99.creative.CreativeCore;
import me.morgancentral99.creative.commands.Version;

public class AsyncChat implements Listener {
	
	Version v;
	
	@EventHandler
	public void onPlayerChat(AsyncPlayerChatEvent e) {
		String message = e.getMessage();
		if(message.contains("/pl") || message.contains("/plugins") || message.contains("/version")) {
			e.setCancelled(true);
			v.sendMessage(e.getPlayer());
		}
		e.setFormat(CreativeCore.format(e.getPlayer().getDisplayName() + "&0>> &7" + message));
	}

}
