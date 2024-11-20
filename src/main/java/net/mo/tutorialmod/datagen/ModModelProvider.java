package net.mo.tutorialmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.minecraft.item.ArmorItem;
import net.minecraft.util.Identifier;
import net.mo.tutorialmod.block.ModBlocks;
import net.mo.tutorialmod.block.custom.PinkGarnetLampBlock;
import net.mo.tutorialmod.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
    BlockStateModelGenerator.BlockTexturePool pinkgarnetpool =blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PINK_GARNET_BLOCK);
    blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_PINK_GARNET_BLOCK);
    blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAGIC_BLOCK);
    blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_GARNET_DEEPSLATE_ORE);
    blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_GARNET_ORE);
    blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LUCKY_BLOCK);
    blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DAMN);
    blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DAMN32);
    blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DAMN64);
    blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DAMN128);
    blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DAMN256);
    blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DAMN512);
    blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DAMN5122);
    blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ASAD);
    blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SAAD);
    blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SAHAJ);
    blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HUZI);
    blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GANG);



    pinkgarnetpool.stairs(ModBlocks.PINK_GARNET_STAIRS);
    pinkgarnetpool.slab(ModBlocks.PINK_GARNET_SLAB);

    pinkgarnetpool.button(ModBlocks.PINK_GARNET_BUTTON);
    pinkgarnetpool.pressurePlate(ModBlocks.PINK_GARNET_PRESSURE_PLATE);

    pinkgarnetpool.fence(ModBlocks.PINK_GARNET_FENCE);
    pinkgarnetpool.fenceGate(ModBlocks.PINK_GARNET_FENCE_GATE);
    pinkgarnetpool.wall(ModBlocks.PINK_GARNET_WALL);

    blockStateModelGenerator.registerDoor(ModBlocks.PINK_GARNET_DOOR);
    blockStateModelGenerator.registerTrapdoor(ModBlocks.PINK_GARNET_TRAPDOOR);

    Identifier lampOffIdentifier = TexturedModel.CUBE_ALL.upload(ModBlocks.PINK_GARNET_LAMP, blockStateModelGenerator.modelCollector);
    Identifier lampOnIdentifier = blockStateModelGenerator.createSubModel(ModBlocks.PINK_GARNET_LAMP, "_on", Models.CUBE_ALL, TextureMap::all);
    blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.PINK_GARNET_LAMP)
                .coordinate(BlockStateModelGenerator.createBooleanModelMap(PinkGarnetLampBlock.CLICKED, lampOnIdentifier, lampOffIdentifier)));

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.PINK_GARNET, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_PINK_GARNET, Models.GENERATED);
        itemModelGenerator.register(ModItems.CAULIFLOWER, Models.GENERATED);
        //itemModelGenerator.register(ModItems.CHISEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.SOCKSSOCK, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ZACHATTACK, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STARLIGHT_ASHES, Models.GENERATED);

        itemModelGenerator.register(ModItems.PINK_GARNET_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PINK_GARNET_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PINK_GARNET_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PINK_GARNET_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.LAVYA_SWORD, Models.HANDHELD);

        itemModelGenerator.register(ModItems.PINK_GARNET_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PINK_GARNET_HAMMER, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PINK_GARNET_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PINK_GARNET_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PINK_GARNET_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PINK_GARNET_CHESTPLATE));
        itemModelGenerator.register(ModItems.PINK_GARNET_HORSE_ARMOR, Models.GENERATED);

        itemModelGenerator.register(ModItems.KABIRA_MUSIC_DISC, Models.GENERATED);


    }
}
