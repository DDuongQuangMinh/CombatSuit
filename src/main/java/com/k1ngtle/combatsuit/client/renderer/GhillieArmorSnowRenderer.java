package com.k1ngtle.combatsuit.client.renderer;

import com.k1ngtle.combatsuit.CombatSuit;
import com.k1ngtle.combatsuit.item.GhillieArmorSnowItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class GhillieArmorSnowRenderer extends GeoArmorRenderer<GhillieArmorSnowItem> {
    public GhillieArmorSnowRenderer() {
        // Reuse the same 3D shape as the grass version...
        super(new DefaultedItemGeoModel<GhillieArmorSnowItem>(ResourceLocation.fromNamespaceAndPath(CombatSuit.MODID, "ghillie_armor")) {
            // ...but force it to use the Snow texture!
            @Override
            public ResourceLocation getTextureResource(GhillieArmorSnowItem object) {
                return ResourceLocation.fromNamespaceAndPath(CombatSuit.MODID, "textures/item/ghillie_armor_snow.png");
            }
        });
    }
}