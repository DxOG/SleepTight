package main.java.me.dxog.sleeptight;


import me.dxog.sleeptight.handler.ItemInteractionHandler;
import net.minecraft.init.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = SleepTight.MODID, version = SleepTight.VERSION)
public class SleepTight {
    public static final String MODID = "sleeptight";
    public static final String VERSION = "1.0.0";

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        MinecraftForge.EVENT_BUS.register(new ItemInteractionHandler());
    }
}
