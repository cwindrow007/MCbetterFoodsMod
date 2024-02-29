package net.Shinjuku.betterfoods.init;

import net.Shinjuku.betterfoods.betterFoods;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class itemsInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, betterFoods.MOD_ID);

    public static final RegistryObject<Item> honey_glazed_pork = ITEMS.register("honey_glazed_pork",
            () -> new Item(new Item.Properties()
                    .stacksTo(16)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationMod(1.2f)
                            .build())));
}
