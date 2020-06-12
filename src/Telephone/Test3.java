package Telephone;


public class Test3 {
    public static void main(String[] args) {
        //Phone phone = new IPhone("iphone12", 500);

        IPhone iPhone = new IPhone("Iphone11", 800);

        int ostalos = iPhone.use(64);
        System.out.println("ostalos " + ostalos);
        Android android = new Android("pacafon", 800);
        turnOffPhone(android);
        turnOffPhone(iPhone);

        int a = 90;
    }

    public static void turnOffPhone(Phone phone) {
        phone.use(100);
    }
}

abstract class Phone { // класс с абстракными методами должен быть абстракным. НЕЛЬЗЯ СОЗДАВАТЬ ОБЪЕКТЫ АБСТРАКТНОГО КЛАССА

    private String model;
    private int minutesLeft;

    //Phone() {}

    Phone(String model, int left){
        this.model = model;
        minutesLeft = left;
    }

    public int getLeft() {
        return minutesLeft;
    }
    protected void setLeft(int l) {
        minutesLeft = l;
    }

    public String toString() {
        return model + " " + minutesLeft;
    }
    public abstract int use (int a); // метод без реализации в базовом классе, но должен быть реализован в каждом наследнике.
}

class IPhone extends Phone {

    String OS;

    public IPhone() {
        super("Iphone 7", 900);
    }

    public IPhone (String model, int left){
        super(model, left);
    }

    public IPhone (String model, int left, String os) {
        this(model,left);
        this.OS = os;
    }

    public int use(int zadrotil) {
        int a = getLeft();
        a  -= (zadrotil - 10);
        setLeft(a);
        return a;
    }


}

class Android extends Phone {

    String OS;

    public Android(String model, int left) {
        super(model, left);
    }

    public int use(int mites){
        int left = getLeft();
        left -= mites * 1.5;
        setLeft(left);
        return left;
    }
}



