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
//        if (event.getBlock().getType().equals(Material.OAK_LOG)) {
//            event.setCancelled(true);
//            player.sendMessage("OAK-LOG Disable");
//        }
//        if (player.getInventory().getItemInMainHand().getType().equals(Material.DIAMOND_AXE)) {
//            event.setCancelled(false);
//        }
        Material[] log = {
                Material.OAK_LOG,
                Material.SPRUCE_LOG,
                Material.BIRCH_LOG,
                Material.JUNGLE_LOG,
                Material.ACACIA_LOG,
                Material.DARK_OAK_LOG,
                Material.MANGROVE_LOG,
                Material.CHERRY_LOG
        };
        for (int i = 0; i < log.length; i++) {
            if (player.getInventory().getItemInMainHand().getType().equals(Material.DIAMOND_AXE)) {
                event.setCancelled(false);
            } else if (event.getBlock().getType().equals(log[i])) {
                event.setCancelled(true);
                player.sendMessage(String.valueOf(log[i]));
            }
        }
    }
}
