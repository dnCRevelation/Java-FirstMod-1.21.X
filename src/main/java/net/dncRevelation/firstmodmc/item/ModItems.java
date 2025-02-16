package net.dncRevelation.firstmodmc.item;

import net.dncRevelation.firstmodmc.firstmodmc;
import net.minecraft.util.profiling.metrics.profiling.InactiveMetricsRecorder;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =                          // Item register
            DeferredRegister.create(ForgeRegistries.ITEMS, firstmodmc.MOD_ID);  // Item register


    public static final RegistryObject<Item> ALEXANDRITE = ITEMS.register("alexandrite",    // Custom Item
            () -> new Item(new Item.Properties().setId(ITEMS.key("alexandrite"))));          // Custom Item
    public static final RegistryObject<Item> RAW_ALEXANDRITE = ITEMS.register("raw_alexandrite",
            () -> new Item(new Item.Properties().setId(ITEMS.key("raw_alexandrite"))));


    public static void register(IEventBus eventBus) {                           // Item register
        ITEMS.register(eventBus);                                               // Item register
    }
}
