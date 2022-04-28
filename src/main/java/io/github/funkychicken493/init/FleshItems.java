package io.github.funkychicken493.init;

import io.github.funkychicken493.item.FleshBrick;
import io.github.funkychicken493.item.FleshPaste;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static io.github.funkychicken493.Flesh.MOD_ID;

public class FleshItems {
    public static final FleshPaste FLESH_PASTE = new FleshPaste();
    public static final FleshBrick FLESH_BRICK = new FleshBrick();

    public static void FleshItemsInit(){
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flesh_paste"), FLESH_PASTE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flesh_brick"), FLESH_BRICK);
    }
}
