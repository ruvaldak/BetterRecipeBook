package net.marshmallow.BetterRecipeBook.Mixins.Accessors;

import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.collection.DefaultedList;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.List;

@Mixin(PlayerInventory.class)
public interface PlayerInventoryAccessor {
    @Accessor("combinedInventory")
    List<DefaultedList<ItemStack>> getCombinedInventory();
}
