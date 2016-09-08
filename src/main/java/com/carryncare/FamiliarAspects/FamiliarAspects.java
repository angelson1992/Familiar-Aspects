package com.carryncare.FamiliarAspects;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = FamiliarAspects.MODID, version = FamiliarAspects.VERSION)
public class FamiliarAspects
{
    public static final String MODID = "FamiliarAspects";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        System.out.println("DIRT BLOCK >> "+Blocks.DIRT.getUnlocalizedName());

        Block myBlock = new Block(Material.CLOTH).setLightLevel(8).setHardness(0.25f).setCreativeTab(CreativeTabs.DECORATIONS).setUnlocalizedName("Hello World");
        GameRegistry.register(myBlock.setRegistryName("Hello World"));
        GameRegistry.register(new ItemBlock(myBlock).setRegistryName(myBlock.getRegistryName()));

    }
}
