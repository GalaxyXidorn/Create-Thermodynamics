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
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
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
    public static final DeferredBlock<Block> SULFUR_ORE = registerBlock("sulfur_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.NETHER_GOLD_ORE)));
    public static final DeferredBlock<Block> ROCK_SALT = registerBlock("rock_salt",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.GRAVEL)));


    //public static final DeferredBlock<CasingBlock> CRYO_CASING = registerBlock("cryo_casing",
    //        () -> new CasingBlock(BlockBehaviour.Properties.ofFullCopy(AllBlocks.ANDESITE_CASING.get())));



    public static final DeferredBlock<LiquidBlock> CRYOFLUID = BLOCKS.register("cryofluid",
            () -> new CryoFluidBlock(ModFluids.CRYOFLUID.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER).noCollission().noLootTable()));
    public static final DeferredBlock<LiquidBlock> MOLTEN_SULFUR = BLOCKS.register("molten_sulfur",
            () -> new LiquidBlock(ModFluids.MOLTEN_SULFUR.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.LAVA).noCollission().noLootTable()));
    public static final DeferredBlock<LiquidBlock> MOLTEN_SODIUM = BLOCKS.register("molten_sodium",
            () -> new LiquidBlock(ModFluids.MOLTEN_SODIUM.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.LAVA).noCollission().noLootTable()));
    public static final DeferredBlock<LiquidBlock> MOLTEN_NAPHTHALENE = BLOCKS.register("molten_naphthalene",
            () -> new LiquidBlock(ModFluids.MOLTEN_NAPHTHALENE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.LAVA).noCollission().noLootTable()));
    public static final DeferredBlock<LiquidBlock> COAL_TAR = BLOCKS.register("coal_tar",
            () -> new LiquidBlock(ModFluids.COAL_TAR.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.LAVA).noCollission().noLootTable()));



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
