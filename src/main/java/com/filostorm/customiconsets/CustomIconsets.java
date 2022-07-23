package com.filostorm.customiconsets;

import org.apache.logging.log4j.Logger;

import com.filostorm.customiconsets.config.CustomIconsetConfig;

import gregtech.api.unification.material.info.MaterialIconSet;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = CustomIconsets.MODID, name = CustomIconsets.NAME, version = CustomIconsets.VERSION, dependencies = "required-before:gregtech@[2.0.0-beta,);")
public class CustomIconsets
{
    public static final String MODID = "custom_iconsets";
    public static final String NAME = "Custom Iconsets";
    public static final String VERSION = "0.0.1";

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        Logger logger = event.getModLog();
        
        logger.info("Adding custom icon sets!");
        for (String iconset : CustomIconsetConfig.iconsets) {
            new MaterialIconSet(iconset);
        }
    }
}
