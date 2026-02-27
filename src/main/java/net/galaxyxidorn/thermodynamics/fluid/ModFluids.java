package net.galaxyxidorn.thermodynamics.fluid;

import net.galaxyxidorn.thermodynamics.Thermodynamics;
import net.galaxyxidorn.thermodynamics.block.ModBlocks;
import net.galaxyxidorn.thermodynamics.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(Registries.FLUID, Thermodynamics.MOD_ID);

    public static final DeferredHolder<Fluid, FlowingFluid> CRYOFLUID = FLUIDS.register("cryofluid", () -> new BaseFlowingFluid.Source(ModFluids.CRYOFLUID_PROPERTIES));
    public static final DeferredHolder<Fluid, FlowingFluid> CRYOFLUID_FLOWING = FLUIDS.register("cryofluid_flowing", () -> new BaseFlowingFluid.Flowing(ModFluids.CRYOFLUID_PROPERTIES));

    public static final BaseFlowingFluid.Properties CRYOFLUID_PROPERTIES = new BaseFlowingFluid.Properties(ModFluidTypes.CRYOFLUID_TYPE, CRYOFLUID, CRYOFLUID_FLOWING)
            .block(ModBlocks.CRYOFLUID)
            .bucket(ModItems.CRYOFLUID_BUCKET)
            .slopeFindDistance(3)
            .levelDecreasePerBlock(2)
            .tickRate(25);
    public static final DeferredHolder<Fluid, FlowingFluid> MOLTEN_SULFUR = FLUIDS.register("molten_sulfur", () -> new BaseFlowingFluid.Source(ModFluids.MOLTEN_SULFUR_PROPERTIES));
    public static final DeferredHolder<Fluid, FlowingFluid> MOLTEN_SULFUR_FLOWING = FLUIDS.register("molten_sulfur_flowing", () -> new BaseFlowingFluid.Flowing(ModFluids.MOLTEN_SULFUR_PROPERTIES));

    public static final BaseFlowingFluid.Properties MOLTEN_SULFUR_PROPERTIES = new BaseFlowingFluid.Properties(ModFluidTypes.MOLTEN_SULFUR_TYPE, MOLTEN_SULFUR, MOLTEN_SULFUR_FLOWING)
            .block(ModBlocks.MOLTEN_SULFUR)
            .bucket(ModItems.MOLTEN_SULFUR_BUCKET)
            .slopeFindDistance(3)
            .levelDecreasePerBlock(2)
            .tickRate(25);
    public static final DeferredHolder<Fluid, FlowingFluid> MOLTEN_SODIUM = FLUIDS.register("molten_sodium", () -> new BaseFlowingFluid.Source(ModFluids.MOLTEN_SODIUM_PROPERTIES));
    public static final DeferredHolder<Fluid, FlowingFluid> MOLTEN_SODIUM_FLOWING = FLUIDS.register("molten_sodium_flowing", () -> new BaseFlowingFluid.Flowing(ModFluids.MOLTEN_SODIUM_PROPERTIES));

    public static final BaseFlowingFluid.Properties MOLTEN_SODIUM_PROPERTIES = new BaseFlowingFluid.Properties(ModFluidTypes.MOLTEN_SODIUM_TYPE, MOLTEN_SODIUM, MOLTEN_SODIUM_FLOWING)
            .block(ModBlocks.MOLTEN_SODIUM)
            .bucket(ModItems.MOLTEN_SODIUM_BUCKET)
            .slopeFindDistance(3)
            .levelDecreasePerBlock(2)
            .tickRate(25);
    public static final DeferredHolder<Fluid, FlowingFluid> MOLTEN_NAPHTHALENE = FLUIDS.register("molten_naphthalene", () -> new BaseFlowingFluid.Source(ModFluids.MOLTEN_NAPHTHALENE_PROPERTIES));
    public static final DeferredHolder<Fluid, FlowingFluid> MOLTEN_NAPHTHALENE_FLOWING = FLUIDS.register("molten_naphthalene_flowing", () -> new BaseFlowingFluid.Flowing(ModFluids.MOLTEN_NAPHTHALENE_PROPERTIES));

    public static final BaseFlowingFluid.Properties MOLTEN_NAPHTHALENE_PROPERTIES = new BaseFlowingFluid.Properties(ModFluidTypes.MOLTEN_NAPHTHALENE_TYPE, MOLTEN_NAPHTHALENE, MOLTEN_NAPHTHALENE_FLOWING)
            .block(ModBlocks.MOLTEN_NAPHTHALENE)
            .bucket(ModItems.MOLTEN_NAPHTHALENE_BUCKET)
            .slopeFindDistance(3)
            .levelDecreasePerBlock(2)
            .tickRate(25);
    public static final DeferredHolder<Fluid, FlowingFluid> COAL_TAR = FLUIDS.register("coal_tar", () -> new BaseFlowingFluid.Source(ModFluids.COAL_TAR_PROPERTIES));
    public static final DeferredHolder<Fluid, FlowingFluid> COAL_TAR_FLOWING = FLUIDS.register("coal_tar_flowing", () -> new BaseFlowingFluid.Flowing(ModFluids.COAL_TAR_PROPERTIES));

    public static final BaseFlowingFluid.Properties COAL_TAR_PROPERTIES = new BaseFlowingFluid.Properties(ModFluidTypes.COAL_TAR_TYPE, COAL_TAR, COAL_TAR_FLOWING)
            .block(ModBlocks.COAL_TAR)
            .bucket(ModItems.COAL_TAR_BUCKET)
            .slopeFindDistance(3)
            .levelDecreasePerBlock(2)
            .tickRate(25);

    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
