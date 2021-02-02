package net.minestom.ccf;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CCFInstance {

    private final List<CCFAbstraction> abstractions = new ArrayList<>();
    private final List<CCFRenderPass> renderPasses = new ArrayList<>();

    private CCFInstance() {

    }

    public static CCFInstance load(File file) {
        // TODO read header
        return new CCFInstance();
    }

    public static CCFInstance load(CCFHeader header) {
        return new CCFInstance();
    }

    public void execute(CCFAbstraction abstraction, long posX, long posY, long posZ, byte[] commands) {

    }

    public List<CCFAbstraction> getAbstractions() {
        return Collections.unmodifiableList(abstractions);
    }

    public List<CCFRenderPass> getRenderPasses() {
        return Collections.unmodifiableList(renderPasses);
    }
}
