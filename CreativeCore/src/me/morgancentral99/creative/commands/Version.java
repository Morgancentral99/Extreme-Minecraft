package me.morgancentral99.creative.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.morgancentral99.creative.CreativeCore;

public class Version implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender s, Command cmd, String label, String[] args) {
		if(s instanceof Player) {
			Player p = (Player)s;
			sendMessage(p);
			return true;
		}
		return true;
	}
	
	public void sendMessage(Player p) {
		p.sendMessage(CreativeCore.format("&6Extreme Minecraft&4>> &6Extreme Plugins Developed by &3Morgancentral99"));
	}

}
