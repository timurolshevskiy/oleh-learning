package ATB;

public class Object {
    public static void main(String[] args) {
        Holder holder = new Holder();
        holder.value = "first value";
        method(holder);
        System.out.println(holder.value);

        String test = "first test";
        methodWithString(test);
        System.out.println(test);

        int num = 1;
        methodWithNumber(num);

        double d = 3.4;
        float df = (float) d;
        float f = 200000000000000000000000000.5f;

        long l = 100;

        System.out.println(num);

        Integer integer = new Integer(12);
    }

    static class Integer {

        int value = 30;

        Integer(int input) {
            value = input;
        }


    }

    static void method(Holder holder1) {
        holder1.value = "new value";
        holder1 = new Holder();
        holder1.value = "2 new value";
    }

    static void methodWithString(String test1) {
        test1 = "new test";
    }

    static void methodWithNumber(int number) {
        number = 5;
    }
}

class Holder {
    String value;

}
