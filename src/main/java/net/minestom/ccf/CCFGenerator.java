package net.minestom.ccf;

/**
 * Interface implemented by every format.
 */
public interface CCFGenerator {

    void read(CCFAbstraction abstraction, CCFRenderPass renderPass, long x, long y, long z, byte[] data);

}
