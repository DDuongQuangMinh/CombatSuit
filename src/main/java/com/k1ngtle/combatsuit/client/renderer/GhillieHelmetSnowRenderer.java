package com.k1ngtle.combatsuit.client.renderer;

import com.k1ngtle.combatsuit.CombatSuit;
import com.k1ngtle.combatsuit.item.GhillieHelmetSnowItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class GhillieHelmetSnowRenderer extends GeoArmorRenderer<GhillieHelmetSnowItem> {
    public GhillieHelmetSnowRenderer() {
        // Reuse the same 3D shape as the grass helmet...
        super(new DefaultedItemGeoModel<GhillieHelmetSnowItem>(ResourceLocation.fromNamespaceAndPath(CombatSuit.MODID, "grass_ghillie")) {
            // ...but force it to use the Snow texture!
            @Override
            public ResourceLocation getTextureResource(GhillieHelmetSnowItem object) {
                return ResourceLocation.fromNamespaceAndPath(CombatSuit.MODID, "textures/item/snow_ghillie.png");
            }
        });
    }
}