package Rukovodstvo;

public class Massiv {

    public static void main(String[] args) {

        int maxKolvo = 3;
        int [] masiv = {0, 1};
        int k = 0;
        int i = 0;
        int e_max = 3;
        int e = 0;
        int num = masiv[i];
        int n_max = 0;

        if (masiv[i] == masiv[i-k]){
            k++;
            if (k == 2){
                if (e == e_max){
                    n_max = num;
                    e_max = e;
                    k = 0;
                }
                num = i;
            } else {
                e++;
            }
        }else {
            k = 0;
            e++;
        }
    }
}
