package net.mo.tutorialmod.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public  static  final FoodComponent CAULIFLOWER = new FoodComponent.Builder().nutrition(9).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 600, 4), 1f).statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1200, 4), 1f)
            .build();
}
