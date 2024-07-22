package com.bv.brazilianfoods.item;

import com.bv.brazilianfoods.BrazilianFoods;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup BRAZILIAN_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BrazilianFoods.MOD_ID, "brazilian"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.brazilian"))
                    .icon(() -> new ItemStack(ModItems.PAN)).entries((displayContext, entries) -> {
                        entries.add(ModItems.PAN);
                        entries.add(ModItems.FRYING_PAN);



                    }).build());

    public static void registerItemGroups() {
        BrazilianFoods.LOGGER.info("Registering Item Groups for " + BrazilianFoods.MOD_ID);
    }
}
