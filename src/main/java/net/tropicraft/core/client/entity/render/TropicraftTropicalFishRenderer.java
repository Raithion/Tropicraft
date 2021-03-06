package net.tropicraft.core.client.entity.render;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.tropicraft.core.client.entity.model.SardineModel;
import net.tropicraft.core.client.entity.model.TropicraftTropicalFishModel;
import net.tropicraft.core.common.entity.underdasea.SardineEntity;
import net.tropicraft.core.common.entity.underdasea.TropicraftTropicalFishEntity;

public class TropicraftTropicalFishRenderer extends TropicraftFishRenderer<TropicraftTropicalFishEntity, TropicraftTropicalFishModel> {
    public TropicraftTropicalFishRenderer(EntityRendererManager manager) {
        super(manager, new TropicraftTropicalFishModel(), 0.2f);
    }
}
