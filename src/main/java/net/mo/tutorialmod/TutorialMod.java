package net.mo.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.mo.tutorialmod.block.ModBlocks;
import net.mo.tutorialmod.component.ModDataComponentTypes;
import net.mo.tutorialmod.enchantment.ModEnchantmentEffects;
import net.mo.tutorialmod.enchantment.ModEnchantments;
import net.mo.tutorialmod.item.ModItemGroups;
import net.mo.tutorialmod.item.ModItems;
import net.mo.tutorialmod.util.HammerUsageEvent;
import net.mo.tutorialmod.util.ModTags;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.reigsterModItems();
		ModBlocks.registerModBlocks();

		ModDataComponentTypes.registerDataComponentTypes();

		ModEnchantmentEffects.registerEnchantmentEffects();

		FuelRegistry.INSTANCE.add(ModItems.STARLIGHT_ASHES, 600);


		PlayerBlockBreakEvents.BEFORE.register(new HammerUsageEvent());

		AttackEntityCallback.EVENT.register((playerEntity, world, hand, entity, entityHitResult) -> {
			if (entity instanceof SheepEntity sheepEntity){
				if (playerEntity.getMainHandStack().getItem()== ModItems.LAVYA_SWORD){
					playerEntity.sendMessage(Text.literal("LAVYA IS A NIGGER"));
					playerEntity.getMainHandStack().increment(2);
					sheepEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 400, 3));
				}
				return ActionResult.PASS;
			}
			return ActionResult.SUCCESS;
		});
	}
}