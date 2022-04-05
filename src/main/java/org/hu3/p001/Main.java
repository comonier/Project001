package org.hu3.p001;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.hu3.p001.events.Eventos;


public final class Main extends JavaPlugin {

    public static Main plugin;

    @Override
    public void onEnable() {
        plugin=this;
        Bukkit.getConsoleSender().sendMessage("§7[§a+§7] §2Plugin: §bp001 §aIniciado§2!");
        registerEvents();
        registerCommands();
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("§7[§a+§7] §2Plugin: §bp001 §cDesligado§2!");
    }
    public void registerEvents(){
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new Eventos(), this);
    }
    public void registerCommands(){
    }
}
