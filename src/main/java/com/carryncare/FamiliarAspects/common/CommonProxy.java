package com.carryncare.FamiliarAspects.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by John on 9/8/2016.
 */
public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {

    }

    public void init(FMLInitializationEvent e) {

        Block myBlock = new Block(Material.CLOTH).setLightLevel(8).setHardness(0.25f).setCreativeTab(CreativeTabs.DECORATIONS).setUnlocalizedName("Hello World");
        GameRegistry.register(myBlock.setRegistryName("Hello World"));
        GameRegistry.register(new ItemBlock(myBlock).setRegistryName(myBlock.getRegistryName()));

    }

    public void postInit(FMLPostInitializationEvent e) {

    }

}
