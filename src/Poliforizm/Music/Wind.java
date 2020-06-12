package Poliforizm.Music;

class Instrument{
    public void play(Note n) {
        System.out.println(" Instrument.play() ");
    }

    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }
}


public class Wind extends Instrument {
    public void play(Note n) {
        System.out.println(" Wind.play() " + n);
    }
}
