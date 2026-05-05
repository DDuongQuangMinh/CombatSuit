package com.k1ngtle.combatsuit.client.renderer;

import com.k1ngtle.combatsuit.CombatSuit;
import com.k1ngtle.combatsuit.item.GhostVestItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class GhostVestRenderer extends GeoArmorRenderer<GhostVestItem> {
    public GhostVestRenderer() {
        super(new DefaultedItemGeoModel<>(ResourceLocation.fromNamespaceAndPath(CombatSuit.MODID, "cod_ghost_vest")));
    }
}