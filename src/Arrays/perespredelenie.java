package Arrays;

import java.util.Arrays;

public class perespredelenie {
    public static void main(String[] args) {
        double[] chislo = {544, 8, 133, 24, 78, 44, 6, 1};

        double[] result = getResult(chislo);

        System.out.println();
        System.out.println();
        System.out.println(Arrays.toString(result));


    }

    static public double[] getResult(double[] input) {
        double s = 0;

        for (int g = 0; g < input.length; g++) {

            for (int i = 1; i < input.length - 1; i++) {
                if (input[i] > input[i + 1]) {
                    s = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = s;
                    if (input[i] < input[i - 1]) {
                        s = input[i];
                        input[i] = input[i - 1];
                        input[i - 1] = s;
                    }
                }else {
                    if (input[i] < input[i - 1]) {
                        s = input[i];
                        input[i] = input[i - 1];
                        input[i - 1] = s;
                    }
                }
            }
            System.out.println(Arrays.toString(input));
        }
        return input;
    }
}
