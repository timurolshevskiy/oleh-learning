package Rukovodstvo;

import java.io.IOException;

public class inRead {
    public static void main(String[] args)
            throws IOException {
        char probel = ' ', choise;
        int i = 0;

        System.out.println(" Vvedite tekst");
        for (;;) {
            choise = (char) System.in.read();
            if (choise == '.') break;
            if (choise == probel) {
               i++;
           }
        }
        System.out.println("probelov "  + i);
    }
}
