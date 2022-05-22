package io.github.funkychicken493.flesh.util.lootconditions;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.condition.LootConditionType;
import net.minecraft.loot.condition.LootConditionTypes;
import net.minecraft.loot.context.LootContext;
import net.minecraft.loot.context.LootContextParameters;
import net.minecraft.util.JsonHelper;
import net.minecraft.util.JsonSerializer;

import java.util.Objects;

import static io.github.funkychicken493.flesh.util.FleshUtils.NOT_BONY;

/**
 * The type Not bony check loot condition.
 */
public record NotBonyCheckLootCondition() implements LootCondition {

    //Implementation method:
    //Returns the LootConditionType for this LootCondition
    public LootConditionType getType() {
        return LootConditionTypes.VALUE_CHECK;
    }

    //Implementation method:
    //Tests the LootCondition
    public boolean test(LootContext lootContext) {
        try {
            return !Objects.requireNonNull(lootContext.get(LootContextParameters.THIS_ENTITY)).getType().isIn(NOT_BONY);
        } catch (NullPointerException e) {
            return true;
        }
    }

    /**
     * The type Builder.
     */
//Implementation method:
    //Builds the LootCondition
    public static class Builder implements LootCondition.Builder {
        /**
         * Instantiates a new Builder.
         */
        public Builder() {
        }

        public NotBonyCheckLootCondition build() {
            return new NotBonyCheckLootCondition();
        }
    }

    /**
     * The type Serializer.
     */
//Implementation method:
    //Serializes the LootCondition
    //Unused, but required by LootCondition
    @SuppressWarnings("unused")
    public static class Serializer implements JsonSerializer<NotBonyCheckLootCondition> {
        public void toJson(JsonObject jsonObject, NotBonyCheckLootCondition NotBonyCheckLootCondition, JsonSerializationContext jsonSerializationContext) {
            jsonObject.addProperty("drop", false);
        }

        public NotBonyCheckLootCondition fromJson(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
            Boolean drop = jsonObject.has("drop") ? JsonHelper.getBoolean(jsonObject, "drop") : null;
            return new NotBonyCheckLootCondition();
        }
    }
}
