package Rukovodstvo;

public class RecTest {
    int values[];
    RecTest(int i) {
        values = new int[i];
    }

    void printArray (int i) {
        if (i == 0) return;
        else printArray(i -1);
        System.out.println(" [" + (i-1) + "] " + values[i-1] );
    }
}

class Recrussion {
    public static void main(String[] args) {
        RecTest ob = new RecTest(10);
        int i;

        for(i = 0; i < ob.values.length; i++) {
            ob.values[i] = i;
        }
        ob.printArray(10);
    }
}
