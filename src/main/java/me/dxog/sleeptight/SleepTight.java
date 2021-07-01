package main.java.me.dxog.sleeptight;


import me.dxog.sleeptight.handler.MouseInputHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = SleepTight.MODID, version = SleepTight.VERSION)
public class SleepTight {
    public static final String MODID = "sleeptight";
    public static final String VERSION = "1.0.1";

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        MinecraftForge.EVENT_BUS.register(new MouseInputHandler());
    }
}
