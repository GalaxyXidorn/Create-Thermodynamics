package net.galaxyxidorn.thermodynamics.datagen;

import net.galaxyxidorn.thermodynamics.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelBuilder;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

import static net.galaxyxidorn.thermodynamics.Thermodynamics.MOD_ID;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.CRYONITE_BLOCK);
        blockWithItem(ModBlocks.SULFUR_ORE);
        blockWithItem(ModBlocks.ROCK_SALT);
        //connectedBlockWithItem(ModBlocks.CRYO_CASING, "cryo_casing");
    }

    public void blockWithItem(DeferredBlock<? extends Block> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    public void connectedBlockWithItem(DeferredBlock<? extends Block> deferredBlock, String name) {
        ModelBuilder<?> builder = models().getBuilder(name);
        builder.parent(new ModelFile.UncheckedModelFile(modLoc("block/connected")));
        builder.texture("block", modLoc("block/" + name));
        builder.texture("connected", modLoc("block/" + name + "_connected"));

        simpleBlock(deferredBlock.get(), models().getExistingFile(modLoc("block/" + name)));
        simpleBlockItem(deferredBlock.get(), models().getExistingFile(modLoc("block/" + name)));
    }
}
