package victors.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static victors.victors.Victors.MODID;


@Mod("victors")
public class Blocks{



	private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);

	public static final RegistryObject<Block> PATRICK = BLOCKS.register("patrick", new
			Block(BlockBehaviour.Properties.of(Material.CLAY)));


	public <T extends Block> RegistryObject<Block> getPatrick() {

		return PATRICK;

	}

}
