package com.example.tecnoosteelcennik.cabinet;

import java.math.BigDecimal;

public class OpenFrame {

    private String name;
    private BigDecimal price;
    private int depth;
    private int width;
    private int height;

    public OpenFrame(String name, BigDecimal price,int width , int height, int depth) {
        this.name = name;
        this.price = price;
        this.depth = depth;
        this.width = width;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
