package net.mo.tutorialmod.util;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentLevelEntry;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.EnchantedBookItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradedItem;
import net.minecraft.village.VillagerProfession;
import net.mo.tutorialmod.enchantment.ModEnchantmentEffects;
import net.mo.tutorialmod.enchantment.ModEnchantments;
import net.mo.tutorialmod.item.ModItems;

public class ModCustomTrades {
    public static void registerCustomTrades(){
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 2),
                            new ItemStack(ModItems.KABIRA_MUSIC_DISC, 1),
                            6, 6, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(Items.DIRT, 2),
                            new ItemStack(ModItems.MO_BOW, 1),
                            6, 6, 0.05f));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 2,
                factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 2),
                    new ItemStack(ModItems.PINK_GARNET_HELMET, 1),
                    6, 6, 0.05f));
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 2),
                    new ItemStack(ModItems.PINK_GARNET_CHESTPLATE, 1),
                    6, 6, 0.05f));
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 2),
                    new ItemStack(ModItems.PINK_GARNET_LEGGINGS, 1),
                    6, 6, 0.05f));
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 2),
                    new ItemStack(ModItems.PINK_GARNET_BOOTS, 1),
                    6, 6, 0.05f));
                });
    }
}
