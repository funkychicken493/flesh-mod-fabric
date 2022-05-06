package io.github.funkychicken493.flesh.init;

import io.github.funkychicken493.flesh.Flesh;
import io.github.funkychicken493.flesh.util.lootconditions.FleshPasteCheckLootCondition;
import io.github.funkychicken493.flesh.util.lootconditions.BoneMarrowCheckLootCondition;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleFactory;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleRegistry;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.item.ItemGroup;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.resource.ResourceType;
import net.minecraft.util.Identifier;
import net.minecraft.world.GameRules;

import java.io.File;
import java.io.FileWriter;

import static io.github.funkychicken493.flesh.Flesh.ModInfo.LOGGER;
import static io.github.funkychicken493.flesh.init.FleshBlocks.FLESH_BLOCK_ITEM;
import static io.github.funkychicken493.flesh.init.FleshBlocks.FleshBlocksInit;
import static io.github.funkychicken493.flesh.init.FleshGroupBuilder.BuildItemGroups;
import static io.github.funkychicken493.flesh.init.FleshItems.*;
import static io.github.funkychicken493.flesh.util.FleshUtils.AIR;
import static io.github.funkychicken493.flesh.util.FleshUtils.DropRegistry.boneMarrowDroppers;
import static io.github.funkychicken493.flesh.util.FleshUtils.DropRegistry.fleshPasteDroppers;

//Class to initialize everything (items, blocks, etc.)
//This is where the magic happens
public class InitEverything {
    //Put the game rules here for public access
    public static class FleshGameRules{
        //Game rule for the flesh paste loot table condition
        public static final GameRules.Key<GameRules.BooleanRule> SHOULD_DROP_BONE_MARROW =
                GameRuleRegistry.register("mobsDropBoneMarrow", GameRules.Category.DROPS, GameRuleFactory.createBooleanRule(true));
        //Game rule for the bone marrow loot table condition
        public static final GameRules.Key<GameRules.BooleanRule> SHOULD_DROP_FLESH_PASTE =
                GameRuleRegistry.register("mobsDropFleshPaste", GameRules.Category.DROPS, GameRuleFactory.createBooleanRule(true));
    }

    public static void EverythingInit() {
        try {
            //Initialize the blocks
            FleshBlocksInit();
        } catch (Exception e) {
            LOGGER.error("FAILURE INITIALIZING BLOCKS");
            throw new RuntimeException(e);
        }

        try {
            //Initialize the items
            FleshItemsInit();
        } catch (Exception e) {
            LOGGER.error("FAILURE INITIALIZING ITEMS");
            throw new RuntimeException(e);
        }

        try {
            //Initialize the item groups and ignore the unused
            @SuppressWarnings("unused")
            ItemGroup[] fleshItemGroups = BuildItemGroups();
        } catch (Exception e) {
            LOGGER.error("FAILURE INITIALIZING ITEM GROUPS");
            throw new RuntimeException(e);
        }

        try {
            //Initialize the loot tables
            LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
                FabricLootPoolBuilder fleshPastePoolBuilder = FabricLootPoolBuilder.builder()
                        //Loot table will roll 3 times
                        .rolls(ConstantLootNumberProvider.create(3))
                        //The default item is AIR item (no item)
                        .with(ItemEntry.builder(AIR).weight(90));
                FabricLootPoolBuilder boneMarrowPoolBuilder = FabricLootPoolBuilder.builder()
                        //Loot table will roll 3 times
                        .rolls(ConstantLootNumberProvider.create(3))
                        //The default item is AIR item (no item)
                        .with(ItemEntry.builder(AIR).weight(90));
                //Check if the entity is "fleshy"
                for (Identifier identifier : fleshPasteDroppers()) {
                    if (identifier.equals(id)) {
                        //Add the flesh paste item to the loot table
                        fleshPastePoolBuilder.with(ItemEntry.builder(FLESH_PASTE).weight(30));
                        //Add the flesh paste block to the loot table
                        fleshPastePoolBuilder.with(ItemEntry.builder(FLESH_BLOCK_ITEM).weight(2));
                        fleshPastePoolBuilder.withCondition(new FleshPasteCheckLootCondition());
                    }
                }
                //Check if the entity is skeletal
                for (Identifier identifier : boneMarrowDroppers()) {
                    if(identifier.equals(id)) {
                        //Add the bone marrow item to the loot table
                        boneMarrowPoolBuilder.with(ItemEntry.builder(BONE_MARROW).weight(40));
                        boneMarrowPoolBuilder.withCondition(new BoneMarrowCheckLootCondition());
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

        try {
            //Initialize the splashes
            //
            //Get the system file separator
            String s = File.separator;
            //Get vanilla splashes
            String splashes = new String(MinecraftClient.getInstance().getResourcePackProvider().getPack().open(ResourceType.CLIENT_RESOURCES, new Identifier("texts/splashes.txt")).readAllBytes());
            //Find where the mod is at the moment
            String path = Flesh.class.getProtectionDomain().getCodeSource().getLocation()
                    .toURI().getPath().replaceAll(s + "build" + s + "classes"  + s + "java"  + s + "main", "");
            //Combine the paths
            String pathfull = path + "src" + s + "main" + s + "resources" + s + "assets" + s + "minecraft" + s + "texts" + s + "splashes.txt";
            //Notify the user that we are replacing the vanilla splash
            LOGGER.info("Writing splash text to " + pathfull + " ...");
            //Grab the file at the full path
            File f = new File(pathfull);
            //Create the file if it doesn't exist
            if (f.createNewFile()) {
                LOGGER.info("File didn't exist, so we made it: " + f.getName());
            } else {
                LOGGER.info("File already exists, so we'll work with\n " +
                        "that instead of making a new one: " + f.getName());
            }
            //Init the file writer
            FileWriter fw = new FileWriter(f.getAbsoluteFile());
            //Write in the vanilla splash texts
            fw.write(splashes);
            //Add my awful splash texts
            fw.append("""
					Now with 30% more flesh!
					Make a meat castle!
					Flesh paste!!!!
					Bone marrow!!!!
					It's a fleshy world!
					Flesh is flesh. Where there's smoke there's fire.
					the end is never the end is never the end is never the end
					funky fresh
					funky flesh
					Flesh belongs on pizza!
					It's an awful world!
					My reasoning? Flesh!
					100% bone free!
					squishy!
					Now without glowing flesh paste slabs!
					Flesh paste will NOT give you hunger!
					Rotten flesh is better than no flesh!
					Flesh from the dead!
					Try cooking flesh paste blocks!
					Flesh paste is the best paste!
					Literally 1984!
					Flesh exists for a reason!
					Lambs for the metaphorical slaughter!
					You are a fleshy human!
					Flesh is the best!
					Bring me THE FLESH!
					Skinless!
					Meatloaf but replace the meat with flesh!
					Flesh is kind of the same as meat I guess.
					Bone marrow + flesh paste = flesh marrow?
					"""
            );
            //Close the file (very important)
            fw.close();
        } catch (Exception e) {
            LOGGER.error("FAILURE INITIALIZING SPLASHES");
            throw new RuntimeException(e);
        }

        //Hooray!
    }
}
