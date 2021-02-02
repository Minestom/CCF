package demo;

import net.minestom.ccf.CCFAbstraction;
import net.minestom.ccf.CCFGenerator;
import net.minestom.ccf.CCFInstance;
import net.minestom.ccf.CCFRenderPass;
import net.minestom.ccf.command.CCFCommandBuffer;
import net.minestom.ccf.command.type.CCFCuboidCommand;

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

        {
            // Load all chunks of the region[0;0;0]
            instance.load(instance.getAbstraction("region"), 0, 0, 0);

            // Load all the sections of the chunk[2048;0;2048]
            instance.load(instance.getAbstraction("chunk"), 2048, 0, 2048);
        }

        {
            // A command buffer can contain a list of commands ready to be executed
            // In this case the buffer interacts with a "chunk"
            CCFCommandBuffer commandBuffer = new CCFCommandBuffer(instance.getAbstraction("chunk"));

            CCFCuboidCommand cuboidCommand = new CCFCuboidCommand();
            cuboidCommand.endX = 5;
            cuboidCommand.endY = 16;
            cuboidCommand.endZ = 5;

            commandBuffer.append(cuboidCommand);

            // The command(s) will be executed for the chunk[0;0;0]
            instance.execute(commandBuffer, 0, 0, 0);
        }

    }

}
