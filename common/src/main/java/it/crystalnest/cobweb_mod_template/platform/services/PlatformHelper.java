package it.crystalnest.cobweb_mod_template.platform.services;

import it.crystalnest.cobweb.api.platform.PlatformQueries;

import java.nio.file.Path;

/**
 * Example service for operations implemented through each loader's native API.
 * Use {@link PlatformQueries} for loader, environment and mod-presence queries.
 */
public interface PlatformHelper {
  /**
   * Returns the loader's game directory for this instance.
   *
   * @return game directory.
   */
  Path getGameDirectory();
}
