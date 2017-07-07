package me.morgancentral99.creative.utils;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import me.morgancentral99.creative.CreativeCore;
import me.morgancentral99.creative.PlayerOverride;

public class Restarter {
	
	int Timer;
	int TaskID;
	int TaskID2;
	CreativeCore instance;
	PlayerOverride po;
	String Mode;
	
	public void startTimer() {
		TaskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(instance, new Runnable() {
			
			@Override
			public void run() {
				Timer++;
				if(Timer == 42900) {
					startRestartTime(1);
					Bukkit.getScheduler().cancelTask(TaskID);
				}
				
			}

			
		}, 0, 20);
	}
	
	public void startRestartTime(int i) {

		String Restarting = "Restarting";
		String shuttingdown = "Shutting Down";

		if(i == 0) {
			Mode = Restarting;
		} else if(i == 1) {
			Mode = shuttingdown;
		}
		Timer = 300;
		TaskID2 = Bukkit.getScheduler().scheduleSyncRepeatingTask(instance, new Runnable() {
			
			@Override
			public void run() {
				Bukkit.broadcastMessage(CreativeCore.format(instance.prefix + "Server Restarting in 5 Minutes!"));
				Timer --;
				if(Timer == 60) {
					Bukkit.broadcastMessage(CreativeCore.format(instance.prefix + "Server " + Mode + " in 1 Minutes!"));
				} else if(Timer == 30) {
					Bukkit.broadcastMessage(CreativeCore.format(instance.prefix + "Server " + Mode + " in 30 seconds"));
				} else if(Timer == 10) {
					Bukkit.broadcastMessage(CreativeCore.format(instance.prefix + "Server " + Mode + " in 10 seconds"));
				} else if(Timer == 6) {
					Bukkit.broadcastMessage(CreativeCore.format(instance.prefix + "Server " + Mode + " in 5 seconds"));
				} else if(Timer == 5) {
					Bukkit.broadcastMessage(CreativeCore.format(instance.prefix + "Server " + Mode + " in 4 seconds"));
				} else if(Timer == 4) {
					Bukkit.broadcastMessage(CreativeCore.format(instance.prefix + "Server " + Mode + " in 3 seconds"));
				} else if(Timer == 3) {
					Bukkit.broadcastMessage(CreativeCore.format(instance.prefix + "Server " + Mode + " in 2 seconds"));
				} else if(Timer == 2) {
					Bukkit.broadcastMessage(CreativeCore.format(instance.prefix + "Server " + Mode + " in 1 second"));
				} else if(Timer == 1) {
					Bukkit.broadcastMessage(CreativeCore.format(instance.prefix + "Server " + Mode + "!!!"));
					po.kickAllPlayers("&6Server " + Mode);
					if(Mode.equalsIgnoreCase("Restarting")) {
						Bukkit.spigot().restart();
					} else if(Mode.equalsIgnoreCase("shuttingdown")) {
						Bukkit.shutdown();
					}
				}
			} 
		}, 0, 20);
		
	}

}
