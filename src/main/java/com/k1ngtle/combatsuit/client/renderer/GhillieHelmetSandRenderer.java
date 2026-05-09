package com.k1ngtle.combatsuit.client.renderer;

import com.k1ngtle.combatsuit.CombatSuit;
import com.k1ngtle.combatsuit.item.GhillieHelmetSandItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class GhillieHelmetSandRenderer extends GeoArmorRenderer<GhillieHelmetSandItem> {
    public GhillieHelmetSandRenderer() {
        super(new DefaultedItemGeoModel<GhillieHelmetSandItem>(ResourceLocation.fromNamespaceAndPath(CombatSuit.MODID, "grass_ghillie")) {
            @Override
            public ResourceLocation getTextureResource(GhillieHelmetSandItem object) {
                return ResourceLocation.fromNamespaceAndPath(CombatSuit.MODID, "textures/item/sand_ghillie.png");
            }
        });
    }
}