package me.silentkill;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ExpireCommand implements CommandExecutor {
	ChatColor D_RED = ChatColor.DARK_RED;

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String Label, String[] args) {
		Player killer = (Player) sender;
		String usage = D_RED + "/Expire <Player>";
		int length = args.length;
		if (cmd.getName().equalsIgnoreCase("expire")) {
			if (killer.hasPermission("silentkill.expire")) {
				if (length == 0) {
					killer.sendMessage(usage);
				}
			}
		}
		return false;
	}
	

}
