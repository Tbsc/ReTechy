package tbsc.retechy.api;

import net.minecraftforge.fml.common.event.*;

/**
 * Base interface for all proxy implementations.
 *
 * @author tbsc on 22/12/2017
 */
public interface IProxy {

    /**
     * Pre-initialization proxy event handler.
     * @param event Pre-initialization event object
     */
    void preInit(FMLPreInitializationEvent event);

    /**
     * Pre-initialization proxy event handler.
     * @param event Pre-initialization event object
     */
    void init(FMLInitializationEvent event);

    /**
     * Pre-initialization proxy event handler.
     * @param event Pre-initialization event object
     */
    void postInit(FMLPostInitializationEvent event);

    /**
     * Pre-initialization proxy event handler.
     * @param event Pre-initialization event object
     */
    void serverLoadStarting(FMLServerStartingEvent event);

    /**
     * IMC (Inter-Mod Communication) message received
     * @param event IMC message event object
     */
    void imcMessageReceived(FMLInterModComms.IMCEvent event);

}
