package net.sirliamer.mcww1weapons.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.sirliamer.mcww1weapons.MCWW1Weapons;

public class ModItems {

    public static final Item SMALL_BULLET = registerItem("small_bullet",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MCWW1Weapons.MOD_ID, name), item);
    }
    public static void registerModItems() {
        MCWW1Weapons.LOGGER.debug("Registering Mod Items for " + MCWW1Weapons.MOD_ID);
    }
}
