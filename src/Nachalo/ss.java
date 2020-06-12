package Nachalo;

public class ss {
    public static void main(String[] args) {

        int[][] chislo = {{1, 3, 6, 8},
                         {5, 9, 4, 11},
                         {4, 7, 2, 6}};
        int i = 0;
        int min = chislo[i][0];

        for (i = 0; i < chislo.length; i++) {
            for (int g = 1; g < chislo[i].length; g++) {
                if (chislo[i][g] < chislo[i][0])
                    min = chislo[i][g];

            }
            System.out.print(min + " ");
        }
    }
}
