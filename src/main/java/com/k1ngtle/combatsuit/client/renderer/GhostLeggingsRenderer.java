package com.k1ngtle.combatsuit.client.renderer;

import com.k1ngtle.combatsuit.CombatSuit;
import com.k1ngtle.combatsuit.item.GhostLeggingsItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class GhostLeggingsRenderer extends GeoArmorRenderer<GhostLeggingsItem> {
    public GhostLeggingsRenderer() {
        super(new DefaultedItemGeoModel<>(ResourceLocation.fromNamespaceAndPath(CombatSuit.MODID, "cod_ghost_leggings")));
    }
}