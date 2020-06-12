package Poliforizm.Music;

import static Poliforizm.Music.Instrument.tune;

class Stringet extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println(" Stringed.play() " + n);
    }
}

class Brass extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println(" Brass.play() " + n);
    }
}

public class Music2 {
    public static void main(String[] args) {
        Wind flute = new Wind();
        Stringet violin = new Stringet();
        Brass frenchHorn = new Brass();
        tune(flute);
        tune(violin);
        tune(frenchHorn);
    }
}
