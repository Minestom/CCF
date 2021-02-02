package demo;

import net.minestom.ccf.CCFAbstraction;
import net.minestom.ccf.CCFGenerator;
import net.minestom.ccf.CCFInstance;
import net.minestom.ccf.CCFRenderPass;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        CCFGenerator generator = new GeneratorImpl();
        CCFInstance instance = CCFInstance.open(new File("test.ccf"), generator);

        for (CCFAbstraction abstraction : instance.getAbstractions()) {
            System.out.println("Abstraction name: " + abstraction.getName());
        }

        for (CCFRenderPass renderPass : instance.getRenderPasses()) {
            System.out.println("Render pass name: " + renderPass.getName());
        }

        // Load all chunks of the region[0;0;0]
        instance.load(instance.getAbstraction("region"), 0, 0, 0);

        // Load all the sections of the chunk[2048;0;2048]
        instance.load(instance.getAbstraction("chunk"), 2048, 0, 2048);

    }

}
