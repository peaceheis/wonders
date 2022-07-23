package io.github.debuggyteam.wonders.block;

import io.github.debuggyteam.wonders.util.WondersRegistry;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.Direction;
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;

public class WondersBlocks {
	public static final Block TEST_BLOCK = WondersRegistry.registerBlock("test_block", createBlock(Material.WOOD, 2.0f));
	public static final Block PALM_LOG = WondersRegistry.registerBlock("palm_log", new PillarBlock(
			QuiltBlockSettings.copy(Blocks.OAK_LOG).sounds(BlockSoundGroup.WOOD).strength(2.0f)
	));

	public static final Block PALM_WOOD = WondersRegistry.registerBlock("palm_wood", new PillarBlock(
			QuiltBlockSettings.copy(Blocks.OAK_WOOD).sounds(BlockSoundGroup.WOOD).strength(2.0f)
	));

	public static final Block STRIPPED_PALM_LOG = WondersRegistry.registerBlock("stripped_palm_log", new PillarBlock(
			QuiltBlockSettings.copy(Blocks.STRIPPED_OAK_LOG).sounds(BlockSoundGroup.WOOD).strength(2.0f)
	));

	public static final Block STRIPPED_PALM_WOOD = WondersRegistry.registerBlock("stripped_palm_wood", new PillarBlock(
			QuiltBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD).sounds(BlockSoundGroup.WOOD).strength(2.0f)
	));

	private static Block createBlock(Material material, Float strength){
		return new Block(QuiltBlockSettings.of(material).strength(strength));
	}

	public static void init(){

	}
}
