package com.august_dr.rotp_theworld.init;

import java.util.function.Supplier;

import com.august_dr.rotp_theworld.RotpTHEWORLDAddon;
import com.github.standobyte.jojo.init.ModSounds;
import com.github.standobyte.jojo.util.mc.MultiSoundEvent;
import com.github.standobyte.jojo.util.mc.OstSoundList;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class InitSounds {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, RotpTHEWORLDAddon.MOD_ID);
    
    public static final Supplier<SoundEvent> THE_WORLD_PUNCH_LIGHT = ModSounds.STAND_PUNCH_LIGHT;

    public static final Supplier<SoundEvent> THE_WORLD_UNSUMMON = ModSounds.STAND_UNSUMMON_DEFAULT;
    public static final Supplier<SoundEvent> THE_WORLD_PUNCH_HEAVY = ModSounds.STAND_PUNCH_HEAVY;
    
    public static final Supplier<SoundEvent> THE_WORLD_BARRAGE = ModSounds.STAND_PUNCH_LIGHT;
    public static final RegistryObject<SoundEvent> THE_WORLD_SUMMON = SOUNDS.register("the_world_summon",
            () -> new SoundEvent(new ResourceLocation(RotpTHEWORLDAddon.MOD_ID, "the_world_summon")));

    public static final RegistryObject<SoundEvent> THE_WORLD_MUDA = SOUNDS.register("the_world_muda",
            () -> new SoundEvent(new ResourceLocation(RotpTHEWORLDAddon.MOD_ID, "the_world_muda")));

    public static final RegistryObject<SoundEvent> THE_WORLD_MUDA_LONG = SOUNDS.register("the_world_muda_long",
            () -> new SoundEvent(new ResourceLocation(RotpTHEWORLDAddon.MOD_ID, "the_world_muda_long")));

    public static final RegistryObject<SoundEvent> THE_WORLD_MUDA_MUDA_MUDA = SOUNDS.register("the_world_muda_muda_muda",
            () -> new SoundEvent(new ResourceLocation(RotpTHEWORLDAddon.MOD_ID, "the_world_muda_muda_muda")));

    public static final RegistryObject<SoundEvent> THE_WORLD_TIME_STOP = SOUNDS.register("the_world_time_stop",
            () -> new SoundEvent(new ResourceLocation(RotpTHEWORLDAddon.MOD_ID, "the_world_time_stop")));

    public static final RegistryObject<SoundEvent> THE_WORLD_TIME_RESUME = SOUNDS.register("the_world_time_resume",
            () -> new SoundEvent(new ResourceLocation(RotpTHEWORLDAddon.MOD_ID, "the_world_time_resume")));

    public static final RegistryObject<SoundEvent> THE_WORLD_TIME_STOP_BLINK = SOUNDS.register("the_world_time_stop_blink",
            () -> new SoundEvent(new ResourceLocation(RotpTHEWORLDAddon.MOD_ID, "the_world_time_stop_blink")));

    public static final RegistryObject<SoundEvent> DIEGO_THE_WORLD = SOUNDS.register("Diego_the_world",
            () -> new SoundEvent(new ResourceLocation(RotpTHEWORLDAddon.MOD_ID, "Diego_the_world")));

    public static final RegistryObject<SoundEvent> DIEGO_MUDA = SOUNDS.register("Diego_muda",
            () -> new SoundEvent(new ResourceLocation(RotpTHEWORLDAddon.MOD_ID, "Diego_muda")));

    public static final RegistryObject<SoundEvent> DIEGO_MUDA_MUDA = SOUNDS.register("Diego_muda_muda",
            () -> new SoundEvent(new ResourceLocation(RotpTHEWORLDAddon.MOD_ID, "Diego_muda_muda")));

    public static final RegistryObject<SoundEvent> DIEGO_WRY = SOUNDS.register("Diego_wry",
            () -> new SoundEvent(new ResourceLocation(RotpTHEWORLDAddon.MOD_ID, "Diego_wry")));

    public static final RegistryObject<SoundEvent> DIEGO_DIE = SOUNDS.register("Diego_die",
            () -> new SoundEvent(new ResourceLocation(RotpTHEWORLDAddon.MOD_ID, "Diego_die")));

    public static final RegistryObject<SoundEvent> DIEGO_THIS_IS_THE_WORLD = SOUNDS.register("Diego_this_is_the_world",
            () -> new SoundEvent(new ResourceLocation(RotpTHEWORLDAddon.MOD_ID, "Diego_this_is_the_world")));

    public static final RegistryObject<SoundEvent> DIEGO_TIME_STOP = SOUNDS.register("Diego_time_stop",
            () -> new MultiSoundEvent(new ResourceLocation(RotpTHEWORLDAddon.MOD_ID, "Diego_toki_yo_tomare"), new ResourceLocation(RotpTHEWORLDAddon.MOD_ID, "Diego_tomare_toki_yo")));

    public static final RegistryObject<SoundEvent> DIEGO_TIME_RESUMES = SOUNDS.register("Diego_time_resumes",
            () -> new SoundEvent(new ResourceLocation(RotpTHEWORLDAddon.MOD_ID, "Diego_time_resumes")));

    public static final RegistryObject<SoundEvent> DIEGO_TIMES_UP = SOUNDS.register("Diego_times_up",
            () -> new MultiSoundEvent(new ResourceLocation(RotpTHEWORLDAddon.MOD_ID, "Diego_time_resumes"),
                    new ResourceLocation(RotpTHEWORLDAddon.MOD_ID, "Diego_times_up"), new ResourceLocation(RotpTHEWORLDAddon.MOD_ID, "Diego_zero")));

    public static final RegistryObject<SoundEvent> DIEGO_5_SECONDS = SOUNDS.register("Diego_5_seconds",
            () -> new SoundEvent(new ResourceLocation(RotpTHEWORLDAddon.MOD_ID, "Diego_5_seconds")));

    public static final RegistryObject<SoundEvent> DIEGO_ONE_MORE = SOUNDS.register("Diego_one_more",
            () -> new SoundEvent(new ResourceLocation(RotpTHEWORLDAddon.MOD_ID, "Diego_one_more")));

    public static final RegistryObject<SoundEvent> DIEGO_CANT_MOVE = SOUNDS.register("Diego_cant_move",
            () -> new SoundEvent(new ResourceLocation(RotpTHEWORLDAddon.MOD_ID, "Diego_cant_move")));


    static final OstSoundList THE_WORLD_OST = new OstSoundList(new ResourceLocation(RotpTHEWORLDAddon.MOD_ID, "THE_WORLD_ost"), SOUNDS);

}
