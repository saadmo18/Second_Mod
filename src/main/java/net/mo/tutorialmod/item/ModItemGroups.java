package net.mo.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.mo.tutorialmod.TutorialMod;
import net.mo.tutorialmod.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup PINK_GARNET_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "pink_garnet_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.PINK_GARNET_BLOCK))
                    .displayName(Text.translatable("itemgroup.tutorialmod.pink_garnet_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.PINK_GARNET_ORE);


                        entries.add(ModBlocks.PINK_GARNET_STAIRS);
                        entries.add(ModBlocks.PINK_GARNET_SLAB);

                        entries.add(ModBlocks.PINK_GARNET_BUTTON);
                        entries.add(ModBlocks.PINK_GARNET_PRESSURE_PLATE);

                        entries.add(ModBlocks.PINK_GARNET_FENCE);
                        entries.add(ModBlocks.PINK_GARNET_WALL);
                        entries.add(ModBlocks.PINK_GARNET_FENCE_GATE);

                        entries.add(ModBlocks.PINK_GARNET_DOOR);
                        entries.add(ModBlocks.PINK_GARNET_TRAPDOOR);
                        entries.add(ModBlocks.PINK_GARNET_LAMP);

                        entries.add(ModItems.PINK_GARNET);
                        entries.add(ModItems.RAW_PINK_GARNET);

                        entries.add(ModItems.PINK_GARNET_HELMET);
                        entries.add(ModItems.PINK_GARNET_BOOTS);
                        entries.add(ModItems.PINK_GARNET_LEGGINGS);
                        entries.add(ModItems.PINK_GARNET_CHESTPLATE);
                        entries.add(ModItems.PINK_GARNET_HORSE_ARMOR);


                    }).build());

 public static final ItemGroup MAGIC_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "magic_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.CHISEL))
                    .displayName(Text.translatable("itemgroup.tutorialmod.magic_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.CHISEL);
                        entries.add(ModBlocks.MAGIC_BLOCK);
                        entries.add(ModItems.STARLIGHT_ASHES);
                        entries.add(ModItems.CAULIFLOWER);
                        entries.add(ModItems.ZACHATTACK);
                        entries.add(ModItems.SOCKSSOCK);
                        entries.add(ModItems.LAVYA_SWORD);
                        entries.add(ModItems.PINK_GARNET_HOE);
                        entries.add(ModItems.PINK_GARNET_AXE);
                        entries.add(ModItems.PINK_GARNET_SHOVEL);
                        entries.add(ModItems.PINK_GARNET_SWORD);
                        entries.add(ModItems.PINK_GARNET_PICKAXE );
                        entries.add(ModItems.PINK_GARNET_HAMMER );
                        entries.add(ModBlocks.LUCKY_BLOCK);
                        entries.add(ModItems.MO_BOW);

                    }).build());
 public static final ItemGroup PICTURES = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "pictures"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.DAMN128))
                    .displayName(Text.translatable("itemgroup.tutorialmod.pictures"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.DAMN);
                        entries.add(ModBlocks.DAMN32);
                        entries.add(ModBlocks.DAMN64);
                        entries.add(ModBlocks.DAMN128);
                        entries.add(ModBlocks.DAMN256);
                        entries.add(ModBlocks.DAMN512);
                        entries.add(ModBlocks.DAMN5122);
                        entries.add(ModBlocks.SAAD);
                        entries.add(ModBlocks.ASAD);
                        entries.add(ModBlocks.SAHAJ);
                        entries.add(ModBlocks.HUZI);
                        entries.add(ModBlocks.GANG);

                    }).build());
 public static final ItemGroup MUSIC = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "music"),
            FabricItemGroup.builder().icon(() -> new ItemStack(Items.MUSIC_DISC_5))
                    .displayName(Text.translatable("itemgroup.tutorialmod.music"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.KABIRA_MUSIC_DISC);


                    }).build());


    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Registering Item Groups for" + TutorialMod.MOD_ID);


    }
}
