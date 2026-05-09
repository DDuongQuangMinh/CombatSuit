package com.k1ngtle.combatsuit.client.renderer;

import com.k1ngtle.combatsuit.CombatSuit;
import com.k1ngtle.combatsuit.item.GhillieArmorSandItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class GhillieArmorSandRenderer extends GeoArmorRenderer<GhillieArmorSandItem> {
    public GhillieArmorSandRenderer() {
        super(new DefaultedItemGeoModel<GhillieArmorSandItem>(ResourceLocation.fromNamespaceAndPath(CombatSuit.MODID, "ghillie_armor")) {
            @Override
            public ResourceLocation getTextureResource(GhillieArmorSandItem object) {
                return ResourceLocation.fromNamespaceAndPath(CombatSuit.MODID, "textures/item/ghillie_armor_sand.png");
            }
        });
    }
}