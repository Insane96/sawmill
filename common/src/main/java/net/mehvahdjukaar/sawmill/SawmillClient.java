package net.mehvahdjukaar.sawmill;

import net.mehvahdjukaar.moonlight.api.platform.ClientHelper;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.gui.screens.inventory.ShulkerBoxScreen;
import net.minecraft.client.renderer.RenderType;

public class SawmillClient {

    public static void init() {
        ClientHelper.addClientSetup(SawmillClient::setup);
    }

    private static void setup() {
        ClientHelper.registerRenderType(Sawmill.SAWMILL_BLOCK.get(), RenderType.cutout());
        MenuScreens.register(Sawmill.SAWMILL_MENU.get(), SawmillScreen::new);
    }
}