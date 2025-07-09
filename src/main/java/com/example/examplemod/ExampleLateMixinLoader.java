package com.example.examplemod;

import java.util.ArrayList;
import java.util.List;

import cpw.mods.fml.common.Loader;
import io.github.tox1cozz.mixinbooterlegacy.ILateMixinLoader;
import io.github.tox1cozz.mixinbooterlegacy.LateMixin;

@LateMixin
public class ExampleLateMixinLoader implements ILateMixinLoader {

	@Override
	public List<String> getMixinConfigs() {
		List<String> mixinConfigs = new ArrayList<>();
		if(Loader.isModLoaded("NotEnoughItems")) {
			mixinConfigs.add("examplemod.mixins.nei.json");
		}
		return mixinConfigs;
	}
}
