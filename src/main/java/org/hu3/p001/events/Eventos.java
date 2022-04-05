package org.hu3.p001.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class Eventos implements Listener {

    @EventHandler
    public void aoEntrar(PlayerJoinEvent e){
        Player p = e.getPlayer();
        e.joinMessage(null);
        Bukkit.broadcastMessage("§7[§a+§7]§r" + p.getName() + "§eentrou no servidor§7.");
    }
    @EventHandler
    public void aoSair(PlayerQuitEvent e){
        Player p = e.getPlayer();
        e.quitMessage(null);
        Bukkit.broadcastMessage("§7[§a+§7]§r" + p.getName() + "§esaiu do servidor§7.");
    }
}
