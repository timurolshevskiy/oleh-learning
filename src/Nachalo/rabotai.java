package Nachalo;

public class rabotai {
    public static void main(String[] args) {
        int chislo [] = {15, 16, 29, 18, 19, 20, 21, 42, 23, 67, 25, 32};
        int max = 0;

        for (int i = 1 ; i < chislo.length; i++) {

              if (chislo[i] > chislo[max]) {
                max = i;




              }

        }
        System.out.println("samoe " + max);


    }
}
