package it.crystalnest.cobweb_mod_template;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.jetbrains.annotations.ApiStatus;

/**
 * Mod loader.
 */
@ApiStatus.Internal
@Mod(Constants.MOD_ID)
public final class ModLoader {
  /**
   * @param bus mod event bus for loader-specific registrations.
   */
  public ModLoader(IEventBus bus) {
    CommonModLoader.init();
  }
}
