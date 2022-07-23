package com.filostorm.customiconsets.config;

import com.filostorm.customiconsets.CustomIconsets;

import net.minecraftforge.common.config.Config;

@Config(modid = CustomIconsets.MODID)
public class CustomIconsetConfig {
    
    @Config.Comment("The new icon sets you want to add")
    @Config.Name("Custom Icon Sets")
    @Config.RequiresMcRestart
    public static String[] iconsets = {};

}
