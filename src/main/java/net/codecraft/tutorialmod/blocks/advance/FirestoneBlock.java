package net.codecraft.tutorialmod.blocks.advance;

import net.codecraft.tutorialmod.item.advance.FireStone;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class FirestoneBlock extends Block {
    public FirestoneBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
        FireStone.lightEntityOnFire(entityIn,7);
        super.onEntityWalk(worldIn, pos, entityIn);
    }
}
