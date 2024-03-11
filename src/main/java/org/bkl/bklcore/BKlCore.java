package org.bkl.bklcore;

import org.bkl.bklcore.gameplay.FarmProtection;
import org.bkl.bklcore.gameplay.PlayerEvent;
//import org.bkl.bklcore.gamerule.NaturalRegeneration;
import org.bukkit.plugin.java.JavaPlugin;

public final class BKlCore extends JavaPlugin {

    @Override
    public void onLoad() {
        getLogger().info("Load Plugin");
    }

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Enable Plugin");
//        Command();
        GamePlay();
        GameRule();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public void Command() {
    }
    public void GamePlay() {
        getServer().getPluginManager().registerEvents( new PlayerEvent(), this);
        getServer().getPluginManager().registerEvents( new FarmProtection(), this);
    }
    public void GameRule() {
//        getServer().getPluginManager().registerEvents( new NaturalRegeneration(), this);
    }
}
