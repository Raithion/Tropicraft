package net.tropicraft.core.client.entity.render;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.tropicraft.core.client.TropicraftRenderUtils;
import net.tropicraft.core.common.entity.projectile.PoisonBlotEntity;

import javax.annotation.Nullable;

@OnlyIn(Dist.CLIENT)
public class PoisonBlotRenderer extends EntityRenderer<PoisonBlotEntity> {

    public PoisonBlotRenderer(EntityRendererManager renderManager) {
        super(renderManager);
    }

    public void render(final PoisonBlotEntity entity, float entityYaw, float partialTicks, MatrixStack stack, IRenderTypeBuffer bufferIn, int packedLightIn) {
        stack.push();
        stack.rotate(this.renderManager.getCameraOrientation());
        stack.rotate(Vector3f.YP.rotationDegrees(180.0F));
        final IVertexBuilder buffer = TropicraftRenderUtils.getEntityCutoutBuilder(bufferIn, getEntityTexture(entity));
        buffer.pos(-.5, -.5, 0).tex(0, 1).endVertex();
        buffer.pos( .5, -.5, 0).tex(1, 1).endVertex();
        buffer.pos( .5,  .5, 0).tex(1, 0).endVertex();
        buffer.pos(-.5,  .5, 0).tex(0, 0).endVertex();
        stack.pop();
        super.render(entity, entityYaw, partialTicks, stack, bufferIn, packedLightIn);
    }

    @Nullable
    @Override
    public ResourceLocation getEntityTexture(PoisonBlotEntity entity) {
        return TropicraftRenderUtils.getTextureEntity("treefrog/blot");
    }
}
