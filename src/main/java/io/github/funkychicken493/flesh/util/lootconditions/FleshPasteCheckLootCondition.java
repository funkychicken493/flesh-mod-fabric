package io.github.funkychicken493.flesh.util.lootconditions;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.condition.LootConditionType;
import net.minecraft.loot.condition.LootConditionTypes;
import net.minecraft.loot.context.LootContext;
import net.minecraft.util.JsonHelper;
import net.minecraft.util.JsonSerializer;

import static io.github.funkychicken493.flesh.init.InitEverything.SHOULD_DROP_FLESH_PASTE;
import static io.github.funkychicken493.flesh.util.FleshUtils.lootContextHasGamerule;

public record FleshPasteCheckLootCondition() implements LootCondition {

    //Implementation method:
    //Returns the LootConditionType for this LootCondition
    public LootConditionType getType() {
        return LootConditionTypes.VALUE_CHECK;
    }

    //Implementation method:
    //Tests the LootCondition
    public boolean test(LootContext lootContext) {
        return lootContextHasGamerule(lootContext, SHOULD_DROP_FLESH_PASTE);
    }

    //Implementation method:
    //Builds the LootCondition
    public static class Builder implements LootCondition.Builder {
        public Builder() {}
        public FleshPasteCheckLootCondition build() {
            return new FleshPasteCheckLootCondition();
        }
    }

    //Implementation method:
    //Serializes the LootCondition
    //Unused, but required by LootCondition
    @SuppressWarnings("unused")
    public static class Serializer implements JsonSerializer<FleshPasteCheckLootCondition> {
        public void toJson(JsonObject jsonObject, FleshPasteCheckLootCondition fleshPasteCheckLootCondition, JsonSerializationContext jsonSerializationContext) {
            jsonObject.addProperty("drop", false);
        }

        public FleshPasteCheckLootCondition fromJson(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
            Boolean drop = jsonObject.has("drop") ? JsonHelper.getBoolean(jsonObject, "drop") : null;
            return new FleshPasteCheckLootCondition();
        }
    }
}