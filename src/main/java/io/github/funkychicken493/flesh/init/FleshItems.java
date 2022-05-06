package io.github.funkychicken493.flesh.init;

import io.github.funkychicken493.flesh.Flesh;
import io.github.funkychicken493.flesh.item.BoneMarrow;
import io.github.funkychicken493.flesh.item.FleshBrick;
import io.github.funkychicken493.flesh.item.FleshPaste;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static io.github.funkychicken493.flesh.item.base.ItemBase.ITEM_BASE;

public class FleshItems {
    //Initialize variables holding the items
    public static final Item FLESH_PASTE = new FleshPaste(ITEM_BASE);
    public static final Item FLESH_BRICK = new FleshBrick(ITEM_BASE);
    public static final Item BONE_MARROW = new BoneMarrow(ITEM_BASE);

    public static void FleshItemsInit(){
        Registry.register(Registry.ITEM, new Identifier(Flesh.ModInfo.MOD_ID, "flesh_paste"), FLESH_PASTE);
        Registry.register(Registry.ITEM, new Identifier(Flesh.ModInfo.MOD_ID, "flesh_brick"), FLESH_BRICK);
        Registry.register(Registry.ITEM, new Identifier(Flesh.ModInfo.MOD_ID, "bone_marrow"), BONE_MARROW);
    }
}
