package io.github.thebusybiscuit.slimefun4.core.attributes;

import io.github.thebusybiscuit.slimefun4.implementation.items.misc.BasicCircuitBoard;
import io.github.thebusybiscuit.slimefun4.implementation.listeners.MobDropListener;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDeathEvent;

/**
 * This interface, when attached to a {@link SlimefunItem}, provides an easy method for adding
 * a % chance to drop for an {@link SlimefunItem} on {@link EntityDeathEvent}, this chance is 0-100
 * and used in conjunction with the MOB_DROP {@link RecipeType}.
 *
 * @author dNiym
 * @see BasicCircuitBoard
 * @see MobDropListener
 */
@FunctionalInterface
public interface RandomMobDrop extends ItemAttribute {

    /**
     * Implement this method to make the object have a variable chance of being
     * added to the dropList when {@link EntityType} (specified in the recipe)
     * is killed by the {@link Player}
     *
     * @return The integer chance (0-100%) {@link SlimefunItem} has to drop.
     */
    int getMobDropChance();

}