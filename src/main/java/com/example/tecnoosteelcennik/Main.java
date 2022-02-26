package com.example.tecnoosteelcennik;
import com.example.tecnoosteelcennik.cabinet.*;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    public static void main(String[] args) {

        Cabinet cabinet;
        Part door = new Door("Drzwi", new BigDecimal(120.34),100,400, DoorType.BLACHA_PELNA);
        Part wall1 = new Panel("Panel1", new BigDecimal(120.34),100,400, PanelType.OSLONA_PELNA);
        Part wall2 = new Panel("Panel2", new BigDecimal(120.34),100,400, PanelType.OSLONA_PELNA);
        Part backDoor = new Door("Drzwi", new BigDecimal(120.34),100,400, DoorType.BLACHA_PELNA);

        Side[] sides = new Side[4];
        sides[0] = new Front(door);
        sides[1] = new Right(wall1);
        sides[2] = new Back(backDoor);
        sides[3] = new Left(wall2);

        OpenFrame openFrame = new OpenFrame("Rama", new BigDecimal(123.4453),100, 100, 400);

        Cabinet cabinet1 = new Cabinet(openFrame,sides);

        System.out.println(cabinet1.toString());

        BigDecimal lel = new BigDecimal(100.55555);
        lel = lel.setScale(2, RoundingMode.HALF_UP);
        System.out.println(" liczba: " + lel);







    }
}
