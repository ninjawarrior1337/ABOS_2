package com.ninjawarrior1337.abos;


import net.minecraft.client.main.Main;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


import static com.ninjawarrior1337.abos.Reference.MODID;

@Mod(modid = MODID, name = Reference.MODNAME, version = Reference.VERSION)
public class abos
{

    @SidedProxy(clientSide="com.ninjawarrior1337.abos.ClientProxy", serverSide="com.ninjawarrior1337.abos.ServerProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent e)
    {
        System.out.println("Starting Pre Init");
        this.proxy.preInit(e);
    }
    @EventHandler
    public void init(FMLInitializationEvent e)
    {
        System.out.println("Starting Init");
        this.proxy.init(e);
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent e)
    {
        System.out.println("Starting Post Init");
        System.out.println("9+10=21");
        this.proxy.postInit(e);
    }
}
