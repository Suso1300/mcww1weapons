package net.sirliamer.mcww1weapons.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.sirliamer.mcww1weapons.MCWW1Weapons;

public class ModItems {
    public static final Item LARGE_BULLET = registerItem("large_bullet",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item SMALL_BULLET = registerItem("small_bullet",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item SHOTGUN_SHELL = registerItem("shotgun_shell",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item CASING = registerItem("casing",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item SANDBAG = registerItem("sandbag",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item BARBED_WIRE = registerItem("barbed_wire",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item RIFLE = registerItem("rifle",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item PISTOL = registerItem("pistol",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item TRENCH_GUN = registerItem("trench_gun",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item SNIPER = registerItem("sniper",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MCWW1Weapons.MOD_ID, name), item);
    }
    public static void registerModItems() {
        MCWW1Weapons.LOGGER.debug("Registering Mod Items for " + MCWW1Weapons.MOD_ID);
    }
}
