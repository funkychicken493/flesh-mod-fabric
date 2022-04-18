package funky.fleshmod;

import funky.fleshmod.block.FleshBlock;
import funky.fleshmod.block.FleshBlockSlab;
import funky.fleshmod.item.FleshPaste;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Array;
import java.util.AbstractList;

public class Flesh implements ModInitializer {
	// initialize logger provided by slf4j
	public static final Logger LOGGER = LoggerFactory.getLogger("flesh");

	private static final FleshBlock FLESH_BLOCK = new FleshBlock();
	private static final FleshBlockSlab FLESH_BLOCK_SLAB = new FleshBlockSlab();
	private static final FleshPaste FLESH_PASTE = new FleshPaste();

	private static final BlockItem FLESH_BLOCK_ITEM = new BlockItem(FLESH_BLOCK, new FabricItemSettings());
	private static final BlockItem FLESH_BLOCK_SLAB_ITEM = new BlockItem(FLESH_BLOCK_SLAB, new FabricItemSettings());

	public static final ItemGroup FLESH_GROUP_ITEMS = FabricItemGroupBuilder.create(
			new Identifier("flesh", "items"))
			.icon(() -> new ItemStack(FLESH_PASTE))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(FLESH_PASTE));
			})
			.build();

	public static final ItemGroup FLESH_GROUP_BLOCKS = FabricItemGroupBuilder.create(
			new Identifier("flesh", "blocks"))
			.icon(() -> new ItemStack(FLESH_BLOCK_ITEM))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(FLESH_BLOCK_ITEM));
			})
			.build();

	@Override
	public void onInitialize() {

		// I'd like to make it known that GitHub Copilot generated this code.
		LOGGER.info("Flesh is flesh. Where there's smoke there's fire.");

		Registry.register(Registry.BLOCK, new Identifier("flesh", "flesh_block"), FLESH_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("flesh", "flesh_block"), FLESH_BLOCK_ITEM);
		Registry.register(Registry.BLOCK, new Identifier("flesh", "flesh_block_slab"), FLESH_BLOCK_SLAB);
		Registry.register(Registry.ITEM, new Identifier("flesh", "flesh_block_slab"), FLESH_BLOCK_SLAB_ITEM);

		Registry.register(Registry.ITEM, new Identifier("flesh", "flesh_paste"), FLESH_PASTE);

	}
}
