package io.github.funkychicken493.flesh.util.lootconditions;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import io.github.funkychicken493.flesh.init.InitEverything;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.condition.LootConditionType;
import net.minecraft.loot.condition.LootConditionTypes;
import net.minecraft.loot.context.LootContext;
import net.minecraft.util.JsonHelper;
import net.minecraft.util.JsonSerializer;

import static io.github.funkychicken493.flesh.util.FleshUtils.lootContextHasGamerule;

public record BoneMarrowCheckLootCondition() implements LootCondition {

    //Implementation method:
    //Returns the LootConditionType for this LootCondition
    public LootConditionType getType() {
        return LootConditionTypes.VALUE_CHECK;
    }

    //Implementation method:
    //Tests the LootCondition
    public boolean test(LootContext lootContext) {
        return lootContextHasGamerule(lootContext, InitEverything.FleshGameRules.SHOULD_DROP_BONE_MARROW);
    }

    //Implementation method:
    //Builds the LootCondition
    public static class Builder implements LootCondition.Builder {
        public Builder() {}
        public BoneMarrowCheckLootCondition build() {
            return new BoneMarrowCheckLootCondition();
        }
    }

    //Implementation method:
    //Serializes the LootCondition
    //Unused, but required by LootCondition
    @SuppressWarnings("unused")
    public static class Serializer implements JsonSerializer<BoneMarrowCheckLootCondition> {
        public Serializer() {}

        public void toJson(JsonObject jsonObject, BoneMarrowCheckLootCondition boneMarrowCheckLootCondition, JsonSerializationContext jsonSerializationContext) {
            jsonObject.addProperty("drop", false);
        }

        public BoneMarrowCheckLootCondition fromJson(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
            Boolean drop = jsonObject.has("drop") ? JsonHelper.getBoolean(jsonObject, "drop") : null;
            return new BoneMarrowCheckLootCondition();
        }
    }
}
