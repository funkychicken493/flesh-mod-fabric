package io.github.funkychicken493.init;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import java.util.ArrayList;

import static io.github.funkychicken493.init.FleshBlocks.*;
import static io.github.funkychicken493.init.FleshItems.*;

public class FleshGroupBuilder {
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
                add(new ItemStack(BONE_MARROW));
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
                add(new ItemStack(HARDENED_FLESH_BRICK_BLOCK_ITEM));
                add(new ItemStack(HARDENED_FLESH_BRICK_BLOCK_SLAB_ITEM));
                add(new ItemStack(HARDENED_FLESH_BRICK_BLOCK_STAIRS_ITEM));
                add(new ItemStack(HARDENED_FLESH_BRICK_BLOCK_WALL_ITEM));
            }}
    );

    //Builds the item groups for the blocks and items and returns them
    public static ItemGroup[] BuildItemGroups() {
        return new ItemGroup[]{FLESH_GROUP_ITEMS, FLESH_GROUP_BLOCKS};
    }
}
