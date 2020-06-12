package Kollekciya;

import java.util.ArrayList;

class Apple{
    private static long counter;
    protected final long id = counter++;
    public long id() {
        return id;
    }
};

class Orange{};

public class AppleAndOrange {
    @SuppressWarnings("unchesked")
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();
        for (int i = 0; i < 3; i++){
            apples.add(new Apple());
        }
        apples.add(new Orange()); {
            for (int i = 0; i < 3; i++){
                ((Apple)apples.get(i)).id();
            }
        }
    }
}
