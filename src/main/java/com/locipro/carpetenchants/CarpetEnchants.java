package com.locipro.carpetenchants;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(CarpetEnchants.MODID)
public class CarpetEnchants
{
    public static final String MODID = "carpetenchants";
    private static final Logger LOGGER = LogUtils.getLogger();

    public CarpetEnchants(IEventBus modEventBus, ModContainer modContainer)
    {
//        NeoForge.EVENT_BUS.register(this);
    }

}
