package org.bkl.bklcore.gameplay;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class NoTreePunching implements Listener {
    @EventHandler
    public void onNoTreePunching(BlockBreakEvent event) {
        Player player = event.getPlayer();
        if (event.getBlock().getType().equals(Material.OAK_LOG)) {
            event.setCancelled(true);
            player.sendMessage("OAK-LOG Disable");
        }
    }
}
