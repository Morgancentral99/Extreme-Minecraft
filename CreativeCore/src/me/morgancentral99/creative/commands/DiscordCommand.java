package me.morgancentral99.creative.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import me.morgancentral99.creative.CreativeCore;

public class DiscordCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender s, Command cmd, String label, String[] args) {
		s.sendMessage(CreativeCore.format(CreativeCore.getPrefix() + "&2Discord: &6https://discord.gg/h782Yaa"));
		return true;
	}

}
