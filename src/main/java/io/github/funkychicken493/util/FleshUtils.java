package io.github.funkychicken493.util;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Stack;

import static io.github.funkychicken493.init.FleshBlocks.*;
import static io.github.funkychicken493.init.FleshItems.FLESH_BRICK;
import static io.github.funkychicken493.init.FleshItems.FLESH_PASTE;

//Utility class for Flesh
public class FleshUtils {
    public static class FleshPasteDrops {

        //Init the stack that holds the droppers of flesh paste
        public static Stack<Identifier> fleshPasteDroppers = new Stack<>();
        public static Stack<Identifier> fleshPasteDroppersBlackList = new Stack<>();
        public static String[] fleshPasteDroppersExclusionNames = {
                "skeleton",
                "iron"
        };

        @Contract(" -> new")
        public static Identifier @NotNull [] getFleshPasteDroppers() {
            for (EntityType<?> entityType : Registry.ENTITY_TYPE) {
                if (checkFleshDropperEntityType(entityType)) {
                addToFleshPasteDroppers(entityType.getLootTableId());
                }
            }
            //Return the dropper list converted to an array
            //I'm honestly not sure why I don't just return the list directly
            return fleshPasteDroppers.toArray(new Identifier[0]);
        }

        //This *should* allow other mod authors to add their own droppers to the list
        //and remove them from the list if they want to.
        public static void addToFleshPasteDroppers(Identifier identifier) {
            fleshPasteDroppers.add(identifier);
        }
        @SuppressWarnings("unused")
        public static void removeFromFleshPasteDroppers(Identifier identifier) {
            fleshPasteDroppers.remove(identifier);
            fleshPasteDroppersBlackList.add(identifier);
        }
        @SuppressWarnings("unused")
        public static void removeFromFleshPasteDroppers(EntityType<?> entityType){
            removeFromFleshPasteDroppers(entityType.getLootTableId());
        }

        private static boolean checkFleshDropperEntityType(EntityType<?> entityType) {
            return entityType.getSpawnGroup() != SpawnGroup.MISC &&
                    !nameContains(entityType, fleshPasteDroppersExclusionNames) &&
                    !fleshPasteDroppers.contains(entityType.getLootTableId()) &&
                    !fleshPasteDroppersBlackList.contains(entityType.getLootTableId()
            );
        }

        private static boolean nameContains(EntityType<?> entityType, String string) {
            return entityType.getUntranslatedName().toLowerCase(Locale.ROOT).contains(string);
        }

        private static boolean nameContains(EntityType<?> entityType, String[] strings) {
            for (String string : strings) {
                if (nameContains(entityType, string)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static class ItemGroupBuilder {
        //Simple method to build an item group with FabricItemGroupBuilder
        private static ItemGroup buildItemGroup(String path, ItemStack icon, ArrayList<ItemStack> items) {
            return FabricItemGroupBuilder.create(
                    new Identifier(io.github.funkychicken493.Flesh.MOD_ID, path))
                    .icon(() -> icon)
                    .appendItems(stacks -> stacks.addAll(items))
                    .build();
        }

        //Builds the item group for the items
        private static final ItemGroup FLESH_GROUP_ITEMS = buildItemGroup(
                "items", new ItemStack(FLESH_PASTE),
                new ArrayList<>() {{
                    add(new ItemStack(FLESH_PASTE));
                    add(new ItemStack(FLESH_BRICK));
                }}
        );

        //Builds the item group for the blocks
        private static final ItemGroup FLESH_GROUP_BLOCKS = buildItemGroup(
                "blocks", new ItemStack(FLESH_BLOCK_ITEM),
                new ArrayList<>() {{
                    add(new ItemStack(FLESH_BLOCK_ITEM));
                    add(new ItemStack(FLESH_BLOCK_SLAB_ITEM));
                    add(new ItemStack(FLESH_BLOCK_STAIRS_ITEM));
                    add(new ItemStack(FLESH_BLOCK_WALL_ITEM));
                    add(new ItemStack(FLESH_LANTERN_ITEM));
                    add(new ItemStack(FLESH_BRICK_BLOCK_ITEM));
                    add(new ItemStack(FLESH_BRICK_BLOCK_SLAB_ITEM));
                    add(new ItemStack(FLESH_BRICK_BLOCK_STAIRS_ITEM));
                    add(new ItemStack(FLESH_BRICK_BLOCK_WALL_ITEM));
                    add(new ItemStack(HARDENED_FLESH_BLOCK_ITEM));
                    add(new ItemStack(HARDENED_FLESH_BLOCK_SLAB_ITEM));
                    add(new ItemStack(HARDENED_FLESH_BLOCK_STAIRS_ITEM));
                    add(new ItemStack(HARDENED_FLESH_BLOCK_WALL_ITEM));
                }}
        );

        //Builds the item groups for the blocks and items and returns them
        public static ItemGroup[] buildItemGroups(){
            return new ItemGroup[]{FLESH_GROUP_ITEMS, FLESH_GROUP_BLOCKS};
        }
    }
}
