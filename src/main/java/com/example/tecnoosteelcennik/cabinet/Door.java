package com.example.tecnoosteelcennik.cabinet;

import java.math.BigDecimal;

public class Door extends Part {

    private DoorType doorType;

    public Door(String description, BigDecimal price, int dimension, int height, DoorType doorType) {
        super(doorType.name(), description, price, dimension, height);
    }
}
