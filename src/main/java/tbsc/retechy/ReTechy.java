package tbsc.retechy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;
import tbsc.retechy.api.IProxy;

/**
 * Main class of the mod.
 * Instead of everything happening here, it's all in proxies.
 *
 * @author tbsc on 22/12/2017
 */
@Mod(modid = Constants.MODID, version = Constants.VERSION)
public class ReTechy {

    @SidedProxy(clientSide = "tbsc.retechy.client.ClientProxy", serverSide = "tbsc.retechy.server.ServerProxy")
    public static IProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

    @EventHandler
    public void serverLoadStarting(FMLServerStartingEvent event) {
        proxy.serverLoadStarting(event);
    }

    @EventHandler
    public void imcMessageReceived(FMLInterModComms.IMCEvent event) {
        proxy.imcMessageReceived(event);
    }

}
