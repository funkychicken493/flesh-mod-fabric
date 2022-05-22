package io.github.funkychicken493.flesh.init;

import io.github.funkychicken493.flesh.item.FleshBrick;
import io.github.funkychicken493.flesh.item.FleshPaste;
import net.minecraft.item.Item;

import static io.github.funkychicken493.flesh.init.Base.ITEM_BASE;

/**
 * The type Flesh items.
 */
public class FleshItems {
    /**
     * The constant FLESH_PASTE.
     */
//Initialize variables holding the items
    public static final Item FLESH_PASTE = new FleshPaste(ITEM_BASE);
    /**
     * The constant FLESH_BRICK.
     */
    public static final Item FLESH_BRICK = new FleshBrick(ITEM_BASE);
    /**
     * The constant BONE_MARROW.
     */
    public static final Item BONE_MARROW = new Item(ITEM_BASE);

    /**
     * Init flesh items.
     */
    public static void initFleshItems() {
        FleshBlocks.registerItem(FLESH_PASTE, "flesh_paste");
        FleshBlocks.registerItem(FLESH_BRICK, "flesh_brick");
        FleshBlocks.registerItem(BONE_MARROW, "bone_marrow");
    }
}
