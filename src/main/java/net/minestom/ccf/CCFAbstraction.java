package net.minestom.ccf;

public class CCFAbstraction {

    private final String name;
    private final String description;
    private final long sizeX;
    private final long sizeY;
    private final long sizeZ;

    protected CCFAbstraction(String name, String description, long sizeX, long sizeY, long sizeZ) {
        this.name = name;
        this.description = description;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.sizeZ = sizeZ;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public long getSizeX() {
        return sizeX;
    }

    public long getSizeY() {
        return sizeY;
    }

    public long getSizeZ() {
        return sizeZ;
    }
}
