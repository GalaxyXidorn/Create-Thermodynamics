package net.galaxyxidorn.thermodynamics.item;

import net.galaxyxidorn.thermodynamics.Thermodynamics;
import net.galaxyxidorn.thermodynamics.fluid.ModFluids;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Thermodynamics.MOD_ID);

    public static final DeferredItem<Item>
            //CRYONITECRYSTAL = simpleItem("cryonite_crystal"),
            //CRYODUST = simpleItem("cryodust"),
            CRYONITE_ALLOY = simpleItem("cryonite_alloy"),
            SALT = simpleItem("salt"),
            WHITE_TAR = simpleItem("white_tar"),
            SULFUR = simpleItem("sulfur"),
            WICK = simpleItem("wick");



    public static final DeferredItem<BucketItem> CRYOFLUID_BUCKET = ITEMS.register("cryofluid_bucket",
            () -> new BucketItem(ModFluids.CRYOFLUID.get(), new Item.Properties()));
    public static final DeferredItem<BucketItem> MOLTEN_SULFUR_BUCKET = ITEMS.register("molten_sulfur_bucket",
            () -> new BucketItem(ModFluids.MOLTEN_SULFUR.get(), new Item.Properties()));
    public static final DeferredItem<BucketItem> MOLTEN_SODIUM_BUCKET = ITEMS.register("molten_sodium_bucket",
            () -> new BucketItem(ModFluids.MOLTEN_SODIUM.get(), new Item.Properties()));
    public static final DeferredItem<BucketItem> MOLTEN_NAPHTHALENE_BUCKET = ITEMS.register("molten_naphthalene_bucket",
            () -> new BucketItem(ModFluids.MOLTEN_NAPHTHALENE.get(), new Item.Properties()));
    public static final DeferredItem<BucketItem> COAL_TAR_BUCKET = ITEMS.register("coal_tar_bucket",
            () -> new BucketItem(ModFluids.COAL_TAR.get(), new Item.Properties()));
    private static DeferredItem<Item> simpleItem(String name) {
        return ITEMS.register(name, () -> new Item(new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
