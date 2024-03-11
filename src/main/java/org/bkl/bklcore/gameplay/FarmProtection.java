package org.bkl.bklcore.gameplay;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityInteractEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.Objects;

public class FarmProtection implements Listener {
    @EventHandler
    public void onEntityInteract(EntityInteractEvent event) {
        Block block = event.getBlock();
        if(block.getType() == Material.FARMLAND) {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        if(event.getAction() == Action.PHYSICAL) {
            if(Objects.requireNonNull(event.getClickedBlock()).getType() == Material.FARMLAND) {
                event.setCancelled(true);
            }
        }
    }
}
