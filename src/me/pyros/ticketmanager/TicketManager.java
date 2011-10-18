package me.pyros.ticketmanager;
import java.util.logging.Logger;
import org.bukkit.event.Event;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;


public class TicketManager extends JavaPlugin {
	Logger log = Logger.getLogger("Minecraft");
    private final TicketManagerPlayerListener playerListener = new TicketManagerPlayerListener();
	public void onEnable(){
		log.info("[INFO] TicketManager was enabled.");
		PluginManager pm = this.getServer().getPluginManager();
		pm.registerEvent(Event.Type.PLAYER_COMMAND_PREPROCESS, playerListener, Event.Priority.Normal, this);
    }
	public void onDisable(){ 
		log.info("[INFO] TicketManager was disabled.");
	}
}

