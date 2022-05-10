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

import static io.github.funkychicken493.flesh.util.FleshUtils.NOT_FLESHY;

public record NotFleshyCheckLootCondition() implements LootCondition {

    //Implementation method:
    //Returns the LootConditionType for this LootCondition
    public LootConditionType getType() {
        return LootConditionTypes.VALUE_CHECK;
    }

    //Implementation method:
    //Tests the LootCondition
    public boolean test(LootContext lootContext) {
        try {
            return !Objects.requireNonNull(lootContext.get(LootContextParameters.THIS_ENTITY)).getType().isIn(NOT_FLESHY);
        } catch (NullPointerException e) {
            return true;
        }
    }

    //Implementation method:
    //Builds the LootCondition
    public static class Builder implements LootCondition.Builder {
        public Builder() {}
        public NotFleshyCheckLootCondition build() {
            return new NotFleshyCheckLootCondition();
        }
    }

    //Implementation method:
    //Serializes the LootCondition
    //Unused, but required by LootCondition
    @SuppressWarnings("unused")
    public static class Serializer implements JsonSerializer<NotFleshyCheckLootCondition> {
        public void toJson(JsonObject jsonObject, NotFleshyCheckLootCondition NotFleshyCheckLootCondition, JsonSerializationContext jsonSerializationContext) {
            jsonObject.addProperty("drop", false);
        }

        public NotFleshyCheckLootCondition fromJson(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
            Boolean drop = jsonObject.has("drop") ? JsonHelper.getBoolean(jsonObject, "drop") : null;
            return new NotFleshyCheckLootCondition();
        }
    }
}
