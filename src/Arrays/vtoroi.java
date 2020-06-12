package Arrays;

import java.util.Arrays;

public class vtoroi {
    public static void main(String[] args) {

        int[][] chislo = {{0, 1, 2},
                         {7, 0, 3},
                         {8, 9, 0}};

        int[][] result = getInPut(chislo);

        System.out.println(Arrays.deepToString(result));


    }
    static int [][] getInPut (int [][] input) {
        int [][] s = {{0, 1, 2},
                     {7, 0, 3},
                     {8, 9, 0}};

        for (int i = 0; i < input.length; i++) {
            for (int g = 0; g < input[i].length; g++) {
                input [i][g] = s [g][i];

            }
        }
        return input;
    }
}
