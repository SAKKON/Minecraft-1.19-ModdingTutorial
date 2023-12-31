package com.sakkon.tutorialmod.items;

import com.sakkon.tutorialmod.TutorialMod;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
	
	public static final DeferredRegister<Item> ITEMS = 
			DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);
	
	public static final RegistryObject<Item> ZIRCON = ITEMS.register("zircon",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	public static final RegistryObject<Item> DEMONITE = ITEMS.register("demonite",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	public static void register(IEventBus eventbus) {
		ITEMS.register(eventbus);
	}

}
