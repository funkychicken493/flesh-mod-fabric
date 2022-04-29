package io.github.funkychicken493.util;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Locale;
import java.util.Stack;

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

}
