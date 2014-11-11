package me.silentkill;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ExpireCommand implements CommandExecutor {
	ChatColor D_RED = ChatColor.DARK_RED;

	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String Label, String[] args) {
		Player killer = (Player) sender;
		String usage = D_RED + "/Expire <Player>";
		String permission = D_RED+ "It doesn't look like you've got permission to do that!";
		int length = args.length;
		if (cmd.getName().equalsIgnoreCase("expire")) {
			if (killer.hasPermission("silentkill.expire")) {
				if (length == 0) {
					killer.sendMessage(usage);
					return true;
				}else if (length == 1) {
					Player victim = Bukkit.getServer().getPlayer(args[0]);
					victim.setHealth(0);			
						}
					} else 
						killer.sendMessage(permission);
					}
				
		return false;
	}
	

}
