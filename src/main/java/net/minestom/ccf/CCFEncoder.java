package net.minestom.ccf;

import net.minestom.ccf.command.CCFCommandBuffer;

public interface CCFEncoder<T> {

    void encode(T data, CCFCommandBuffer commandBuffer);

}
