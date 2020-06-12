package Arrays;

import java.util.Arrays;

public class dobavotChislo {
    public static void main(String[] args) {
        int [] chislo = {1, 3, 4, 2, 3, 4, 7, 8, 9};
        int key = 3;

        int[] result = addElement(chislo, key);
        System.out.println(Arrays.toString(result));

    }

    static public int [] addElement (int[] input, int g) {
        int amount = 0;
        for (int i = 0; i < input.length; i++ ) {
            if (input[i] == g) {
                amount++;
            }
        }

        int [] putin = new int [input.length + amount];

/*        for (int i = 0; i < input.length; i++) {
            putin[i] = input[i];
        }
        for (int i = input.length; i < putin.length; i++) {
            putin[i] = g;
        }
  */
        for (int i = 0; i < putin.length; i++) {
            if (i >= input.length) {
                putin[i] = g;
            } else {
                putin[i] = input[i];

            }
        }
        return putin;
    }
}
