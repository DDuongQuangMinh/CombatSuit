package com.k1ngtle.combatsuit;

import com.k1ngtle.combatsuit.registry.ModCreativeTabs;
import com.k1ngtle.combatsuit.registry.ModItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod(CombatSuit.MODID)
public class CombatSuit {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "combatsuit";

    public CombatSuit(IEventBus modEventBus) {
        // Register the common setup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register our Items and Creative Tabs from the registry package!
        ModItems.register(modEventBus);
        ModCreativeTabs.register(modEventBus);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Some common setup code
    }
}