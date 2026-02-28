package net.galaxyxidorn.thermodynamics.datagen;

import net.galaxyxidorn.thermodynamics.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import static net.galaxyxidorn.thermodynamics.Thermodynamics.MOD_ID;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //basicItem(ModItems.CRYODUST.get());
        //basicItem(ModItems.CRYONITECRYSTAL.get());
        basicItem(ModItems.CRYOFLUID_BUCKET.get());
        basicItem(ModItems.MOLTEN_SULFUR_BUCKET.get());
        basicItem(ModItems.MOLTEN_SODIUM_BUCKET.get());
        basicItem(ModItems.MOLTEN_NAPHTHALENE_BUCKET.get());
        basicItem(ModItems.COAL_TAR_BUCKET.get());
        basicItem(ModItems.CRYONITE_ALLOY.get());
        basicItem(ModItems.SALT.get());
        basicItem(ModItems.WICK.get());
        basicItem(ModItems.WHITE_TAR.get());
        basicItem(ModItems.SULFUR.get());
    }
}
