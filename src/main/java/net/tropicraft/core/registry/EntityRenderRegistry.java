package net.tropicraft.core.registry;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.tropicraft.core.client.entity.model.ModelMarlin;
import net.tropicraft.core.client.entity.model.ModelSeahorse;
import net.tropicraft.core.client.entity.render.RenderChair;
import net.tropicraft.core.client.entity.render.RenderEIH;
import net.tropicraft.core.client.entity.render.RenderFailgull;
import net.tropicraft.core.client.entity.render.RenderIguana;
import net.tropicraft.core.client.entity.render.RenderLavaBall;
import net.tropicraft.core.client.entity.render.RenderMarlin;
import net.tropicraft.core.client.entity.render.RenderSeahorse;
import net.tropicraft.core.client.entity.render.RenderTreeFrog;
import net.tropicraft.core.client.entity.render.RenderTropiCreeper;
import net.tropicraft.core.client.entity.render.RenderTropiSkeleton;
import net.tropicraft.core.client.entity.render.RenderUmbrella;
import net.tropicraft.core.client.entity.render.RenderVMonkey;
import net.tropicraft.core.common.entity.EntityLavaBall;
import net.tropicraft.core.common.entity.hostile.EntityAshenHunter;
import net.tropicraft.core.common.entity.hostile.EntityEIH;
import net.tropicraft.core.common.entity.hostile.EntityIguana;
import net.tropicraft.core.common.entity.hostile.EntityLostMask;
import net.tropicraft.core.common.entity.hostile.EntityTreeFrogBase;
import net.tropicraft.core.common.entity.hostile.EntityTropiCreeper;
import net.tropicraft.core.common.entity.hostile.EntityTropiSkeleton;
import net.tropicraft.core.common.entity.passive.EntityFailgull;
import net.tropicraft.core.common.entity.passive.EntityVMonkey;
import net.tropicraft.core.common.entity.placeable.EntityChair;
import net.tropicraft.core.common.entity.placeable.EntityUmbrella;
import net.tropicraft.core.common.entity.projectile.EntityCoconutGrenade;
import net.tropicraft.core.common.entity.underdasea.EntityMarlin;
import net.tropicraft.core.common.entity.underdasea.EntitySeahorse;

public class EntityRenderRegistry {

	public static void init() {
		registerEntityRender(EntityEIH.class, new RenderEIH());
		registerEntityRender(EntityTropiCreeper.class, new RenderTropiCreeper());
		registerEntityRender(EntityIguana.class, new RenderIguana());
		registerEntityRender(EntityTreeFrogBase.class, new RenderTreeFrog());
		registerEntityRender(EntityTropiSkeleton.class, new RenderTropiSkeleton());
		registerEntityRender(EntityVMonkey.class, new RenderVMonkey());
		registerEntityRender(EntityMarlin.class, new RenderMarlin(new ModelMarlin(), 0.25F));
		registerEntityRender(EntityLavaBall.class, new RenderLavaBall());
		registerEntityRender(EntitySeahorse.class, new RenderSeahorse(new ModelSeahorse(), 0.25F));
		registerEntityRender(EntityFailgull.class, new RenderFailgull(0.25F));
		registerEntityRender(EntityChair.class, new RenderChair());
		registerEntityRender(EntityUmbrella.class, new RenderUmbrella());
		registerEntityRender(EntityCoconutGrenade.class, new RenderSnowball(Minecraft.getMinecraft().getRenderManager(),
																			ItemRegistry.coconutBomb,
																			Minecraft.getMinecraft().getRenderItem()));
		registerEntityRender(EntityLostMask.class, new RenderLostMask());
		registerEntityRender(EntityAshenHunter.class, new RenderAshen(new ModelAshen(), 0.75F));
	}

    private static void registerEntityRender(Class<? extends Entity> entityClass, Render render) {
        RenderingRegistry.registerEntityRenderingHandler(entityClass, render);
    }
	
}
