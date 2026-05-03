package com.k1ngtle.combatsuit.registry;

import com.k1ngtle.combatsuit.CombatSuit;
import com.k1ngtle.combatsuit.item.GhostHelmetItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredRegister;
import java.util.function.Supplier;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, CombatSuit.MODID);

    public static final Supplier<Item> COMBAT_HELMET = ITEMS.register("combat_helmet", 
        () -> new GhostHelmetItem(ArmorMaterials.IRON, ArmorItem.Type.HELMET, new Item.Properties()));

    // Added missing registrations for other armor pieces
    public static final Supplier<Item> COMBAT_CHESTPLATE = ITEMS.register("combat_chestplate", 
        () -> new ArmorItem(ArmorMaterials.IRON, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final Supplier<Item> COMBAT_LEGGINGS = ITEMS.register("combat_leggings", 
        () -> new ArmorItem(ArmorMaterials.IRON, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final Supplier<Item> COMBAT_BOOTS = ITEMS.register("combat_boots", 
        () -> new ArmorItem(ArmorMaterials.IRON, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static void register(net.neoforged.bus.api.IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}