package demo;

import net.minestom.ccf.CCFAbstraction;
import net.minestom.ccf.CCFGenerator;
import net.minestom.ccf.CCFLayer;

public class GeneratorImpl implements CCFGenerator {

    private static final String BLOCK_PASS = "blocks";

    @Override
    public void read(CCFAbstraction abstraction, CCFLayer layer, long x, long y, long z, byte[] data) {
        final String layerName = layer.getName();
        if (layerName.equals(BLOCK_PASS)) {
            // TODO place block
        }
    }
}
