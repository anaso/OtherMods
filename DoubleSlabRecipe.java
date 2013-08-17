package anaso.OtherMods;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod
(
	modid = "DoubleSlabRecipe",
	name = "DoubleSlabRecipe",
	version = "1.5.2"
)

@NetworkMod
(
		clientSideRequired = true
)

public class DoubleSlabRecipe
{
	@EventHandler
	public void ModInit(FMLInitializationEvent event)
	{
		GameRegistry.addRecipe(
			new ItemStack(Block.stoneDoubleSlab, 1),
			new Object[]{"X","X",Character.valueOf('X'),Block.stoneSingleSlab}
		);
	}
}