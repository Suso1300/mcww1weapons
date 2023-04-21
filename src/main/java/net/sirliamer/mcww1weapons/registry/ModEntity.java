package net.sirliamer.mcww1weapons.registry;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.sirliamer.mcww1weapons.MCWW1Weapons;
import net.sirliamer.mcww1weapons.entity.LargeBulletEntity;

public class ModEntity {

    public static final EntityType<LargeBulletEntity> LARGE_BULLET = register("large_bullet",
            FabricEntityTypeBuilder.create(SpawnGroup.MISC, LargeBulletEntity::new).dimensions(EntityDimensions.fixed(.25f,.25f)).build());

    private static <T extends Entity> EntityType<T> register(String name, EntityType<T> entity) {
        return Registry.register(Registry.ENTITY_TYPE, new Identifier(MCWW1Weapons.MOD_ID, name), entity);
    }
    public static void registerModEntities() {
        MCWW1Weapons.LOGGER.debug("Registering Mod Entities for " + MCWW1Weapons.MOD_ID);
    }



}
