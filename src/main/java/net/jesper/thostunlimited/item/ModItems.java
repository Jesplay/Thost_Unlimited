package net.jesper.thostunlimited.item;

import net.jesper.thostunlimited.ThorMod;
import net.jesper.thostunlimited.item.custom.Fork;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ThorMod.MODID);

    public static final RegistryObject<Item> FORK = ITEMS.register("fork",
            () -> new Fork(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> THORIUMBAR = ITEMS.register("thoriumbar",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> THORIUMORE = ITEMS.register("thoriumore",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
