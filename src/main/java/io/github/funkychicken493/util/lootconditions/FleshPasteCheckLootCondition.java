package io.github.funkychicken493.util.lootconditions;

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
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

import static io.github.funkychicken493.init.InitializeEverything.SHOULD_DROP_FLESH_PASTE;

public record FleshPasteCheckLootCondition() implements LootCondition {
    public static final Boolean drop = false;

    public LootConditionType getType() {
        return LootConditionTypes.VALUE_CHECK;
    }

    public boolean test(LootContext lootContext) {
        //This looks beyond awful because it is.
        return Objects.requireNonNull(lootContext.get(LootContextParameters.THIS_ENTITY)).getWorld().getGameRules().copy().getBoolean(SHOULD_DROP_FLESH_PASTE);
    }

    public static FleshPasteCheckLootCondition.Builder create() {
        return new FleshPasteCheckLootCondition.Builder();
    }

    public static class Builder implements LootCondition.Builder {

        public Builder() {
        }

        public FleshPasteCheckLootCondition.Builder drop(@Nullable Boolean drop) {
            return this;
        }

        public FleshPasteCheckLootCondition build() {
            return new FleshPasteCheckLootCondition();
        }
    }

    public static class Serializer implements JsonSerializer<FleshPasteCheckLootCondition> {
        public Serializer() {
        }

        public void toJson(JsonObject jsonObject, FleshPasteCheckLootCondition fleshPasteCheckLootCondition, JsonSerializationContext jsonSerializationContext) {
            jsonObject.addProperty("drop", drop);
        }

        public FleshPasteCheckLootCondition fromJson(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
            Boolean drop = jsonObject.has("drop") ? JsonHelper.getBoolean(jsonObject, "drop") : null;
            return new FleshPasteCheckLootCondition();
        }
    }
}