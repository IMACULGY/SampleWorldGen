
package org.terasology.sampleWorldGen;

import org.terasology.entitySystem.Component;
import org.terasology.world.generation.FacetProvider;

public interface ConfigurableFacetProvider extends FacetProvider {
    String getConfigurationName();

    Component getConfiguration();

    void setConfiguration(Component configuration);
}