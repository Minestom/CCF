package net.minestom.ccf;

import net.minestom.ccf.command.CCFCommandBuffer;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CCFInstance {

    private final List<CCFAbstraction> abstractions = new ArrayList<>();
    private final List<CCFLayer> layers = new ArrayList<>();

    private CCFInstance() {

    }

    public static CCFInstance open(File file, CCFGenerator generator) {
        // TODO read header
        return new CCFInstance();
    }

    public static CCFInstance create(CCFHeader header, CCFGenerator generator) {
        return new CCFInstance();
    }

    public void execute(CCFCommandBuffer commandBuffer,
                        long posX, long posY, long posZ) {
        // Execute arbitrary commands
    }

    public void load(CCFAbstraction abstraction,
                     long posX, long posY, long posZ) {
        // Load from file
    }

    public <T> void fill(CCFCommandBuffer commandBuffer, CCFEncoder<T> encoder, T data) {
        encoder.encode(data, commandBuffer);
    }

    public void save(CCFCommandBuffer commandBuffer, long posX, long posY, long posZ) {

    }

    public void appendSave(CCFCommandBuffer commandBuffer, long posX, long posY, long posZ) {

    }

    public CCFAbstraction getAbstraction(String name) {
        return null;
    }

    public CCFLayer getLayer(String name) {
        return null;
    }

    public List<CCFAbstraction> getAbstractions() {
        return Collections.unmodifiableList(abstractions);
    }

    public List<CCFLayer> getLayers() {
        return Collections.unmodifiableList(layers);
    }
}
