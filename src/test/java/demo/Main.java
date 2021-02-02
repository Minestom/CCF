package demo;

import net.minestom.ccf.*;
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

        for (CCFLayer layer : instance.getLayers()) {
            System.out.println("Render pass name: " + layer.getName());
        }

        {
            // Load all chunks of the region[0;0;0]
            instance.load(instance.getAbstraction("region"), 0, 0, 0);

            // Load all the sections of the chunk[2048;0;2048]
            instance.load(instance.getAbstraction("chunk"), 2048, 0, 2048);
        }

        {
            // A command buffer can contain a list of commands ready to be executed
            // In this case the buffer interacts with a "chunk" and affects the "blocks" render pass
            CCFCommandBuffer commandBuffer = new CCFCommandBuffer(
                    instance.getAbstraction("chunk"),
                    instance.getLayer("blocks"));

            CCFCuboidCommand cuboidCommand = new CCFCuboidCommand();
            cuboidCommand.endX = 5;
            cuboidCommand.endY = 16;
            cuboidCommand.endZ = 5;
            cuboidCommand.data = new byte[]{0, 1};

            commandBuffer.append(cuboidCommand);

            // The command(s) will be executed for the chunk[0;0;0]
            instance.execute(commandBuffer, 0, 0, 0);
        }

        {
            CCFCommandBuffer commandBuffer = new CCFCommandBuffer(
                    instance.getAbstraction("chunk"),
                    instance.getLayer("blocks"));
            CCFEncoder<byte[]> encoder = null;
            byte[] chunkData = new byte[]{0, 0, 0, 0};

            // Fill the command buffer given the encoder and the data to encode
            instance.fill(commandBuffer, encoder, chunkData);
            // After getting the buffer, save it to file (chunk[1;0;0])
            instance.save(commandBuffer, 1, 0, 0);
        }

    }

    private static void fromHeader() {

        // Allow to create a CCFInstance from an header only.
        // Useful if you want to execute commands without having a world file

        CCFHeader header = new CCFHeader();
        header.createAbstraction("chunk", "An amazing chunk", 16, 256, 16);
        header.createLayer("blocks", "Amazing blocks", 2);

        CCFGenerator generator = new GeneratorImpl();
        CCFInstance instance = CCFInstance.create(header, generator);
    }

}
