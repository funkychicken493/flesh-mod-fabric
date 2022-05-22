package io.github.funkychicken493.flesh.init;

import io.github.funkychicken493.flesh.util.lootconditions.BoneMarrowCheckLootCondition;
import io.github.funkychicken493.flesh.util.lootconditions.FleshPasteCheckLootCondition;
import io.github.funkychicken493.flesh.util.lootconditions.NotBonyCheckLootCondition;
import io.github.funkychicken493.flesh.util.lootconditions.NotFleshyCheckLootCondition;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleFactory;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleRegistry;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;
import net.minecraft.world.GameRules;

import static io.github.funkychicken493.flesh.Flesh.ModInfo.LOGGER;
import static io.github.funkychicken493.flesh.init.FleshBlocks.FLESH_BLOCK_ITEM;
import static io.github.funkychicken493.flesh.init.FleshBlocks.initFleshBlocks;
import static io.github.funkychicken493.flesh.init.FleshItems.*;
import static io.github.funkychicken493.flesh.util.FleshUtils.DropRegistry.boneMarrowDroppers;
import static io.github.funkychicken493.flesh.util.FleshUtils.DropRegistry.fleshPasteDroppers;

/**
 * The type Initialization.
 */
//Class to initialize everything (items, blocks, etc.)
//This is where the magic happens
public class Initialization {
    /**
     * The constant FLESH_GROUP_ITEMS.
     */
    public static final ItemGroup FLESH_GROUP_ITEMS = FabricItemGroupBuilder.create(new Identifier("flesh", "items"))
            .icon(() -> new ItemStack(FLESH_PASTE))
            .build();
    /**
     * The constant FLESH_GROUP_BLOCKS.
     */
    public static final ItemGroup FLESH_GROUP_BLOCKS = FabricItemGroupBuilder.create(new Identifier("flesh", "blocks"))
            .icon(() -> new ItemStack(FLESH_BLOCK_ITEM))
            .build();
    /**
     * The game rule SHOULD_DROP_BONE_MARROW.
     */
//Put the game rules here for public access:
    //Game rule for the flesh paste loot table condition
    public static final GameRules.Key<GameRules.BooleanRule> SHOULD_DROP_BONE_MARROW =
            GameRuleRegistry.register("mobsDropBoneMarrow", GameRules.Category.DROPS, GameRuleFactory.createBooleanRule(true));
    /**
     * The game rule SHOULD_DROP_FLESH_PASTE.
     */
//Game rule for the bone marrow loot table condition
    public static final GameRules.Key<GameRules.BooleanRule> SHOULD_DROP_FLESH_PASTE =
            GameRuleRegistry.register("mobsDropFleshPaste", GameRules.Category.DROPS, GameRuleFactory.createBooleanRule(true));

    /**
     * Initialize everything needed for the mod.
     */
    public static void everything() {

        initFleshItems();

        initFleshBlocks();

        try {
            //Initialize the loot tables
            LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
                FabricLootPoolBuilder fleshPastePoolBuilder = FabricLootPoolBuilder.builder()
                        //Loot table will roll 3 times
                        .rolls(ConstantLootNumberProvider.create(3))
                        //The default item is AIR item (no item)
                        .with(ItemEntry.builder(Items.AIR).weight(90));
                FabricLootPoolBuilder boneMarrowPoolBuilder = FabricLootPoolBuilder.builder()
                        //Loot table will roll 3 times
                        .rolls(ConstantLootNumberProvider.create(3))
                        //The default item is AIR item (no item)
                        .with(ItemEntry.builder(Items.AIR).weight(90));
                //Check if the entity is "fleshy"
                for (Identifier identifier : fleshPasteDroppers()) {
                    if (identifier.equals(id)) {
                        //Add the flesh paste item to the loot table
                        fleshPastePoolBuilder.with(ItemEntry.builder(FLESH_PASTE).weight(30));
                        //Add the flesh paste block to the loot table
                        fleshPastePoolBuilder.with(ItemEntry.builder(FLESH_BLOCK_ITEM).weight(2));
                        fleshPastePoolBuilder.withCondition(new FleshPasteCheckLootCondition());
                        fleshPastePoolBuilder.withCondition(new NotFleshyCheckLootCondition());
                    }
                }
                //Check if the entity is skeletal
                for (Identifier identifier : boneMarrowDroppers()) {
                    if (identifier.equals(id)) {
                        //Add the bone marrow item to the loot table
                        boneMarrowPoolBuilder.with(ItemEntry.builder(BONE_MARROW).weight(40));
                        boneMarrowPoolBuilder.withCondition(new BoneMarrowCheckLootCondition());
                        boneMarrowPoolBuilder.withCondition(new NotBonyCheckLootCondition());
                    }
                }
                //Build the loot table
                table.pool(fleshPastePoolBuilder);
                table.pool(boneMarrowPoolBuilder);
            });
        } catch (Exception e) {
            LOGGER.error("FAILURE INITIALIZING LOOT TABLES");
            throw new RuntimeException(e);
        }
    }

}
