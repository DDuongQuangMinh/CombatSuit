package com.k1ngtle.combatsuit.registry;

import com.k1ngtle.combatsuit.CombatSuit;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredRegister;
import java.util.function.Supplier;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = 
        DeferredRegister.create(net.minecraft.core.registries.Registries.CREATIVE_MODE_TAB, CombatSuit.MODID);

    public static final Supplier<CreativeModeTab> COMBAT_SUIT_TAB = CREATIVE_MODE_TABS.register("combatsuit_tab", 
        () -> CreativeModeTab.builder()
            .title(Component.translatable("creativetab.combatsuit_tab"))
            .icon(() -> new ItemStack(ModItems.COMBAT_HELMET.get())) // Using helmet as icon
            .displayItems((parameters, output) -> {
                // This is what actually puts the items in the tab
                output.accept(ModItems.COMBAT_HELMET.get());
                output.accept(ModItems.COMBAT_FULLMASK.get());
                output.accept(ModItems.COMBAT_CHESTPLATE.get());
                output.accept(ModItems.COMBAT_LEGGINGS.get());
                output.accept(ModItems.COMBAT_BOOTS.get());
                output.accept(ModItems.GRASS_GHILLIE_HELMET.get());
                output.accept(ModItems.GHILLIE_ARMOR.get());
                output.accept(ModItems.GHILLIE_HELMET_SNOW.get());
                output.accept(ModItems.GHILLIE_ARMOR_SNOW.get());
            }).build());

    public static void register(net.neoforged.bus.api.IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}