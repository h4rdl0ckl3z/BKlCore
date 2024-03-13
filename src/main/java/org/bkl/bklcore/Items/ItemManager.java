package org.bkl.bklcore.Items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemManager {

    public static ItemStack flintaxe;

    public static ItemStack getFlintaxe() {
        return flintaxe;
    }

    public static void init() {
        FlintAxe();
    }
    public static void FlintAxe() {
        ItemStack item = new ItemStack(Material.WOODEN_AXE);

        // Custom meta
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.WHITE + "Flint Axe");
        List<String> lore = new ArrayList<>();
//        lore.add("Flint Axe");
        meta.setLore(lore);
        meta.setCustomModelData(1);

        item.setItemMeta(meta);
        flintaxe = item;
    }
}
