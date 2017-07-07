package me.morgancentral99.creative;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.Difficulty;
import org.bukkit.GameMode;
import org.bukkit.World;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import me.morgancentral99.creative.commands.Admin;
import me.morgancentral99.creative.commands.DiscordCommand;
import me.morgancentral99.creative.commands.Restarter;
import me.morgancentral99.creative.commands.StaffChat;
import me.morgancentral99.creative.commands.Version;
import me.morgancentral99.creative.listeners.AsyncChat;
import net.md_5.bungee.api.ChatColor;

public class CreativeCore extends JavaPlugin {
	
	Logger log = Bukkit.getLogger();
	PluginManager pm = Bukkit.getPluginManager();
	World w;
	public String prefix = "&9Extreme Minecraft &e>>&f ";
	static String Prefix = "&9Extreme Minecraft &e>>&f ";
	public String staffPrefix = "&b&0[&4Staff&0]&f ";
	public static String PrefixStaff = "&b&0[&4Staff&0]&f ";
	@Override
	public void onEnable() {
		registerCommands();
		registerListeners();
		log.info("Creative Core Loaded!");
		startOfServer();
	}
	
	private void startOfServer() {
		Bukkit.setDefaultGameMode(GameMode.CREATIVE);
		Bukkit.getServer().setSpawnRadius(50);
		w = Bukkit.getWorld("MainWorld2");
		w.setDifficulty(Difficulty.PEACEFUL);
		
	}

	private void registerListeners() {
		pm.registerEvents(new AsyncChat(), this);
	}

	private void registerCommands() {
		getCommand("author").setExecutor(new Version());
		getCommand("Discord").setExecutor(new DiscordCommand());
		getCommand("Restart").setExecutor(new Restarter());
		getCommand("Stop").setExecutor(new Restarter());
		getCommand("Staff").setExecutor(new StaffChat());
		getCommand("Admin").setExecutor(new Admin());
	}

	@Override
	public void onDisable() {
		
		
	}
	public static String getPrefix() {
		return Prefix;
	}
	public static String getStaffPrefix() {
		return PrefixStaff;
	}
	public static String format(String s) {
		return ChatColor.translateAlternateColorCodes('&', s);
	}
	public String StringArrayToString(String[] s) {
		String myString = ""; // we're going to store the arguments here

		for (int i = 0; i < s.length; i++) { // loop threw all the
												// arguments
			String arg = s[i] + " "; // get the argument, and add a space
										// so that the words get spaced out
			myString = myString + arg; // add the argument to myString
		}
		System.out.println(myString);
		return myString;
	}

}
