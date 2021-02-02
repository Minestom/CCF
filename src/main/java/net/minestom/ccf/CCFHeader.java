package net.minestom.ccf;

import java.util.ArrayList;
import java.util.List;

/**
 * Contains the data needed to process the commands.
 */
public class CCFHeader {

    private final List<CCFAbstraction> abstractions = new ArrayList<>();
    private final List<CCFLayer> layers = new ArrayList<>();

    public void createAbstraction(String name, String description, long sizeX, long sizeY, long sizeZ) {
        CCFAbstraction abstraction = new CCFAbstraction(name, description, sizeX, sizeY, sizeZ);
        this.abstractions.add(abstraction);
    }

    public void createLayer(String name, String description, int dataSize) {
        CCFLayer layer = new CCFLayer(name, description, dataSize);
        this.layers.add(layer);
    }

}
