package net.minestom.ccf.command;

import net.minestom.ccf.CCFAbstraction;
import net.minestom.ccf.CCFLayer;

public class CCFCommandBuffer {

    private final CCFAbstraction abstraction;
    private final CCFLayer layer;

    public CCFCommandBuffer(CCFAbstraction abstraction, CCFLayer layer) {
        this.abstraction = abstraction;
        this.layer = layer;
    }

    public void append(CCFCommand command) {

    }

    public CCFAbstraction getAbstraction() {
        return abstraction;
    }

    public CCFLayer getlayer() {
        return layer;
    }
}
