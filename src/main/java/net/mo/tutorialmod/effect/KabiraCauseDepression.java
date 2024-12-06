/* package net.mo.tutorialmod.effect;

import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.minecraft.block.BlockState;
import net.minecraft.block.JukeboxBlock;
import net.minecraft.block.entity.JukeboxBlockEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.mo.tutorialmod.TutorialMod;
import net.mo.tutorialmod.item.ModItems;

public class KabiraCauseDepression {
    UseBlockCallback.EVENT.register((player, world, hand, hitResult) -> {
        BlockPos pos = hitResult.getBlockPos();
        BlockState state = world.getBlockState(pos);

        // Check if the block is a jukebox
        if (state.getBlock() instanceof JukeboxBlock) {
            ItemStack itemStack = player.getStackInHand(hand);

            // Check if the item is your custom music disc
            if (itemStack.getItem() == ModItems.KABIRA_MUSIC_DISC) {
                if (!world.isClient) {
                    // Mark the jukebox as playing your disc
                    JukeboxBlockEntity jukebox = (JukeboxBlockEntity) world.getBlockEntity(pos);
                    if (jukebox != null) {
                        jukebox.setCustomName(Text.literal("playing_custom_disc")); // Example tracking
                    }
                }
            }
        }
        return ActionResult.PASS;
    });

}
*/