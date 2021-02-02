package net.minestom.ccf;

/**
 * Interface implemented by every format.
 */
public interface CCFGenerator {

    void read(CCFAbstraction abstraction, CCFLayer layer, long x, long y, long z, byte[] data);

}
