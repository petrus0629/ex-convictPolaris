package convict.convict;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class Convict extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;

        String playerName = p.getPlayerListName();
        if (command.getName().equalsIgnoreCase("전과조회")) {
            p.sendMessage("작동성공");
            p.sendMessage("");
            p.sendMessage(playerName);


        }

        return true;
        /* if(args.length != 2){
            Player p = (Player) sender;
            if(command.getName().equalsIgnoreCase("전과조회")){
                p.sendMessage(ChatColor.BOLD + "====================");
                p.sendMessage("<폴라리스 전과 시스템>");
                p.sendMessage("EX) /전과조회 <닉네임>");
                p.sendMessage(ChatColor.BOLD + "====================");
            }
        }

        String assault = "폭행";
        String kill = "살인";
        String playername;
        Player p = Bukkit.getPlayer(playername);

        return true;*/

    }
}
