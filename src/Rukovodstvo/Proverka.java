package Rukovodstvo;

public class Proverka {

    private int i = 0;

    public int number() {
        i++;
        return i;
    }

    public static void main(String[] args) {
        Proverka hello = new Proverka();
        System.out.println(hello.number());
        System.out.println(hello.number());
    }
}