package Arrays;

import java.util.Arrays;

public class ubratElement {
    public static void main(String[] args) {
        int[] chislo = {1, 3, 4, 3, 2, 3, 5};
        int k = 3;
        int[] result = minusElement(chislo, k);

        System.out.println(Arrays.toString(result));
    }

    static public int[] minusElement (int[] input, int g) {
        int kolvo = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == g) {
                kolvo++;
            }
        }

        int[] putin = new int[input.length - kolvo];
        for (int i = 0, e = 0; i < input.length; i++) {
            if (input[i] != g) {
                putin[e++] = input[i];
            }
        }
        return putin;
    }
}
