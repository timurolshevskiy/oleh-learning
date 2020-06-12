package ATB;

public class Test2 {

    public static void main(String[] args) {
        Truck truck = new Truck();
        truck.mark = "Kamaz";
        truck.weight = 500;
        truck.wheelsAmount = 8;
        truck.gruz = 700;

        System.out.println(truck);
    }
}

class Machine {

    String mark;
    double weight;
    int wheelsAmount;
}

class Truck extends Machine {

    double gruz;

    public String toString() {
        String result = "Truck: mark = " + mark + " weight = " + weight + " gruz = " + gruz;
        return result;
    }
}
