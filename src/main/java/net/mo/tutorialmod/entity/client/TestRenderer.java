package net.mo.tutorialmod.entity.client;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.util.Identifier;
import net.mo.tutorialmod.TutorialMod;
import net.mo.tutorialmod.entity.custom.TestEntity;

public class TestRenderer extends MobEntityRenderer<TestEntity, TestModel<TestEntity>> {
    private static final Identifier TEXTURE = Identifier.of(TutorialMod.MOD_ID, "textures/entity/test.png");

    public TestRenderer(EntityRendererFactory.Context context) {
        super(context, new TestModel<>(context.getPart(ModModelLayers.TEST)), 0.6f);
    }

    @Override
    public void render(TestEntity livingEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if (livingEntity.isBaby())
        {
            matrixStack.scale(2.5f, 2.5f, 2.5f);
        } else{
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }

    @Override
    public Identifier getTexture(TestEntity entity) {
        return TEXTURE;
    }
}

