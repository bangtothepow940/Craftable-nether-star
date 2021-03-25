package net.craftable.nether.star;

import net.minecraft.util.registry.Registry;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;

public class CraftNStar implements ModInitializer {

    public static final Item FORGOTTEN_SHARD = new Item(new Item.Settings().group(ItemGroup.MISC));

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("craftnstar", "forgotten_shard"), FORGOTTEN_SHARD);
    }
}