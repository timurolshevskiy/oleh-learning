package Poliforizm.Music;

class Insect {
    private int i = 9;
    protected int j;
    Insect() {
        System.out.println(" i = " + i + ". j = " + j);
        j = 39;
    }
    private static int x1 = printInt(" Pole static Insect x1 inicializirovano");
    static  int printInt(String s) {
        System.out.println(s);
        return 47;
    }
}

public class Beetle extends Insect {
    private int k = printInt(" Pole Beetle k inicializirovano ");
    public Beetle() {
        System.out.print(" k = " + k);
        System.out.print(" j = " + j);
    }
    private static int x2 = printInt(" Pole static Beetle x2 inicializirovano");

    public static void main(String[] args) {
        System.out.println("Konstructor Beetle");
        Beetle b = new Beetle();
    }
}



