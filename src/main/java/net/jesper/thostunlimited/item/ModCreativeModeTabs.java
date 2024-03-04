package net.jesper.thostunlimited.item;

import net.jesper.thostunlimited.ThorMod;
import net.jesper.thostunlimited.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ThorMod.MODID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GABEL.get()))
            .title(Component.translatable("creativetab.thostmain"))
            .displayItems((pParameters, pOutput) ->{
                pOutput.accept(ModItems.GABEL.get());
                pOutput.accept(ModBlocks.THORIUM.get());
            } )
            .build());
    public static void register (IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
