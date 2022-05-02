package io.github.funkychicken493.util;

import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.DefaultedRegistry;
import net.minecraft.util.registry.Registry;

import java.util.Locale;
import java.util.Stack;

//Utility class for Flesh
public class FleshUtils {
    public static Item AIR = Blocks.AIR.asItem();
    public static class DropRegistry {
        public static Identifier [] DropFactory(Stack<Identifier> droppersInitializer,
                                                Stack<Identifier> droppersBlacklist,
                                                String[] droppersWhitelist,
                                                String[] droppersExclusionNames,
                                                Stack<SpawnGroup> droppersInvalidSpawnGroups,
                                                DefaultedRegistry<EntityType<?>> entityTypes
                                                ){
            Stack<Identifier> result = new Stack<>();

            if(droppersInitializer != null){
                result.addAll(droppersInitializer);
            }
            if(droppersBlacklist == null){
                droppersBlacklist = new Stack<>();
            }
            if(droppersInvalidSpawnGroups == null){
                droppersInvalidSpawnGroups = new Stack<>();
            }

            if(entityTypes != null) {
                for (EntityType<?> dropper : entityTypes) {
                    if (dropper.getLootTableId() != null &&
                            !droppersBlacklist.contains(dropper.getLootTableId()) &&
                            !nameContains(dropper, droppersExclusionNames) &&
                            (droppersWhitelist.length == 0 || nameContains(dropper, droppersWhitelist)) &&
                            (droppersInvalidSpawnGroups.isEmpty() || !droppersInvalidSpawnGroups.contains(dropper.getSpawnGroup()))
                    ) {
                        result.add(dropper.getLootTableId());
                    }
                }
            }

            return result.toArray(new Identifier[0]);
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

        public static Identifier [] fleshPasteDroppers(){
            return DropFactory(null,
                    null,
                    new String[]{},
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

        public static Identifier [] boneMarrowDroppers(){
            return DropFactory(null,
                    null,
                    new String[]{
                            "skeleton",
                            "phantom",
                            "wither",
                            "stray"
                    },
                    new String[]{},
                    null,
                    Registry.ENTITY_TYPE);
        }
    }
}
