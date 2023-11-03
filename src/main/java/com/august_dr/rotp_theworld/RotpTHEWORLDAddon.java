package com.august_dr.rotp_theworld;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.august_dr.rotp_theworld.init.InitEntities;
import com.august_dr.rotp_theworld.init.InitSounds;
import com.august_dr.rotp_theworld.init.InitStands;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(RotpTHEWORLDAddon.MOD_ID)
public class RotpTHEWORLDAddon {
    // The value here should match an entry in the META-INF/mods.toml file
    public static final String MOD_ID = "rotp_theworld";
    private static final Logger LOGGER = LogManager.getLogger();

    public RotpTHEWORLDAddon() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        InitEntities.ENTITIES.register(modEventBus);
        InitSounds.SOUNDS.register(modEventBus);
        InitStands.ACTIONS.register(modEventBus);
        InitStands.STANDS.register(modEventBus);
    }

    public static Logger getLogger() {
        return LOGGER;
    }
}
