package Arrays;

import java.util.Arrays;

public class ryad {
    public static void main(String[] args) {
        int[] chislo = {10, 20, 30, 40, 50, 60, 70};

        int[] resuld = getReversedArray(chislo);
        System.out.println();
        System.out.println();
        System.out.println(Arrays.toString(resuld));
        // 6 2 3 4 5 1
        // 1
    }

    static int[] getReversedArray(int[] input) {
        for (int i = 0; i < input.length / 2 + 1; i++) {
            System.out.println("Change input[" + i + "]=" + input[i] + " and input[" + (input.length - i - 1) + "]=" + input[input.length - i - 1]);

            int s = input[i];
            input[i] = input[input.length - i - 1];
            input[input.length - i - 1] = s;

            System.out.println(Arrays.toString(input));
        }
        return input;
    }

}
