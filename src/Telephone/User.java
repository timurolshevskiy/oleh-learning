package Telephone;


import java.util.Arrays;

public class User {
    String name;
    Phone[] phones;

    User (String n, Phone[] p) {
        name = n;
        phones = p;

    }

    public String toString() {
        String a = Arrays.toString(phones);
        return "User: " + name + a;
    }

    public void useAllPhones(int zadrotil) {
        for (int a = 0; a < phones.length; a++ ) {
            phones[a].use(zadrotil);
        }
    }



    public static void main(String[] args) {
        Phone[] telef = new Phone[3];
        telef[0] = new IPhone("iPhone 6s", 650) ;
        telef[1] = new Android("pacafon", 700);
        telef[2] = new Android("hueson", 850);


        User oleg = new User("Oleg", telef);
        oleg.useAllPhones(100);

        System.out.println(oleg.toString());
        //User: Oleg iPfone 6s 560 pacafon 550 hueson 850
    }
}


