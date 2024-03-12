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
}
