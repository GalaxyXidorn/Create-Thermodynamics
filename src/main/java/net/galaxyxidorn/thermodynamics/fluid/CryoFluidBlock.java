package net.galaxyxidorn.thermodynamics.fluid;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FlowingFluid;
import org.jetbrains.annotations.NotNull;

public class CryoFluidBlock extends LiquidBlock {

    public CryoFluidBlock(FlowingFluid fluid,
                          Properties properties) {
        super(fluid, properties);
    }




    @Override
    public void entityInside(BlockState state,
                             Level level,
                             BlockPos pos,
                             Entity entity) {

        if (!level.isClientSide && entity instanceof LivingEntity living) {

            int current = living.getTicksFrozen();
            int max = living.getTicksRequiredToFreeze();

            // Increase freeze faster
            living.setTicksFrozen(Math.min(max, current + 4));

            // If fully frozen, deal damage
            if (living.getTicksFrozen() >= max) {
                living.hurt(level.damageSources().freeze(), 6.0F); // 2 hearts


                }



            }



        super.entityInside(state, level, pos, entity);
    }

}

