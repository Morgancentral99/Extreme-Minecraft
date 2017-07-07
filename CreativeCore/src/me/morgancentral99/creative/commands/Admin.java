package me.morgancentral99.creative.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.morgancentral99.creative.CreativeCore;
import me.morgancentral99.creative.PlayerOverride;
import net.md_5.bungee.api.ChatColor;

public class Admin implements CommandExecutor {
	
	PlayerOverride po;

	@Override
	public boolean onCommand(CommandSender s, Command cmd, String label, String[] args) {
		if(s.hasPermission("Server.Admin")) {
			if(args[0].length() == 0) {
				s.sendMessage("Nulled Nothing Happened");
				return true;
			} 
			if(args[0].equalsIgnoreCase("reload")) {
				for(Player p : Bukkit.getOnlinePlayers()) {
					if(p.hasPermission("Server.Staff")) {
						System.out.println(p.getUniqueId().toString());
						po.addStaffMember(p.getUniqueId().toString());
						p.sendMessage(CreativeCore.format(CreativeCore.getStaffPrefix() + "Welcome Back " + p.getDisplayName()));
						System.out.println("Reloaded"); 
					}
					}
				}
		}
		s.sendMessage(ChatColor.RED + "No Permissions");
		return true;
	}

}
