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
        Material[] axe = {
                Material.DIAMOND_AXE,
                Material.IRON_AXE,
                Material.STONE_AXE,
                Material.NETHERITE_AXE
        };
        Material[] log = {
                Material.OAK_LOG,
                Material.SPRUCE_LOG,
                Material.BIRCH_LOG,
                Material.JUNGLE_LOG,
                Material.ACACIA_LOG,
                Material.DARK_OAK_LOG,
                Material.MANGROVE_LOG,
                Material.CHERRY_LOG,
                Material.STRIPPED_SPRUCE_LOG,
                Material.STRIPPED_OAK_LOG,
                Material.STRIPPED_JUNGLE_LOG,
                Material.STRIPPED_DARK_OAK_LOG,
                Material.STRIPPED_CHERRY_LOG,
                Material.STRIPPED_BIRCH_LOG,
                Material.STRIPPED_ACACIA_LOG,
                Material.STRIPPED_MANGROVE_LOG
        };
//        if (player.getInventory().getItemInMainHand().getType().equals(Material.DIAMOND_AXE)) {
//            event.setCancelled(false);
//        } else if (event.getBlock().getType().equals(Material.OAK_LOG)) {
//            event.setCancelled(true);
//            player.sendMessage(String.valueOf(Material.OAK_LOG));
//        }
        for (int i = 0; i < log.length; i++) {
            if (event.getBlock().getType().equals(log[i])) {
                event.setCancelled(true);
                player.damage(0.5);
                player.sendMessage(String.valueOf(log[i]));
            } else {
                for (int j = 0; j < axe.length; j++) {
                    if (player.getInventory().getItemInMainHand().getType().equals(axe[j])) {
                        event.setCancelled(false);
                    }
                }
            }
        }
    }
}
