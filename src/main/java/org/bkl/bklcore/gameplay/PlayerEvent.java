package org.bkl.bklcore.gameplay;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerEvent implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
//        event.setJoinMessage(ChatColor.YELLOW + player.getName() + "joined the game");
//        player.getInventory().addItem(new ItemStack(Material.APPLE, 1));
        if (player.hasPlayedBefore()) {
            event.setJoinMessage(ChatColor.YELLOW + player.getName() + " joined the game");
        } else {
            event.setJoinMessage(ChatColor.GREEN + player.getName() + " joined the game");
//            Material[] material = {
//                    Material.STONE_SWORD, Material.STONE_AXE, Material.STONE_PICKAXE, Material.STONE_SHOVEL,
//                    Material.LEATHER_HELMET, Material.LEATHER_CHESTPLATE, Material.LEATHER_LEGGINGS, Material.LEATHER_BOOTS,
//                    Material.CAMPFIRE
//            };
//            for (int i = 0; i < material.length; i++) {
//                player.getInventory().addItem(new ItemStack(material[i], 1));
//            }
//            player.getInventory().addItem(new ItemStack(Material.BREAD, 32));
        }
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        event.setQuitMessage(ChatColor.RED + player.getName() + " left the game");
    }
}
