package com.nekokittygames.thaumictinkerer.common.config;


import com.nekokittygames.thaumictinkerer.common.libs.LibMisc;
import net.minecraftforge.common.config.Config;

@Config(modid = LibMisc.MOD_ID)
@Config.LangKey("thaumictinkerer.config.title")
public class TTConfig {
    @Config.Comment("This is the amount of uses given to the Talisman of Remedium.")
    @Config.Name("Talisman of Remedium Uses")
    @Config.LangKey("thaumictinkerer.config.talisman")
    @Config.RangeInt(min=0)
    public static int talismanUses=100;


    @Config.Comment("This is the distance a block can be from a Transvector Interface")
    @Config.Name("Transvector Interface Distance")
    @Config.LangKey("thaumictinkerer.config.transvector_interface.distance")
    @Config.RangeInt(min=0)
    public static int transvectorInterfaceDistance=4;

    @Config.Comment("This is the distance a block can be from a Transvector Dislocator")
    @Config.Name("Transvector Dislocator Distance")
    @Config.LangKey("thaumictinkerer.config.transvector_dislocator.distance")
    @Config.RangeInt(min=0)
    public static int transvectorDislocatorDistance=10;

    @Config.Comment("Can Tinkers Construct tools be repaired in the repairer?")
    @Config.Name("Tinkers Construct Compatibility")
    @Config.LangKey("thaumictinkerer.config.ticon.compatibility")
    public static boolean TiConCompatibility=true;
}
