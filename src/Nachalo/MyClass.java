package Nachalo;

class MyClass {
    public static void main(String[] args) {
        int [] chislo = {1, 2, 2, 9, 9, 2};

        int elementow = 0;
        int summa = 0;

        for (int i = 0; i < chislo.length; i++) {
            if (chislo[i] % 2 == 0) {

                summa += chislo[i];
                elementow ++;
            }
        }
        double ser = summa / elementow;
        System.out.println(ser);


    }
}