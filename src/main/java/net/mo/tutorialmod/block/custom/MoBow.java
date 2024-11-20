package net.mo.tutorialmod.block.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.BowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;

public class MoBow extends BowItem {
    public MoBow(Settings settings) {
        super(settings);
    }

    @Override
    protected ProjectileEntity createArrowEntity(World world, LivingEntity shooter, ItemStack weaponStack, ItemStack projectileStack, boolean critical){
        ArrowItem arrowItem2 = projectileStack.getItem() instanceof ArrowItem arrowItem ? arrowItem :(ArrowItem)
                Items.ARROW;
        PersistentProjectileEntity persistentProjectileEntity = arrowItem2.createArrow(world, projectileStack, shooter, weaponStack);
        persistentProjectileEntity.setDamage(10.0);
        if (critical){
            persistentProjectileEntity.setCritical(true);
        }
        return persistentProjectileEntity;

    }
}
