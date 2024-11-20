package net.mo.tutorialmod.effect;

import net.minecraft.entity.Entity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.mo.tutorialmod.TutorialMod;

public class ModEffects {
    public static final RegistryEntry<StatusEffect> SLIMEY = registerStatusEffect("slimey",
            new SlimeyEffect(StatusEffectCategory.NEUTRAL, 0x36ebab).addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED,
                    Identifier.of(TutorialMod.MOD_ID, "slimey"), -0.25f,
            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
public static final RegistryEntry<StatusEffect> DEPRESSION = registerStatusEffect("depression",
            new DepressionEffect(StatusEffectCategory.NEUTRAL, 0x36ebab).addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED,
                    Identifier.of(TutorialMod.MOD_ID, "slimey"), -0.95f,
            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));


   private static RegistryEntry<StatusEffect> registerStatusEffect(String name, StatusEffect statusEffect){
       return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(TutorialMod.MOD_ID, name), statusEffect);
   }

    public static void registerEffects(){
        TutorialMod.LOGGER.info("Registering Mod Effects"+ TutorialMod.MOD_ID);
    }
}
