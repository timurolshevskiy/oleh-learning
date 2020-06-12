package ATB;

import java.util.ArrayList;
import java.util.Scanner;

public class Product {
    private String name;
    private double price;

    Product (String n, double p) {
        name = n;
        price = p;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return "Product: " + name + " " + price;
    }
}

class Test {
    public static void main(String[] args) {
//        Product[] products = new Product[5];
//        products[0] = new Product("Jele", 10);
//        products[1] = new Product("Vermishel", 12);
//
//        ArrayList<Product> productsList = new ArrayList<>();
//        System.out.println(productsList.size());
//
//        Product product = new Product("kartoshka", 14);
//        Product product1 = new Product("halva", 20);
//
//        System.out.println(product);
//
//        productsList.add(product);
//        productsList.add(product1);
//        System.out.println(productsList);
//
//        productsList.remove(0);
//
//        System.out.println(productsList);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite text:");

        String input = scanner.nextLine();
        System.out.println("Ty vvel: " + input);
    }
}


