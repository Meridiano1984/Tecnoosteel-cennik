package com.example.tecnoosteelcennik.cabinet;

import java.math.BigDecimal;

public class Panel extends Part{

    private PanelType panelType;

    public Panel(String description, BigDecimal price, int dimension, int height, PanelType panelType) {
        super(panelType.name(), description, price, dimension, height);
    }
}
