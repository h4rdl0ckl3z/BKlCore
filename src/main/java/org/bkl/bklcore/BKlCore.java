package org.bkl.bklcore;

import org.bkl.bklcore.Items.CustomRecipe;
import org.bkl.bklcore.gameplay.FarmProtection;
import org.bkl.bklcore.gameplay.NoTreePunching;
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
        Items();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Disable Plugin");
    }

    public void Command() {
    }
    public void GamePlay() {
        getServer().getPluginManager().registerEvents( new PlayerEvent(), this);
        getServer().getPluginManager().registerEvents( new FarmProtection(), this);
        getServer().getPluginManager().registerEvents( new NoTreePunching(), this);
    }
    public void GameRule() {
//        getServer().getPluginManager().registerEvents( new NaturalRegeneration(), this);
    }

    public void Items() {
        CustomRecipe.init();
    }
}
