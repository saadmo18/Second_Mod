package net.mo.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.datafixer.fix.HorseArmorFix;
import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.mo.tutorialmod.TutorialMod;
import net.mo.tutorialmod.block.custom.MagicBlock;
import net.mo.tutorialmod.block.custom.MoBow;
import net.mo.tutorialmod.entity.ModEntities;
import net.mo.tutorialmod.item.custom.ChiselItem;
import net.mo.tutorialmod.item.custom.HammerItem;
import net.mo.tutorialmod.item.custom.ModArmorItem;
import net.mo.tutorialmod.sound.ModSounds;

import java.util.List;

import static net.minecraft.item.Items.register;

public class ModItems {
    public  static  final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));
    public  static  final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet", new Item(new Item.Settings()));
    public  static  final Item SOCKSSOCK = registerItem("socks_sock", new Item(new Item.Settings().maxDamage(69)));
    public  static  final Item ZACHATTACK = registerItem("zach_attack", new Item(new Item.Settings()));
    public static final Item LAVYA_SWORD = registerItem("lavya_sword", new SwordItem(ModToolMaterials.PINK_GARNET,
            new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.PINK_GARNET, 6, 3))));

    public  static  final  Item CHISEL = registerItem("chisel", new ChiselItem(new Item.Settings().maxDamage(32)));

    public static  final Item CAULIFLOWER = registerItem("cauliflower", new Item(new Item.Settings().food(ModFoodComponents.CAULIFLOWER)){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.tutorialmod.cauliflower"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });


    public  static  final  Item STARLIGHT_ASHES =registerItem("starlight_ashes", new Item(new Item.Settings()));

    public static final Item PINK_GARNET_SWORD = registerItem("pink_garnet_sword", new SwordItem(ModToolMaterials.PINK_GARNET,
            new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.PINK_GARNET, 8, -2.4f))
    ));
    public static final Item SEHS_SNUN_SWORD = registerItem("sehs_snun_sword", new SwordItem(ModToolMaterials.PINK_GARNET,
            new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.PINK_GARNET, 8, -2.4f))
    ));public static final Item PINK_GARNET_SHOVEL = registerItem("pink_garnet_shovel", new ShovelItem(ModToolMaterials.PINK_GARNET,
            new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.PINK_GARNET, 3, 4f))
    ));public static final Item PINK_GARNET_PICKAXE = registerItem("pink_garnet_pickaxe", new PickaxeItem(ModToolMaterials.PINK_GARNET,
            new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.PINK_GARNET, 7, 4f))
    ));public static final Item PINK_GARNET_HOE = registerItem("pink_garnet_hoe", new HoeItem(ModToolMaterials.PINK_GARNET,
            new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.PINK_GARNET, 2, 6f))
    ));public static final Item PINK_GARNET_AXE = registerItem("pink_garnet_axe", new AxeItem(ModToolMaterials.PINK_GARNET,
            new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.PINK_GARNET, 6, 7f))
    ));


    public static final Item PINK_GARNET_HAMMER = registerItem("pink_garnet_hammer", new HammerItem(ModToolMaterials.PINK_GARNET,
            new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.PINK_GARNET, 7, 3f))));

    public static final Item PINK_GARNET_BOOTS = registerItem("pink_garnet_boots",
            new ArmorItem(ModArmorMaterials.PINK_GARNET_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(39))));
    public static final Item PINK_GARNET_CHESTPLATE = registerItem("pink_garnet_chestplate",
            new ArmorItem(ModArmorMaterials.PINK_GARNET_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(39))));
    public static final Item PINK_GARNET_LEGGINGS = registerItem("pink_garnet_leggings",
            new ArmorItem(ModArmorMaterials.PINK_GARNET_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(39))));
    public static final Item PINK_GARNET_HELMET = registerItem("pink_garnet_helmet",
            new ModArmorItem(ModArmorMaterials.PINK_GARNET_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(39))));

    public static final Item PINK_GARNET_HORSE_ARMOR = registerItem("pink_garnet_horse_armor",
            new AnimalArmorItem(ModArmorMaterials.PINK_GARNET_ARMOR_MATERIAL, AnimalArmorItem.Type.EQUESTRIAN, false, new Item.Settings().maxCount(1)));

    public static final Item MO_BOW = registerItem("mo_bow",
            new MoBow(new Item.Settings().maxDamage(5000)));
    public static final Item KABIRA_MUSIC_DISC = registerItem("kabira_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.KABIRA_KEY).maxCount(1)));
    public static final Item PORCUPINE_SPAWN_EGG = registerItem("porcupine_spawn_egg",
            new SpawnEggItem(ModEntities.PORCUPINE, 0xa86518, 0x3b260f, new Item.Settings()));
    public static final Item TEST_SPAWN_EGG = registerItem("test_spawn_egg",
            new SpawnEggItem(ModEntities.TEST, 16499171, 10890612, new Item.Settings()));
    public static final Item BLUESHEEP_SPAWN_EGG = registerItem("bluesheep_spawn_egg",
            new SpawnEggItem(ModEntities.BLUESHEEP, 0xa86518, 0x3b260f, new Item.Settings()));






    private  static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(SOCKSSOCK);

        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ZACHATTACK);

        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(CHISEL);

        });
ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(MO_BOW);

        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(RAW_PINK_GARNET);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(LAVYA_SWORD);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(PINK_GARNET);
        });



    }
}
