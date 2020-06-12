package Poliforizm.Music3;


import Poliforizm.Music.Note;

interface Instrument {
    int VALUE = 5;

    void play(Note n);

    void adjust ();
}

class Wind implements Instrument {
    public void play(Note n) {
        System.out.println(" Wind.play() " + n);
    }
    public String what() {
        return " Wind ";
    }
    public void adjust() {
        System.out.println(" Adjusting print ");
    }
}

class Percussion implements Instrument {

    public void play(Note n) {
        System.out.println(" Percussion.play() " + n);
    }
    public String what() {
        return " Percussion ";
    }
    public void adjust() {
        System.out.println(" Percussion print ");
    }
}

class Stringet implements Instrument {
    public void play(Note n) {
        System.out.println(" Stringet.play() " + n);
    }
    public String what() {
        return " Stringet ";
    }
    public void adjust() {
        System.out.println(" Stringet print ");
    }
}

class Brass extends Wind {
    public String toString () {
        return " Brass ";
    }
    public void adjust() {
        System.out.println(" Brass print ");
    }
}

class Woodwind extends Wind {
    public void play(Note n) {
        System.out.println(" Woodwind.play() " + n);
    }
    public String what() {
        return " Woodwind ";
    }
}

public class Music3 {
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void  tuneAll(Instrument[] e) {
        for (Instrument i: e){
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringet(),
                new Brass(),
                new Woodwind(),
        };
        tuneAll(orchestra);
    }
}
