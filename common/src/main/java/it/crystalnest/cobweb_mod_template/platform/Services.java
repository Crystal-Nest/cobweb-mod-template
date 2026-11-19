package it.crystalnest.cobweb_mod_template.platform;

import it.crystalnest.cobweb_mod_template.Constants;
import it.crystalnest.cobweb_mod_template.platform.services.PlatformHelper;

import java.util.ServiceLoader;

/**
 * Resolves common service interfaces to the implementation supplied by the active loader module.
 * Extend this pattern when an operation needs different Fabric and NeoForge implementations.
 */
public final class Services {
  /**
   * Example service implemented independently by Fabric and NeoForge.
   */
  public static final PlatformHelper PLATFORM = load(PlatformHelper.class);

  private Services() {}

  /**
   * Loads the implementation declared in the loader module's {@code META-INF/services} file.
   * The file is named after the interface and contains its implementation's fully qualified class name.
   *
   * @param clazz service interface to resolve.
   * @param <T> service type.
   * @return implementation for this loader.
   * @throws IllegalStateException if no implementation is declared.
   */
  private static <T> T load(Class<T> clazz) {
    T implementation = ServiceLoader.load(clazz).findFirst().orElseThrow(() -> new IllegalStateException("Failed to load service for " + clazz.getName()));
    Constants.LOGGER.debug("Loaded {} for service {}", implementation.getClass().getName(), clazz.getName());
    return implementation;
  }
}
