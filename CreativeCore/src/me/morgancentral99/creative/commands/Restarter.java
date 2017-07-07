package me.morgancentral99.creative.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import me.morgancentral99.creative.PlayerOverride;
import net.md_5.bungee.api.ChatColor;

public class Restarter implements CommandExecutor {
	PlayerOverride po;
	
	@Override
	public boolean onCommand(CommandSender s, Command cmd, String label, String[] args) {
		
		if(label.equalsIgnoreCase("Stop")) {
			if(args.length == 0) {
				po.restartUtils.startRestartTime(1);
				return true;
			} else if(args[0].length() == 1) {
				if(args[0].equalsIgnoreCase("Now")) {
					po.kickAllPlayers("Maintence Mode, Or Server Crashed");
					Bukkit.shutdown();
					return true;
				}
			}
			
			
		} else if(label.equalsIgnoreCase("Restart")) {
			if(args.length == 0) {
				po.restartUtils.startRestartTime(0);
				return true;
			} else if(args[0].length() == 1) {
				if(args[0].equalsIgnoreCase("Now")) {
					po.kickAllPlayers("&6Restarting...");
					Bukkit.spigot().restart();
					return true;
				}
			}
		}
		return true;
	}

}
