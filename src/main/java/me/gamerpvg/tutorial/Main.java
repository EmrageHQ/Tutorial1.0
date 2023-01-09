package me.gamerpvg.tutorial;

import me.gamerpvg.tutorial.commands.TestCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("test").setExecutor(new TestCommand());        //Command erstellen
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
