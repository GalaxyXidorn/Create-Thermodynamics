package net.galaxyxidorn.thermodynamics.block;

import com.simibubi.create.AllBlocks;
import com.simibubi.create.content.decoration.encasing.CasingBlock;
import net.galaxyxidorn.thermodynamics.Thermodynamics;
import net.galaxyxidorn.thermodynamics.fluid.CryoFluidBlock;
import net.galaxyxidorn.thermodynamics.fluid.ModFluids;
import net.galaxyxidorn.thermodynamics.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(Thermodynamics.MOD_ID);

    public static final DeferredBlock<Block> CRYONITE_BLOCK = registerBlock("cryonite_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));


    //public static final DeferredBlock<CasingBlock> CRYO_CASING = registerBlock("cryo_casing",
    //        () -> new CasingBlock(BlockBehaviour.Properties.ofFullCopy(AllBlocks.ANDESITE_CASING.get())));



    public static final DeferredBlock<LiquidBlock> CRYOFLUID = BLOCKS.register("cryofluid",
            () -> new CryoFluidBlock(ModFluids.CRYOFLUID.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER).noCollission().noLootTable()));



    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventbus) {BLOCKS.register(eventbus);
    }
}
