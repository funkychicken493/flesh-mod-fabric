package io.github.funkychicken493.flesh.init;

import io.github.funkychicken493.flesh.item.BoneMarrow;
import io.github.funkychicken493.flesh.item.FleshBrick;
import io.github.funkychicken493.flesh.item.FleshPaste;
import net.minecraft.item.Item;

import static io.github.funkychicken493.flesh.init.InitEverything.FLESH_GROUP_ITEMS;
import static io.github.funkychicken493.flesh.item.base.ItemBase.ITEM_BASE;

public class FleshItems {
    //Initialize variables holding the items
    public static final Item FLESH_PASTE = new FleshPaste(ITEM_BASE.group(FLESH_GROUP_ITEMS));
    public static final Item FLESH_BRICK = new FleshBrick(ITEM_BASE.group(FLESH_GROUP_ITEMS));
    public static final Item BONE_MARROW = new BoneMarrow(ITEM_BASE.group(FLESH_GROUP_ITEMS));

    public static void FleshItemsInit(){
        FleshBlocks.registerItem(FLESH_PASTE, "flesh_paste");
        FleshBlocks.registerItem(FLESH_BRICK, "flesh_brick");
        FleshBlocks.registerItem(BONE_MARROW, "bone_marrow");
    }
}
