package Nachalo;

public class Massiv2 {
    public static void main(String[] args) {

        int chislo [][] = {{4, 6, 1, 5},
                           {0, 2, 3, 4},
                           {8, 8, 8, 7}};

        int minim = chislo [0][0];
        int i = 0;

        for (i = 1; i < 4; i++){
            if (chislo[0][2] < chislo[0][0]) {
               minim = chislo [0][2];
            }
            else {
                minim = chislo [0][0];
            }
        }
        System.out.println( minim);
    }
}
