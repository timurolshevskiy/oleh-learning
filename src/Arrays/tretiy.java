package Arrays;

import java.util.Arrays;

public class tretiy {
        public static void main(String[] args) {

            int[][] chislo = {{0, 1, 2, 5, 7},
                             {7, 0, 3, 4, 2},
                             {8, 9, 0, 5, 1},
                             {5, 6, 2, 3, 1,},
                             {6, 8, 4, 7, 3}};

            int[][] result = getInPut(chislo);
            System.out.println();
            System.out.println();
            System.out.println(Arrays.deepToString(result));



        }
        static int [][] getInPut (int [][] input) {
            for (int i = 0; i < input.length ; i++) {
                for (int g = 1; g < input[i].length; g++) {
                    int s = input [i][g];
                    input [i][g] = input [g][i];
                    input [g][i] = s;

                    System.out.println(Arrays.deepToString(input));
                }
            }
            return input;        }
}
