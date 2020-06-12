package Arrays;

import java.util.Arrays;

public class raspredilene {
    public static void main(String[] args) {
        double[] chislo = {5, 8, 7, 1, 3, 2, 6, 4};

        double[] result = getResult(chislo);

        System.out.println();
        System.out.println();
        System.out.println(Arrays.toString(result));
    }
    public static double[] getResult (double[] input) {
        double s = 0;
        for(int i = 1; i < input.length - 1; i++) {
            if (input[i] > input [i - 1]) {
                s = input[i];
                if (input[i - 1]  > input[i + 1]) {
                    input[i] = input[i + 1];
                    input[i + 1] = s;
                } else {
                    input[i] = input[i - 1];
                    input[i - 1] = s;
                }
            } else {
                if (input[i] > input[i + 1]) {
                    s = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = s;
                }
            }
            System.out.println(Arrays.toString(input));
        }
        return input;
    }
}
