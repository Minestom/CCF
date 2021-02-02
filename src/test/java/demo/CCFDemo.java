package demo;

import net.minestom.ccf.CCFAbstraction;
import net.minestom.ccf.CCFInstance;
import net.minestom.ccf.CCFRenderPass;

import java.io.File;

public class CCFDemo {

    public static void main(String[] args) {
        CCFInstance instance = CCFInstance.load(new File("test.ccf"));

        for (CCFAbstraction abstraction : instance.getAbstractions()) {
            System.out.println("Abstraction name: " + abstraction.getName());
        }

        for (CCFRenderPass renderPass : instance.getRenderPasses()) {
            System.out.println("Render pass name: " + renderPass.getName());
        }

    }

}
