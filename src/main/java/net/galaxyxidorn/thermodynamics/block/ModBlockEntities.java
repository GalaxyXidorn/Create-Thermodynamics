package net.galaxyxidorn.thermodynamics.block;

import net.galaxyxidorn.thermodynamics.Thermodynamics;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE.key(), Thermodynamics.MOD_ID);

    public static void register(IEventBus eventBus) {BLOCK_ENTITIES.register(eventBus);
    }

}