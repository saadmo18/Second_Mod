package net.mo.tutorialmod.potion;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.mo.tutorialmod.TutorialMod;
import net.mo.tutorialmod.effect.ModEffects;

import java.util.Map;

public class ModPotions {

    public static final RegistryEntry<Potion> SLIMEY_POTION = registerPotion("slimey_potion",
            new Potion(new StatusEffectInstance(ModEffects.SLIMEY, 1200,0)));
    public static final RegistryEntry<Potion> DEPRESSION_POTION = registerPotion("depression_potion",
            new Potion(new StatusEffectInstance(ModEffects.DEPRESSION, 1200,0)));

    private static RegistryEntry<Potion> registerPotion(String name, Potion potion){
        return Registry.registerReference(Registries.POTION, Identifier.of(TutorialMod.MOD_ID, name), potion);
    }

    public static void registerPotions(){
        TutorialMod.LOGGER.info("Registering for mod potions" + TutorialMod.MOD_ID);

    }
}
