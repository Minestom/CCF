package demo;

import net.minestom.ccf.CCFAbstraction;
import net.minestom.ccf.CCFGenerator;
import net.minestom.ccf.CCFRenderPass;

public class GeneratorImpl implements CCFGenerator {

    private static final String BLOCK_PASS = "blocks";

    @Override
    public void read(CCFAbstraction abstraction, CCFRenderPass renderPass, long x, long y, long z, byte[] data) {
        final String passName = renderPass.getName();
        if(passName.equals(BLOCK_PASS)){
            // TODO place block
        }
    }
}
