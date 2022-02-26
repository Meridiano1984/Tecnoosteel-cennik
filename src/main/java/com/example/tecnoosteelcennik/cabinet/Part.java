package com.example.tecnoosteelcennik.cabinet;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class Part {
    /**
     *  height - is in 'Unit' units 1 unit is 1.75 inch
     *  dimension - is measured size in 'mm' units and it
     *  can be width or height depend on place in cabinet
     */

    private String name;
    private String description;
    private BigDecimal price;
    private int dimension;
    private int height;

    public Part(String name, String description, BigDecimal price, int dimension, int height) {
        this.name = name;
        this.description = description;
        this.price = price.setScale(2, RoundingMode.HALF_UP);
        this.dimension = dimension;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
