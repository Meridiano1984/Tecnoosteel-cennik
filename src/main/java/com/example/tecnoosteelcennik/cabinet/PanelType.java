package com.example.tecnoosteelcennik.cabinet;

public enum PanelType {
    OSLONA_PELNA("Osłona pełna"),
    OSLONA_PERFOROWNA("Osłona perforowana");

    String description;

    PanelType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
