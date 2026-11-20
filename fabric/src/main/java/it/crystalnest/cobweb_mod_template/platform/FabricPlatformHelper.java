package it.crystalnest.cobweb_mod_template.platform;

import it.crystalnest.cobweb_mod_template.platform.services.PlatformHelper;
import net.fabricmc.loader.api.FabricLoader;

import java.nio.file.Path;

/**
 * Implements the example platform service through Fabric Loader.
 */
public final class FabricPlatformHelper implements PlatformHelper {
  @Override
  public Path getGameDirectory() {
    return FabricLoader.getInstance().getGameDir();
  }
}
