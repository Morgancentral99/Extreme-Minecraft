package me.morgancentral99.creative.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.morgancentral99.creative.CreativeCore;
import me.morgancentral99.creative.PlayerOverride;
import net.md_5.bungee.api.ChatColor;

public class StaffChat implements CommandExecutor {

	PlayerOverride po;
	CreativeCore core;
	String Message = "";

	@Override
	public boolean onCommand(CommandSender s, Command cmd, String label, String[] args) {
		Player p = (Player) s;
		if (args.length < 1) {
			s.sendMessage(ChatColor.RED + "Usage /Staff <Message>");
			return true;
		}
		String s1 = core.StringArrayToString(args);
		// po.sendToAllStaff(p.getDisplayName() + Message);
		for (String Player2 : po.Staff) {

			Player p2 = Bukkit.getPlayer(Player2);
			p2.sendMessage(CreativeCore.PrefixStaff + "" + p.getDisplayName() + "" + s1);
			System.out.println(CreativeCore.PrefixStaff + "" + p.getDisplayName() + "" + s1);
		}
		return true;

	}

}
