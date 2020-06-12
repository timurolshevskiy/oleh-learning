package Poliforizm.Covariant;

class Gluph {
    void draw() {
        System.out.println(" Gluph.draw() ");
    }
    Gluph () {
        System.out.println( "Gluhp pered vizovom draw ");
        draw();
        System.out.println(" Gluph posle vyzova draw ");
    }
}

class RoundGlyph extends Gluph {
    private int radius = 1;
    RoundGlyph (int r) {
        radius = r;
        System.out.println(" RoundGlyph radius = " + radius);
    }
    void draw() {
        System.out.println(" RadiusGlyph draw radius = " + radius);
    }
}


public class PolyConstructor {
    public static void main(String[] args) {
        new RoundGlyph(5);
    }
}
