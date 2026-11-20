package it.crystalnest.cobweb_mod_template.platform;

import it.crystalnest.cobweb_mod_template.platform.services.PlatformHelper;
import net.neoforged.fml.loading.FMLPaths;

import java.nio.file.Path;

/**
 * Implements the example platform service through NeoForge's path registry.
 */
public final class NeoForgePlatformHelper implements PlatformHelper {
  @Override
  public Path getGameDirectory() {
    return FMLPaths.GAMEDIR.get();
  }
}
