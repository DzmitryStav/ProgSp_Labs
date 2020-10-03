package lab2.part1.packageForMain;

import lab2.part1.packageForProduct.Product;

public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[20];
        for (int i = 0; i < products.length; i++) {
            products[i] = Product.getRandomProduct();
        }

        for (Product product : products) {
            product.printInfoAboutProductObject();
            System.out.print("\n");
        }
    }
}
