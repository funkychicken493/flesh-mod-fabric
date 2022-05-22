package io.github.funkychicken493.flesh.util.lootconditions;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import io.github.funkychicken493.flesh.init.Initialization;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.condition.LootConditionType;
import net.minecraft.loot.condition.LootConditionTypes;
import net.minecraft.loot.context.LootContext;
import net.minecraft.util.JsonHelper;
import net.minecraft.util.JsonSerializer;

import static io.github.funkychicken493.flesh.util.FleshUtils.lootContextHasGamerule;

/**
 * The type Bone marrow check loot condition.
 */
public record BoneMarrowCheckLootCondition() implements LootCondition {

    /**
     * @return LootConditionTypes.VALUE_CHECK
     */
    public LootConditionType getType() {
        return LootConditionTypes.VALUE_CHECK;
    }

    /**
     * @param lootContext LootContext
     * @return boolean
     */
    public boolean test(LootContext lootContext) {
        return lootContextHasGamerule(lootContext, Initialization.SHOULD_DROP_BONE_MARROW);
    }

    /**
     * The type Builder.
     */
    public static class Builder implements LootCondition.Builder {
        /**
         * Instantiates a new Builder.
         */
        public Builder() {
        }

        public BoneMarrowCheckLootCondition build() {
            return new BoneMarrowCheckLootCondition();
        }
    }

    /**
     * The type Serializer.
     */
    @SuppressWarnings("unused")
    public static class Serializer implements JsonSerializer<BoneMarrowCheckLootCondition> {
        /**
         * Instantiates a new Serializer.
         */
        public Serializer() {
        }

        public void toJson(JsonObject jsonObject, BoneMarrowCheckLootCondition boneMarrowCheckLootCondition, JsonSerializationContext jsonSerializationContext) {
            jsonObject.addProperty("drop", false);
        }

        public BoneMarrowCheckLootCondition fromJson(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
            Boolean drop = jsonObject.has("drop") ? JsonHelper.getBoolean(jsonObject, "drop") : null;
            return new BoneMarrowCheckLootCondition();
        }
    }
}
