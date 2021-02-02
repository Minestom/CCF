package net.minestom.ccf;

public class CCFRenderPass {

    private final String name;
    private final String description;
    private final int dataSize;

    protected CCFRenderPass(String name, String description, int dataSize) {
        this.name = name;
        this.description = description;
        this.dataSize = dataSize;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getDataSize() {
        return dataSize;
    }
}
