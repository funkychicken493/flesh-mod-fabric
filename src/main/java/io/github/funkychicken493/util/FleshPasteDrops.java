package io.github.funkychicken493.util;

import net.minecraft.entity.EntityType;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public class FleshPasteDrops {
    @Contract(" -> new")
    public static Identifier @NotNull [] getFleshPasteDrops(){

        return new Identifier[]{
                EntityType.ZOMBIE.getLootTableId(),
                EntityType.ZOMBIE_VILLAGER.getLootTableId(),
                EntityType.HUSK.getLootTableId(),
                EntityType.WITCH.getLootTableId(),
                EntityType.ZOMBIFIED_PIGLIN.getLootTableId(),
                EntityType.PHANTOM.getLootTableId(),
                EntityType.DROWNED.getLootTableId(),
                EntityType.EVOKER.getLootTableId(),
                EntityType.VINDICATOR.getLootTableId(),
                EntityType.SHULKER.getLootTableId(),
                EntityType.PARROT.getLootTableId(),
                EntityType.PUFFERFISH.getLootTableId(),
                EntityType.DROWNED.getLootTableId(),
                EntityType.WANDERING_TRADER.getLootTableId(),
                EntityType.ENDER_DRAGON.getLootTableId(),
                EntityType.GUARDIAN.getLootTableId(),
                EntityType.ELDER_GUARDIAN.getLootTableId(),
                EntityType.PIG.getLootTableId(),
                EntityType.PIGLIN.getLootTableId(),
                EntityType.PIGLIN_BRUTE.getLootTableId(),
                EntityType.PILLAGER.getLootTableId(),
                EntityType.RAVAGER.getLootTableId(),
                EntityType.STRIDER.getLootTableId(),
                EntityType.VILLAGER.getLootTableId(),
                EntityType.COW.getLootTableId(),
                EntityType.HORSE.getLootTableId(),
                EntityType.DONKEY.getLootTableId(),
                EntityType.LLAMA.getLootTableId(),
                EntityType.MULE.getLootTableId(),
                EntityType.PANDA.getLootTableId(),
                EntityType.PARROT.getLootTableId(),
                EntityType.CHICKEN.getLootTableId(),
                EntityType.COD.getLootTableId(),
                EntityType.SALMON.getLootTableId(),
                EntityType.TROPICAL_FISH.getLootTableId()
        };

    }
}
