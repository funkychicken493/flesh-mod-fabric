package io.github.funkychicken493.flesh.util;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.context.LootContext;
import net.minecraft.loot.context.LootContextParameters;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.DefaultedRegistry;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.GameRules;

import java.util.Locale;
import java.util.Objects;
import java.util.Stack;

//Utility class for Flesh
public class FleshUtils {
    //Simple constant for an air item
    public static Item AIR = Items.AIR;
    public static class DropRegistry {
        public static Identifier [] DropFactory(
                Stack<Identifier> droppersInitializer,
                Stack<Identifier> droppersBlacklist,
                String[] droppersWhitelist,
                String[] droppersExclusionNames,
                Stack<SpawnGroup> droppersInvalidSpawnGroups,
                DefaultedRegistry<EntityType<?>> entityTypes
        ){
            //Initialize the result stack
            Stack<Identifier> result = new Stack<>();

            //Check if the initializer input is null
            if(droppersInitializer != null){
                //Add the initializer input to the result stack
                result.addAll(droppersInitializer);
            }
            //Check if the blacklist input is null
            if(droppersBlacklist == null){
                //Fix it to be a new stack
                droppersBlacklist = new Stack<>();
            }
            //Check if the spawn group blacklist input is null
            if(droppersInvalidSpawnGroups == null){
                //Fix it to be a new stack
                droppersInvalidSpawnGroups = new Stack<>();
            }

            //Check if the entity types registry is null, if not,
            //loop through the entity types
            if(entityTypes != null) {
                //foreach entity type as dropper
                for (EntityType<?> dropper : entityTypes) {
                    //Check for the following conditions:
                    //1. The dropper has a loot table
                    //2. The dropper is not in the blacklist
                    //3. The dropper name does not match the exclusion names
                    //4. The whitelist is empty or the dropper name matches the whitelist
                    //5. The invalid spawn groups is empty or the dropper spawn group is not in the invalid spawn groups
                    if (dropper.getLootTableId() != null &&
                            !droppersBlacklist.contains(dropper.getLootTableId()) &&
                            !nameContains(dropper, droppersExclusionNames) &&
                            (droppersWhitelist.length == 0 || nameContains(dropper, droppersWhitelist)) &&
                            (droppersInvalidSpawnGroups.isEmpty() || !droppersInvalidSpawnGroups.contains(dropper.getSpawnGroup()))
                    ) {
                        //If it passes the check, add the dropper to the result stack
                        result.add(dropper.getLootTableId());
                    }
                }
            }

            //Return the result stack as an array
            return result.toArray(new Identifier[0]);
        }

        //Simple function to check if a string in an entity name
        private static boolean nameContains(EntityType<?> entityType, String string) {
            return entityType.getUntranslatedName().toLowerCase(Locale.ROOT).contains(string);
        }

        //Simple function to loop through an array of strings for an entity name
        private static boolean nameContains(EntityType<?> entityType, String[] strings) {
            //foreach string in the array
            for (String string : strings) {
                //Check if the entity name contains the string
                if (nameContains(entityType, string)) {
                    return true;
                }
            }
            //If it doesn't contain any of the strings, return false
            return false;
        }

        //Initialize fleshPasteDroppers Identifier array
        public static Identifier [] fleshPasteDroppers(){
            return DropFactory(null,
                    null,
                    //Whitelist names
                    new String[]{},
                    //Blacklist names
                    new String[]{
                            "skeleton",
                            "stray",
                            "wither",
                            "slime",
                            "magma",
                            "phantom"
                    },
                    null,
                    Registry.ENTITY_TYPE);
        }

        //Initialize boneMarrowDroppers Identifier array
        public static Identifier [] boneMarrowDroppers(){
            return DropFactory(null,
                    null,
                    //Whitelist names
                    new String[]{
                            "skeleton",
                            "phantom",
                            "wither",
                            "stray"
                    },
                    //Blacklist names
                    new String[]{},
                    null,
                    Registry.ENTITY_TYPE);
        }
    }

    //Awful shit starts here, don't look to long it'll burn your eyes
    public static boolean lootContextHasGamerule(LootContext context, GameRules.Key<GameRules.BooleanRule> ruleKey) {
        return Objects.requireNonNull(context.get(LootContextParameters.THIS_ENTITY)).getWorld().getGameRules().copy().getBoolean(ruleKey);
    }
}
