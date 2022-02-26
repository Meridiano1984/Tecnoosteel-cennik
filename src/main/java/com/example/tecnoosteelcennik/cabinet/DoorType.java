package com.example.tecnoosteelcennik.cabinet;

public enum DoorType {
    
    SZKLANE(false,false),
    SZKALNE_Z_ZAMKIEM(true,false),
    SZKLANE_PODWOJNE(false,true),

    BLACHA_PELNA(false,false),
    BLACHA_PELNA_Z_ZAMKIEM(true,false),
    BLACHA_PELNA_PODWOJNE(false,true),
    BLACHA_PELNA_PODWOJNE_Z_ZAMKIEM(true,true),

    PERFOROWANE(false,false),
    PERFOROWANE_Z_ZAMKIEM(true,false),
    PERFOROWANE_PODWOJNE(false,true),
    PERFOROWANE_PODWOJNE_Z_ZAMKIEM(true,true);
    
    boolean lockThreePoint;
    boolean doubleLayer;

    DoorType(boolean lock, boolean doubled) {
        this.lockThreePoint = lock;
        this.doubleLayer = doubled;
    }

    public boolean isLockThreePoint() {
        return lockThreePoint;
    }

    public boolean isDoubleLayer() {
        return doubleLayer;
    }
}
