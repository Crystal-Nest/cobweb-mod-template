![Cobweb Mod Template banner](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/cobweb-mod-template/banner.png "Cobweb Mod Template banner")

---

![Minecraft](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/minecraft/minecraft.svg "Minecraft")[![26.3](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/minecraft/26-3.svg "26.3")](https://modrinth.com/mod/cobweb-mod-template/versions?g=26.3)![Separator](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/separator.svg)[![26.2](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/minecraft/26-2.svg "26.2")](https://modrinth.com/mod/cobweb-mod-template/versions?g=26.2)![Separator](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/separator.svg)[![26.1.x](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/minecraft/26-1-x.svg "26.1.x")](https://modrinth.com/mod/cobweb-mod-template/versions?g=26.1)

![Loader](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/loader/loader.svg "Loader")[![NeoForge](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/loader/neoforge.svg "NeoForge")](https://modrinth.com/mod/cobweb-mod-template/versions?l=neoforge)![Separator](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/separator.svg)[![Fabric](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/loader/fabric.svg "Fabric")](https://modrinth.com/mod/cobweb-mod-template/versions?l=fabric)

![Overlay](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/side/client-server.svg)

![Issues](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/github/issues.svg "Issues")[![GitHub](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/github/github.svg "GitHub")](https://github.com/crystal-nest/cobweb-mod-template/issues)

---

## 📝 **Description**

Multiloader skeleton for Minecraft mods!  
Built on [Jared's MultiLoaderTemplate](https://github.com/jaredlll08/MultiLoader-Template), with the addition of:

- Tasks to publish on Maven, GitHub, Modrinth, and CurseForge.
- [Cobweb](https://modrinth.com/mod/cobweb) API dependency.
- An example loader-specific service with Fabric and NeoForge implementations.
- A little bit more Javadoc.
- Code style changes.

***Note: the intended use of this template is to create a repository from it, and then update each branch with the content built by our [official generator](https://crystalnest.it/#/generator).***

## 🛠️ **Setup completion**

To complete the setup:

- Change the [Support us](#-support-the-nest) section and the banner link.
- Add your project CurseForge ID in the `gradle.properties`.
- Replace the template mod ID, package names, service descriptors, resource paths and project metadata with your own.
- Update the changelog with proper release notes.

## ⚙️ **Configuration**

To add configuration to your mod, [Fzzy Config](https://github.com/fzzyhmstrs/fconfig) is suggested (but not mandatory).
See the [Fzzy Config documentation](https://moddedmc.wiki/en/project/fzzy-config/latest/docs/config-design/New-Configs) for a quick setup.

## 🔩 **Loader-specific services**

Use Cobweb's `PlatformQueries` for loader/environment and mod-presence queries. The example `PlatformHelper` returns the game directory through Fabric Loader or NeoForge's path registry.

For another loader-specific operation, add a common service interface, provide an implementation in each loader module and declare it in that module's `META-INF/services` file. `Services` resolves the implementation from common code. Keep each descriptor's filename and implementation name aligned when renaming packages.

## 🗑️ **Removing Platforms and Loaders**

While this template includes support for Fabric and NeoForge, you can easily remove support for the ones you don't need.  
This can be done by deleting the subproject folder and then removing it from the associated `include` in the `settings.gradle` file, along with deleting the related Gradle properties.

The same thing applies for the different publishing platforms, Maven, GitHub, Modrinth, and CurseForge.  
To remove support for the ones you don't need just remove the section and properties regarding them.

## 📜 **License and right of use**

Feel free to use this mod template for any mod, just be sure to give credit and possibly link [here](https://github.com/crystal-nest/cobweb-mod-template#readme).  
This project is published under the [GNU General Public License v3.0](https://github.com/crystal-nest/cobweb-mod-template/blob/master/LICENSE).

## ❤️ **Support the Nest**

<a href="https://crystalnest.it"><img alt="Crystal Nest Website" src="https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/crystal-nest/pic512.png" width="14.286%"></a><a href="https://discord.gg/BP6EdBfAmt"><img alt="Discord" src="https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/discord/discord512.png" width="14.286%"></a><a href="https://www.patreon.com/crystalspider"><img alt="Patreon" src="https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/patreon/patreon512.png" width="14.286%"></a><a href="https://ko-fi.com/crystalspider"><img alt="Ko-fi" src="https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/kofi/kofi512.png" width="14.286%"></a><a href="https://github.com/Crystal-Nest"><img alt="Our other projects" src="https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/github/github512.png" width="14.286%"></a><a href="https://modrinth.com/organization/crystal-nest"><img alt="Modrinth" src="https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/modrinth/modrinth512.png" width="14.286%"></a><a href="https://www.curseforge.com/members/crystalspider/projects"><img alt="CurseForge" src="https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/curseforge/curseforge512.png" width="14.286%"></a>

[![Bisect Hosting](https://www.bisecthosting.com/partners/custom-banners/d559b544-474c-4109-b861-1b2e6ca6026a.webp "Bisect Hosting")](https://bisecthosting.com/crystalspider)
