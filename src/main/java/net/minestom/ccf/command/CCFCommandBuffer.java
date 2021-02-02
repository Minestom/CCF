package net.minestom.ccf.command;

import net.minestom.ccf.CCFAbstraction;
import net.minestom.ccf.CCFRenderPass;

public class CCFCommandBuffer {

    private final CCFAbstraction abstraction;
    private final CCFRenderPass renderPass;

    public CCFCommandBuffer(CCFAbstraction abstraction, CCFRenderPass renderPass) {
        this.abstraction = abstraction;
        this.renderPass = renderPass;
    }

    public void append(CCFCommand command) {

    }

    public CCFAbstraction getAbstraction() {
        return abstraction;
    }

    public CCFRenderPass getRenderPass() {
        return renderPass;
    }
}
