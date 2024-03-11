package org.bkl.bklcore.gamerule;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityRegainHealthEvent;

public class NaturalRegeneration implements Listener {
    @EventHandler
    public void onNaturalRegeneration(EntityRegainHealthEvent event) {
        if(event.getRegainReason() == EntityRegainHealthEvent.RegainReason.SATIATED || event.getRegainReason() == EntityRegainHealthEvent.RegainReason.REGEN)
            event.setCancelled(true);
    }
}
