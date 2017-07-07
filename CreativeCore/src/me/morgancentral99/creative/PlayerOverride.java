package me.morgancentral99.creative;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import me.morgancentral99.creative.utils.Restarter;

public class PlayerOverride {
	/*
	 *
	 */
	
	public List<String> Staff;
	
	public Restarter restartUtils;
	public void kickPlayer(String s, Player p) {
		p.kickPlayer(CreativeCore.format(CreativeCore.Prefix + "&2Extreme Minecraft &6\n " +  s +" &2\n https://extrememinecraft2.enjin.com/"));
	}
	
	public void kickAllPlayers(String s) {
		for(Player p : Bukkit.getOnlinePlayers()) {
			p.kickPlayer(CreativeCore.format(CreativeCore.Prefix + "&2Extreme Minecraft &6\n " +  s +" &2\n https://extrememinecraft2.enjin.com/"));
		}
	}
	
	public void sendToAllStaff(String s) {
		for(String Player2 : Staff ) {
			
			Player p = Bukkit.getPlayer(Player2);
			p.sendMessage(CreativeCore.format(CreativeCore.PrefixStaff + s));
		}
	}
	
	public void addStaffMember(String uuid) {
		Staff.add(uuid);
	}

}
