package net.galaxyxidorn.thermodynamics.fluid;

import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import org.jetbrains.annotations.NotNull;

import static net.galaxyxidorn.thermodynamics.Thermodynamics.MOD_ID;

public class ModFluidTypes {
    public static final DeferredRegister<FluidType> FLUID_TYPES = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, MOD_ID);

    public static final ResourceLocation CRYOFLUID = ResourceLocation.fromNamespaceAndPath(MOD_ID, "fluid/cryofluid"),
            CRYOFLUID_FLOWING = ResourceLocation.fromNamespaceAndPath(MOD_ID, "fluid/cryofluid_flow");
    public static final DeferredHolder<FluidType, FluidType> CRYOFLUID_TYPE = FLUID_TYPES.register("cryofluid_type",
            () -> new FluidType(FluidType.Properties.create()
                    .canSwim(false)
                    .canDrown(true)
                    .canHydrate(false)
                    .canExtinguish(true)));
    public static final ResourceLocation MOLTEN_SULFUR = ResourceLocation.fromNamespaceAndPath(MOD_ID, "fluid/molten_sulfur"),
            MOLTEN_SULFUR_FLOWING = ResourceLocation.fromNamespaceAndPath(MOD_ID, "fluid/molten_sulfur_flow");
    public static final DeferredHolder<FluidType, FluidType> MOLTEN_SULFUR_TYPE = FLUID_TYPES.register("molten_sulfur_type",
            () -> new FluidType(FluidType.Properties.create()
                    .canSwim(false)
                    .canDrown(true)
                    .canHydrate(false)
                    .canExtinguish(false)));
    public static final ResourceLocation MOLTEN_SODIUM = ResourceLocation.fromNamespaceAndPath(MOD_ID, "fluid/molten_sodium"),
            MOLTEN_SODIUM_FLOWING = ResourceLocation.fromNamespaceAndPath(MOD_ID, "fluid/molten_sodium_flow");
    public static final DeferredHolder<FluidType, FluidType> MOLTEN_SODIUM_TYPE = FLUID_TYPES.register("molten_sodium_type",
            () -> new FluidType(FluidType.Properties.create()
                    .canSwim(false)
                    .canDrown(true)
                    .canHydrate(false)
                    .canExtinguish(false)));
    public static final ResourceLocation MOLTEN_NAPHTHALENE = ResourceLocation.fromNamespaceAndPath(MOD_ID, "fluid/molten_naphthalene"),
            MOLTEN_NAPHTHALENE_FLOWING = ResourceLocation.fromNamespaceAndPath(MOD_ID, "fluid/molten_naphthalene_flow");
    public static final DeferredHolder<FluidType, FluidType> MOLTEN_NAPHTHALENE_TYPE = FLUID_TYPES.register("molten_naphthalene_type",
            () -> new FluidType(FluidType.Properties.create()
                    .canSwim(false)
                    .canDrown(true)
                    .canHydrate(false)
                    .canExtinguish(false)));
    public static final ResourceLocation COAL_TAR = ResourceLocation.fromNamespaceAndPath(MOD_ID, "fluid/coal_tar"),
            COAL_TAR_FLOWING = ResourceLocation.fromNamespaceAndPath(MOD_ID, "fluid/coal_tar_flow");
    public static final DeferredHolder<FluidType, FluidType> COAL_TAR_TYPE = FLUID_TYPES.register("coal_tar_type",
            () -> new FluidType(FluidType.Properties.create()
                    .canSwim(false)
                    .canDrown(true)
                    .canHydrate(false)
                    .canExtinguish(true)));

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
        eventBus.addListener(ModFluidTypes::registerClientExtensions);
    }

    private static void registerClientExtensions(RegisterClientExtensionsEvent event) {
        event.registerFluidType(new IClientFluidTypeExtensions() {
            @Override
            public int getTintColor() {
                return 0xFFFFFFFF;
            }

            @Override
            public @NotNull ResourceLocation getStillTexture() {return CRYOFLUID;}

            @Override
            public @NotNull ResourceLocation getFlowingTexture() {return CRYOFLUID_FLOWING;}
        }, CRYOFLUID_TYPE.get());
        event.registerFluidType(new IClientFluidTypeExtensions() {
            @Override
            public int getTintColor() {
                return 0xFFFFFFFF;
            }

            @Override
            public @NotNull ResourceLocation getStillTexture() {return MOLTEN_SULFUR;}

            @Override
            public @NotNull ResourceLocation getFlowingTexture() {return MOLTEN_SULFUR_FLOWING;}
        }, MOLTEN_SULFUR_TYPE.get());
        event.registerFluidType(new IClientFluidTypeExtensions() {
            @Override
            public int getTintColor() {
                return 0xFFFFFFFF;
            }

            @Override
            public @NotNull ResourceLocation getStillTexture() {return MOLTEN_SODIUM;}

            @Override
            public @NotNull ResourceLocation getFlowingTexture() {return MOLTEN_SODIUM_FLOWING;}
        }, MOLTEN_SODIUM_TYPE.get());
        event.registerFluidType(new IClientFluidTypeExtensions() {
            @Override
            public int getTintColor() {
                return 0xFFFFFFFF;
            }

            @Override
            public @NotNull ResourceLocation getStillTexture() {return MOLTEN_NAPHTHALENE;}

            @Override
            public @NotNull ResourceLocation getFlowingTexture() {return MOLTEN_NAPHTHALENE_FLOWING;}
        }, MOLTEN_NAPHTHALENE_TYPE.get());
        event.registerFluidType(new IClientFluidTypeExtensions() {
            @Override
            public int getTintColor() {
                return 0xFFFFFFFF;
            }

            @Override
            public @NotNull ResourceLocation getStillTexture() {return COAL_TAR;}

            @Override
            public @NotNull ResourceLocation getFlowingTexture() {return COAL_TAR_FLOWING;}
        }, COAL_TAR_TYPE.get());
    }
}
