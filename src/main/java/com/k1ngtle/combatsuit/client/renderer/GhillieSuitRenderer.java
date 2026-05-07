package com.k1ngtle.combatsuit.client.renderer;

import com.k1ngtle.combatsuit.CombatSuit;
import com.k1ngtle.combatsuit.item.GhillieSuitItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class GhillieSuitRenderer extends GeoArmorRenderer<GhillieSuitItem> {
    public GhillieSuitRenderer() {
        // This links the renderer to grass_ghillie.geo.json and grass_phillie.png
        super(new DefaultedItemGeoModel<>(ResourceLocation.fromNamespaceAndPath(CombatSuit.MODID, "grass_ghillie")));
    }
}