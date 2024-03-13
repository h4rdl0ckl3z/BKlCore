package org.bkl.bklcore.Items;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import static org.bukkit.Bukkit.getServer;

public class Test {
    public static void TestItems() {
        ItemStack sword = new ItemStack( Material.DIAMOND_SWORD );
        ItemMeta im = sword.getItemMeta();
        im.setDisplayName( "Emerald Sword" );
        sword.setItemMeta( im );
        sword.addEnchantment( Enchantment.DAMAGE_ALL, 5 );
        ShapedRecipe recipe = new ShapedRecipe( sword );
        recipe.shape( " E ", " E ", " S " );
        recipe.setIngredient( 'E', Material.EMERALD );
        recipe.setIngredient( 'S', Material.STICK );
        getServer().addRecipe( recipe );
    }

    public static void FlintAxe() {
        ItemStack axe = new ItemStack(Material.WOODEN_AXE);
        ItemMeta im = axe.getItemMeta();
        im.setDisplayName("Flint Axe");
        axe.setItemMeta(im);
        ShapedRecipe recipe = new ShapedRecipe(axe);
        recipe.shape("EE ", " S ");
        recipe.setIngredient('E', Material.FLINT);
        recipe.setIngredient('S', Material.STICK);
        getServer().addRecipe(recipe);
    }
}
