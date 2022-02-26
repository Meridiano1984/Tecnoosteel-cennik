package com.example.tecnoosteelcennik.cabinet;

public class Left implements Side{

    private Part part;
    private int depth;

    public Left(Part part) {
        this.part = part;
        this.depth = part.getDimension();
    }

    @Override
    public void putOnPlace() {

    }

    @Override
    public void removeFromPlace() {

    }

    public Part getPart() {
        return part;
    }

    public void setPart(Part part) {
        this.part = part;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }
}
