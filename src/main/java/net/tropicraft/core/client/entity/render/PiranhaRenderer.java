package net.tropicraft.core.client.entity.render;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.tropicraft.core.client.entity.model.PiranhaModel;
import net.tropicraft.core.common.entity.underdasea.PiranhaEntity;

public class PiranhaRenderer extends TropicraftFishRenderer<PiranhaEntity, PiranhaModel> {

    public PiranhaRenderer(EntityRendererManager manager) {
        super(manager, new PiranhaModel(), 0.2f);
    }
}
