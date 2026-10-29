package net.kdt.pojavlaunch.modloaders.modpacks.models;

import org.jetbrains.annotations.Nullable;

/**
 * Search filters, passed to APIs
 */
public class SearchFilters {
    public boolean isModpack;
    /** Modrinth project type: modpack, mod, resourcepack or shader */
    public String projectType = "modpack";
    public String name;
    @Nullable public String mcVersion;

}
