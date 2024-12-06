package net.mo.tutorialmod.block;

import com.mojang.serialization.MapCodec;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.mo.tutorialmod.TutorialMod;
import net.mo.tutorialmod.block.custom.MagicBlock;
import net.mo.tutorialmod.block.custom.PinkGarnetLampBlock;
import net.mo.tutorialmod.sound.ModSounds;

public class ModBlocks {

    public static final Block PINK_GARNET_BLOCK = registerBlock("pink_garnet_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final  Block RAW_PINK_GARNET_BLOCK = registerBlock("raw_pink_garnet_block",
            new Block(AbstractBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final  Block PINK_GARNET_ORE = registerBlock("pink_garnet_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3f).requiresTool()));
    public static final Block PINK_GARNET_DEEPSLATE_ORE = registerBlock("pink_garnet_deepslate_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block MAGIC_BLOCK = registerBlock("magic_block",
            new MagicBlock(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(ModSounds.MAGIC_BLOCK_SOUNDS)));

    public static final Block PINK_GARNET_STAIRS = registerBlock("pink_garnet_stairs",
            new StairsBlock(ModBlocks.PINK_GARNET_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block PINK_GARNET_SLAB = registerBlock("pink_garnet_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));


 public static final Block PINK_GARNET_BUTTON = registerBlock("pink_garnet_button",
            new ButtonBlock(BlockSetType.IRON, 10, AbstractBlock.Settings.create().strength(2f).requiresTool().noCollision()));
    public static final Block PINK_GARNET_PRESSURE_PLATE = registerBlock("pink_garnet_pressure_plate",
            new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(2f).requiresTool()));


 public static final Block PINK_GARNET_FENCE = registerBlock("pink_garnet_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block PINK_GARNET_FENCE_GATE = registerBlock("pink_garnet_fence_gate",
            new FenceGateBlock(WoodType.ACACIA,
                    AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block PINK_GARNET_WALL = registerBlock("pink_garnet_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));


    public static final Block PINK_GARNET_DOOR = registerBlock("pink_garnet_door",
            new DoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(2f).requiresTool().nonOpaque()));
    public static final Block PINK_GARNET_TRAPDOOR = registerBlock("pink_garnet_trapdoor",
            new TrapdoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(2f).requiresTool().nonOpaque()));


    public static final Block PINK_GARNET_LAMP =registerBlock("pink_garnet_lamp",
            new PinkGarnetLampBlock(AbstractBlock.Settings.create().strength(1f).requiresTool().luminance(state -> state.get(PinkGarnetLampBlock.CLICKED) ? 15 : 5)));
    public static final Block LUCKY_BLOCK = registerBlock("lucky_block",
            new Block(AbstractBlock.Settings.create().strength(1f)
            ));


    public static final Block DAMN = registerBlock("damn",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block DAMN32 = registerBlock("damn32",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block DAMN64 = registerBlock("damn64",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block DAMN128 = registerBlock("damn128",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block DAMN256 = registerBlock("damn256",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block DAMN512 = registerBlock("damn512",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block DAMN5122 = registerBlock("damn5122",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool()));


    public static final Block ASAD = registerBlock("asad",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.INTENTIONALLY_EMPTY)));
    public static final Block HUZI = registerBlock("huzi",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block SAAD = registerBlock("saad",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block SAHAJ = registerBlock("sahaj",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block GANG = registerBlock("gang",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block HAFI = registerBlock("hafi",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block HAFI1 = registerBlock("hafi1",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block HAFI2 = registerBlock("hafi2",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block MALEEHA = registerBlock("maleeha",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block MALEEHA2 = registerBlock("maleeha2",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block MALEEHA3 = registerBlock("maleeha3",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block ARHAM = registerBlock("arham",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block ARHAM2 = registerBlock("arham2",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block PRABH = registerBlock("prabh",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block MAZIA = registerBlock("mazia",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block MAZIA2 = registerBlock("mazia2",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block MAZIA3 = registerBlock("mazia3",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block MAZIA4 = registerBlock("mazia4",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block JANI = registerBlock("jani",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool()));


    public static final Block MOAIZ = registerBlock("moaiz",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block MOAIZ2 = registerBlock("moaiz2",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block MOAIZ3 = registerBlock("moaiz3",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block MOAIZ4 = registerBlock("moaiz4",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block MAZIA5 = registerBlock("moaiz5",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool()));


            public static final Block MO = registerBlock("mo",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block MOBUZZ = registerBlock("mobuzz",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block MOHOT = registerBlock("mohot",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block FATPHAM = registerBlock("fatpham",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block OWAIS = registerBlock("owais",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block TAHA = registerBlock("taha",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block MOHAYDEN = registerBlock("mohayden",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool()));


    public static final Block SOHAIB = registerBlock("sohaib",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block EBADTAHA = registerBlock("ebadtaha",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block MO_CHEST = registerBlock("mo_chest",

            new ChestBlock(
                    AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(2.5F).sounds(BlockSoundGroup.WOOD).burnable(),
                    () -> BlockEntityType.CHEST
            ));

       


    private  static  Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return  Registry.register(Registries.BLOCK, Identifier.of(TutorialMod.MOD_ID, name), block);
    }


    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));

    }

    public  static  void  registerModBlocks(){

        TutorialMod.LOGGER.info("Registering Mod Blocks for" + TutorialMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {fabricItemGroupEntries.add(ModBlocks.PINK_GARNET_BLOCK);
            fabricItemGroupEntries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);
        });

    }
}
