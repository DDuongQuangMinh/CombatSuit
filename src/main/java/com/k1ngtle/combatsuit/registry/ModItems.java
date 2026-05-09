package com.k1ngtle.combatsuit.registry;

import com.k1ngtle.combatsuit.CombatSuit;
import com.k1ngtle.combatsuit.item.FullMaskItem;
import com.k1ngtle.combatsuit.item.GhillieArmorItem;
import com.k1ngtle.combatsuit.item.GhillieArmorSandItem;
import com.k1ngtle.combatsuit.item.GhillieArmorSnowItem;
import com.k1ngtle.combatsuit.item.GhillieHelmetSandItem;
import com.k1ngtle.combatsuit.item.GhillieHelmetSnowItem;
import com.k1ngtle.combatsuit.item.GhillieSuitItem;
import com.k1ngtle.combatsuit.item.GhostBootsItem;
import com.k1ngtle.combatsuit.item.GhostHelmetItem;
import com.k1ngtle.combatsuit.item.GhostLeggingsItem;
import com.k1ngtle.combatsuit.item.GhostVestItem;

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

    public static final Supplier<Item> COMBAT_FULLMASK = ITEMS.register("combat_fullmask", 
        () -> new FullMaskItem(ArmorMaterials.IRON, ArmorItem.Type.HELMET, new Item.Properties()));
        
    // Add this with your other registrations
    public static final Supplier<Item> GRASS_GHILLIE_HELMET = ITEMS.register("grass_ghillie_helmet", 
        () -> new GhillieSuitItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));
        
    public static final Supplier<Item> GHILLIE_HELMET_SNOW = ITEMS.register("ghillie_helmet_snow", 
        () -> new GhillieHelmetSnowItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));    

    public static final Supplier<Item> COMBAT_CHESTPLATE = ITEMS.register("combat_chestplate", 
        () -> new GhostVestItem(ArmorMaterials.IRON, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final Supplier<Item> GHILLIE_ARMOR = ITEMS.register("ghillie_armor", 
        () -> new GhillieArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        
    public static final Supplier<Item> GHILLIE_ARMOR_SNOW = ITEMS.register("ghillie_armor_snow", 
        () -> new GhillieArmorSnowItem(ArmorMaterials.LEATHER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        
    public static final Supplier<Item> GHILLIE_HELMET_SAND = ITEMS.register("ghillie_helmet_sand", 
        () -> new GhillieHelmetSandItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final Supplier<Item> GHILLIE_ARMOR_SAND = ITEMS.register("ghillie_armor_sand", 
        () -> new GhillieArmorSandItem(ArmorMaterials.LEATHER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));    

    public static final Supplier<Item> COMBAT_LEGGINGS = ITEMS.register("combat_leggings", 
        () -> new GhostLeggingsItem(ArmorMaterials.IRON, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final Supplier<Item> COMBAT_BOOTS = ITEMS.register("combat_boots", 
        () -> new GhostBootsItem(ArmorMaterials.IRON, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static void register(net.neoforged.bus.api.IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}