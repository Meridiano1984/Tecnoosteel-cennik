package com.example.tecnoosteelcennik.cabinet;

public class Front implements Side{

    private Part part;
    private int width;

    public Front(Part part) {
        this.part = part;
        this.width = part.getDimension();
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

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
