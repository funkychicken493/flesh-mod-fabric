package io.github.funkychicken493.util.lootconditions;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.condition.LootConditionManager;
import net.minecraft.loot.condition.LootConditionType;
import net.minecraft.loot.condition.LootConditionTypes;
import net.minecraft.loot.context.LootContext;
import net.minecraft.loot.context.LootContextParameter;
import net.minecraft.loot.context.LootContextParameters;
import net.minecraft.util.JsonHelper;
import net.minecraft.util.JsonSerializer;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

import static io.github.funkychicken493.init.InitializeEverything.SHOULD_DROP_BONE_MARROW;

public record BoneMarrowCheckLootCondition() implements LootCondition {
    public static final Boolean drop = false;

    public LootConditionType getType() {
        return LootConditionTypes.VALUE_CHECK;
    }

    public boolean test(LootContext lootContext) {
        //This looks beyond awful because it is.
        return Objects.requireNonNull(lootContext.get(LootContextParameters.THIS_ENTITY)).getWorld().getGameRules().copy().getBoolean(SHOULD_DROP_BONE_MARROW);
    }

    public static BoneMarrowCheckLootCondition.Builder create() {
        return new BoneMarrowCheckLootCondition.Builder();
    }

    public static class Builder implements LootCondition.Builder {

        public Builder() {
        }

        public BoneMarrowCheckLootCondition.Builder drop(@Nullable Boolean drop) {
            return this;
        }

        public BoneMarrowCheckLootCondition build() {
            return new BoneMarrowCheckLootCondition();
        }
    }

    public static class Serializer implements JsonSerializer<BoneMarrowCheckLootCondition> {
        public Serializer() {
        }

        public void toJson(JsonObject jsonObject, BoneMarrowCheckLootCondition boneMarrowCheckLootCondition, JsonSerializationContext jsonSerializationContext) {
            jsonObject.addProperty("drop", drop);
        }

        public BoneMarrowCheckLootCondition fromJson(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
            Boolean drop = jsonObject.has("drop") ? JsonHelper.getBoolean(jsonObject, "drop") : null;
            return new BoneMarrowCheckLootCondition();
        }
    }
}
