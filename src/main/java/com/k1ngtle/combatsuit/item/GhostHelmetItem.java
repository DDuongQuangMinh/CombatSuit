package com.k1ngtle.combatsuit.item;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.core.Holder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.client.GeoRenderProvider;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.AnimatableManager;
import software.bernie.geckolib.renderer.GeoArmorRenderer;
import software.bernie.geckolib.util.GeckoLibUtil;
import com.k1ngtle.combatsuit.client.renderer.GhostHelmetRenderer;
import java.util.function.Consumer;

public class GhostHelmetItem extends ArmorItem implements GeoItem {
    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);

    public GhostHelmetItem(Holder<ArmorMaterial> material, Type type, Properties properties) {
        super(material, type, properties);
    }

    // This links your custom renderer to the item.
    @Override
    public void createGeoRenderer(Consumer<GeoRenderProvider> consumer) {
        consumer.accept(new GeoRenderProvider() {
            private GeoArmorRenderer<?> renderer;

            @Override
            public <T extends LivingEntity> HumanoidModel<?> getGeoArmorRenderer(T renderProvider, ItemStack itemStack, EquipmentSlot equipmentSlot, HumanoidModel<T> original) {
                if (this.renderer == null) {
                    this.renderer = new GhostHelmetRenderer();
                }
                return this.renderer;
            }
        });
    }

    // Note: The inventoryTick method for Night Vision has been completely removed!

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {}

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }
}