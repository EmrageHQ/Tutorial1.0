package me.gamerpvg.tutorial.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;


public class TestCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Player player = (Player) sender;          //erstellt eine Variable Spieler
        player.sendMessage(ChatColor.GOLD + "Dies ist ein Test!");          //schreibe eine Nachricht
        return false;
    }
}
