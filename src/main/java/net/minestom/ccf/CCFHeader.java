package net.minestom.ccf;

import java.util.ArrayList;
import java.util.List;

/**
 * Contains the data needed to process the commands.
 */
public class CCFHeader {

    private final List<CCFAbstraction> abstractions = new ArrayList<>();
    private final List<CCFRenderPass> renderPasses = new ArrayList<>();

    public void createAbstraction(String name, String description, long sizeX, long sizeY, long sizeZ) {
        CCFAbstraction abstraction = new CCFAbstraction(name, description, sizeX, sizeY, sizeZ);
        this.abstractions.add(abstraction);
    }

    public void createRenderPass(String name, String description, int dataSize) {
        CCFRenderPass renderPass = new CCFRenderPass(name, description, dataSize);
        this.renderPasses.add(renderPass);
    }

}
