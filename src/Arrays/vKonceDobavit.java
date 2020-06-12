package Arrays;

import java.util.Arrays;

public class vKonceDobavit {
    public static void main(String[] args) {
        int[] chislo = {1, 2, 3};
        int[] newChislo = getResult(chislo);

        System.out.println(Arrays.toString(newChislo));
    }

    public static int [] getResult (int [] array) {
        int [] result = new int[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            result[i * 2] = array[i];
            result[i * 2 + 1] = array[i];
        }
        return result;
    }
}
