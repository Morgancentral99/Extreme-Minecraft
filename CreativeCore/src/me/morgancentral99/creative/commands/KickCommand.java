package me.morgancentral99.creative.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import net.md_5.bungee.api.ChatColor;

public class KickCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender s, Command cmd, String label, String[] args) {
		if(args.length == 0) {
			s.sendMessage(ChatColor.RED + "Usage: /kick <Username> <Desc>");
		}
		return false;
	}

}
