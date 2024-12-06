package net.mo.tutorialmod.entity.client;

import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import net.mo.tutorialmod.TutorialMod;

public class ModModelLayers {
    public static final EntityModelLayer PORCUPINE =
            new EntityModelLayer(Identifier.of(TutorialMod.MOD_ID, "porcupine"), "main");
    public static final EntityModelLayer TEST =
            new EntityModelLayer(Identifier.of(TutorialMod.MOD_ID, "test"), "main");
}
