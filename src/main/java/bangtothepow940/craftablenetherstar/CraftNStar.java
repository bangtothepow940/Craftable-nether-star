package bangtothepow940.craftablenetherstar;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod(CraftNStar.MOD_ID)
public class CraftNStar {
	public static final String MOD_ID = "craftnstar";
	
	public CraftNStar() {
		MinecraftForge.EVENT_BUS.register(this);
		Registration.init();
	}
	
	public static class Registration {
		public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CraftNStar.MOD_ID);
		
		public static void init() {
			ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		}
		
		public static final RegistryObject<Item> FORGOTTEN_SHARD = ITEMS.register("forgotten_shard", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));
		
	}
}
