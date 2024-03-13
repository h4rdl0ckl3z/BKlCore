package org.bkl.bklcore.Items;

import org.bkl.bklcore.BKlCore;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class CustomRecipe {
    public static void init() {
        FlintAxe();
    }
    public static void FlintAxe() {
        ItemManager.init();

        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(JavaPlugin.getPlugin(BKlCore.class), "Flint-Axe"), ItemManager.getFlintaxe());
        recipe.shape("EE", "S ");
        recipe.shape("EE", " S");
        recipe.setIngredient('E', Material.FLINT);
        recipe.setIngredient('S', Material.STICK);

        Bukkit.addRecipe(recipe);
    }
}
