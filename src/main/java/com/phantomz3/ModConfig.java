package com.phantomz3;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;

@Config(name = LifestealMod.MOD_ID)
public class ModConfig implements ConfigData {
    public int maxHeartCap = 40;
    public boolean disableEnderPearl = false;
    public boolean disableCPVP = false;
    public boolean disableTotem = false;
    public boolean disableNetherite = false;
    public boolean noDragonEggEnderChest = true;
    public int riptideCooldown = 100; // 100 ticks = 5 seconds
    public boolean riptideCooldownEnabled = true;
}
