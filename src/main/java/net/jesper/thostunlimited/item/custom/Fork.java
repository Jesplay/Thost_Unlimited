package net.jesper.thostunlimited.item.custom;

import net.jesper.thostunlimited.block.ModBlocks;
import net.jesper.thostunlimited.block.custom.Thoster;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageSources;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.registries.RegistryObject;

public class Fork extends Item {
    public Fork(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        if(!pContext.getLevel().isClientSide()) {
            Level level = pContext.getLevel();
            Player player = pContext.getPlayer();
            BlockPos blockpos = pContext.getClickedPos();
            if (level.getBlockState(blockpos).is(ModBlocks.THORIUM.get())){
                player.hurt(player.damageSources().lightningBolt(), 10);
                return  InteractionResult.SUCCESS;
            }

        }
        return InteractionResult.FAIL;
    }
}

