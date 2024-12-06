package net.mo.tutorialmod.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityType;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.mo.tutorialmod.TutorialMod;
import net.mo.tutorialmod.entity.custom.PorcupineEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.mo.tutorialmod.entity.custom.TestEntity;
import net.mo.tutorialmod.entity.custom.bluesheepEntity;

public class ModEntities {
    public static final EntityType<PorcupineEntity> PORCUPINE = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(TutorialMod.MOD_ID, "porcupine"),
            EntityType.Builder.create(PorcupineEntity::new, SpawnGroup.CREATURE).dimensions(1f, 1f).build()
    );
    public static final EntityType<bluesheepEntity> BLUESHEEP = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(TutorialMod.MOD_ID, "bluesheep"),
            EntityType.Builder.create(bluesheepEntity::new, SpawnGroup.CREATURE).dimensions(1f, 1f).build()
    );
    public static final EntityType<TestEntity> TEST = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(TutorialMod.MOD_ID, "test"),
            EntityType.Builder.create(TestEntity::new, SpawnGroup.CREATURE).dimensions(1f, 1f).build()
    );


    public static void registerModEntities() {
        TutorialMod.LOGGER.info("Registering Entities for " + TutorialMod.MOD_ID);
    }
}