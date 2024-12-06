package net.mo.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.fabricmc.fabric.api.networking.v1.S2CPlayChannelEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Identifier;
import net.mo.tutorialmod.block.ModBlocks;
import net.mo.tutorialmod.component.ModDataComponentTypes;
import net.mo.tutorialmod.effect.ModEffects;
import net.mo.tutorialmod.enchantment.ModEnchantmentEffects;
import net.mo.tutorialmod.enchantment.ModEnchantments;
import net.mo.tutorialmod.entity.ModEntities;
import net.mo.tutorialmod.entity.custom.PorcupineEntity;
import net.mo.tutorialmod.entity.custom.TestEntity;
import net.mo.tutorialmod.item.ModItemGroups;
import net.mo.tutorialmod.item.ModItems;
import net.mo.tutorialmod.potion.ModPotions;
import net.mo.tutorialmod.sound.ModSounds;
import net.mo.tutorialmod.util.HammerUsageEvent;
import net.mo.tutorialmod.util.ModCustomTrades;
import net.mo.tutorialmod.util.ModTags;
import net.mo.tutorialmod.world.gen.ModEntityGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModSounds.registerSounds();
		ModEffects.registerEffects();
		ModPotions.registerPotions();
		ModCustomTrades.registerCustomTrades();
		ModEntities.registerModEntities();
		ModEntityGeneration.addSpawns();


		ModDataComponentTypes.registerDataComponentTypes();

		ModEnchantmentEffects.registerEnchantmentEffects();

		FuelRegistry.INSTANCE.add(ModItems.STARLIGHT_ASHES, 600);
		FabricDefaultAttributeRegistry.register(ModEntities.PORCUPINE, PorcupineEntity.createPorcupineAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.TEST, TestEntity.createTestAttributes());


		PlayerBlockBreakEvents.BEFORE.register(new HammerUsageEvent());

		AttackEntityCallback.EVENT.register((playerEntity, world, hand, entity, entityHitResult) -> {
			if (entity instanceof SheepEntity sheepEntity){
				if (playerEntity.getMainHandStack().getItem()== ModItems.LAVYA_SWORD){
					playerEntity.sendMessage(Text.literal("LAVYA IS A NICE GUY"));
					playerEntity.getMainHandStack().increment(2);
					sheepEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 400, 3));
				}
				return ActionResult.PASS;
			}
			return ActionResult.PASS;
		});
		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.AWKWARD , Items.SLIME_BALL, ModPotions.SLIMEY_POTION);
			builder.registerPotionRecipe(Potions.AWKWARD, ModItems.KABIRA_MUSIC_DISC, ModPotions.DEPRESSION_POTION);
		});
	}
}