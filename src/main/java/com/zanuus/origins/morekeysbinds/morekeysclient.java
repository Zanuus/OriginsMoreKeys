package com.zanuus.origins.morekeysbinds;

import io.github.apace100.origins.Origins;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.options.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

import static io.github.apace100.origins.OriginsClient.registerPowerKeybinding;

public class morekeysclient implements ClientModInitializer {

    public static KeyBinding useTertiaryActivePowerKeybind;

    @Override
    public void onInitializeClient() {
        useTertiaryActivePowerKeybind = new KeyBinding("key.origins.tertiary_active", InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_UNKNOWN, "category." + Origins.MODID);

        registerPowerKeybinding("key.origins.tertiary_active", useTertiaryActivePowerKeybind);
        registerPowerKeybinding("tertiary", useTertiaryActivePowerKeybind);
        KeyBindingHelper.registerKeyBinding(useTertiaryActivePowerKeybind);
    }
}