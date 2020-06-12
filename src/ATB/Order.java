package ATB;

import java.util.ArrayList;

public class Order {
    private String address;
    private long id;
    private ArrayList<Product> pr;

    Order (String a, long i, ArrayList<Product> p) {
        address = a;
        id = i;
        pr = p;
    }

    public String getAddress () {
        return address;
    }
    public long getId () {
        return id;
    }
    public ArrayList<Product> getProducts () {
        return pr;
    }


//    public ArrayList<Product> addProduct (String a, double p) {
//
//    }
}
