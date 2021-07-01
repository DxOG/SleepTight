package me.dxog.sleeptight.handler;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.MovingObjectPosition;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.MouseInputEvent;
import org.lwjgl.input.Mouse;

public class ItemInteractionHandler {
    @SubscribeEvent
    public void onMouseInput(MouseInputEvent e) {
        if (Mouse.getEventButtonState()) {
            if (Minecraft.getMinecraft().thePlayer.inventory.currentItem == 8 && Minecraft.getMinecraft().thePlayer.inventory.getCurrentItem() != null) {
                if (Minecraft.getMinecraft().thePlayer.inventory.getCurrentItem().getDisplayName().contains("Return to Lobby")) {
                    if (Minecraft.getMinecraft().gameSettings.keyBindAttack.isPressed() || Minecraft.getMinecraft().gameSettings.keyBindUseItem.isPressed()) { // This is extremely stupid but for some odd reason the keypresses do not get cancelled without it. x)
                        switch (Mouse.getEventButton()) {
                            case 0:
                                KeyBinding.setKeyBindState(Minecraft.getMinecraft().gameSettings.keyBindAttack.getKeyCode(), false);
                                break;
                            case 1:
                                KeyBinding.setKeyBindState(Minecraft.getMinecraft().gameSettings.keyBindUseItem.getKeyCode(), false);
                                break;
                        }
                    }
                    Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText(EnumChatFormatting.BLACK + "[" +
                            EnumChatFormatting.LIGHT_PURPLE + "ST" + EnumChatFormatting.BLACK + "] " + EnumChatFormatting.GRAY +
                            "Sleep Tight prevented you from accidentally leaving mid-game."));
                }
            }
        }
    }
}
