package org.bkl.bklcore.gameplay;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class NoTreePunching implements Listener {
    @EventHandler
    public void onNoTreePunching(BlockBreakEvent blockBreakEvent) {
        if (blockBreakEvent.getBlock().getType().equals(Material.OAK_LOG)) {
            blockBreakEvent.setCancelled(true);

        }
    }
}
