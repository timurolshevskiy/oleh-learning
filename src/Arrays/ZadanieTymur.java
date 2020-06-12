package Arrays;

public class ZadanieTymur {
        public static void main(String[] args) {
            int[][] chislo = {{1, 2, 3},
                    {4, 5, 6}};

            int[][] chislo1111 = {{1, 3},
                    {4, 6},
                    {7, 8}};

            int[] myResult = getResult(chislo1111);

            for (int i = 0; i < myResult.length; i++) {
                System.out.println(myResult[i]);
            }

            myResult = getResult(chislo);

            for (int i = 0; i < myResult.length; i++) {
                System.out.println(myResult[i]);
            }

        }

        static int[] getResult(int[][] parameter) {
            int[] result = new int[parameter.length];

            for (int i = 0; i < parameter.length; i++) {
                int min = parameter[i][0];
                for (int j = 0; j < parameter[i].length; j++) {
                    if (parameter[i][j] < min) {
                        min = parameter[i][j];
                    }
                }
                result[i] = min;
            }

            return result;
        }
}
