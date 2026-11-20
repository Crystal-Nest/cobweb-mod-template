package it.crystalnest.cobweb_mod_template;

import it.crystalnest.cobweb.api.platform.PlatformQueries;
import it.crystalnest.cobweb_mod_template.platform.Services;
import org.jetbrains.annotations.ApiStatus;

/**
 * Initializes shared mod functionality on both loaders.
 */
@ApiStatus.Internal
public final class CommonModLoader {
  private CommonModLoader() {}

  /**
   * Initializes shared functionality and reports completion of common setup.
   */
  public static void init() {
    Constants.LOGGER.debug("Initializing {} on {} in {}", Constants.MOD_ID, PlatformQueries.loader(), PlatformQueries.environment());
    Constants.LOGGER.debug("Initialized {} with game directory {}", Constants.MOD_ID, Services.PLATFORM.getGameDirectory());
  }
}
