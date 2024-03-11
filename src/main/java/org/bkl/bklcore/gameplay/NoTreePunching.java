package org.bkl.bklcore.gameplay;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class NoTreePunching implements Listener {
    @EventHandler
    public void onNoTreePunching(BlockBreakEvent event) {
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
        Player player = event.getPlayer();
        for (int i = 0; i < log.length; i++) {
            if (player.getInventory().getItemInMainHand().getType().equals(Material.STONE_AXE)) {
                event.setCancelled(false);
            } else if (player.getInventory().getItemInMainHand().getType().equals(Material.IRON_AXE)) {
                event.setCancelled(false);
            } else if (player.getInventory().getItemInMainHand().getType().equals(Material.DIAMOND_AXE)) {
                event.setCancelled(false);
            } else if (player.getInventory().getItemInMainHand().getType().equals(Material.NETHERITE_AXE)) {
                event.setCancelled(false);
            } else if (event.getBlock().getType().equals(log[i])) {
                event.setCancelled(true);
                player.sendMessage(String.valueOf(log[i]));
                player.damage(0.5);
            }
        }
    }
}
