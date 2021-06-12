package me.dxog.sleeptight.handler;

import ibxm.Player;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ItemInteractionHandler {
    @SubscribeEvent
    public void onPlayerInteract(PlayerInteractEvent e) {
        if (e.entityPlayer.inventory.currentItem == 8 && e.entityPlayer.inventory.getCurrentItem() != null) {
            if (e.entityPlayer.inventory.getCurrentItem().getDisplayName().contains("Return to Lobby")) {
                e.setCanceled(true);
                Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText(EnumChatFormatting.BLACK + "[" +
                        EnumChatFormatting.LIGHT_PURPLE + "ST" + EnumChatFormatting.BLACK + "] " + EnumChatFormatting.GRAY +
                        "Sleep Tight prevented you from accidentally leaving mid-game."));
            }
        }
    }
}
