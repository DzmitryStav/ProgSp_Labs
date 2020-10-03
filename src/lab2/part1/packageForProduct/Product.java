package lab2.part1.packageForProduct;

public class Product {
    private static int TotalNumberOfProducts = 0;
    private static int TotalPriceOfTheProducts = 0;

    private String productName = "Не задано";
    private boolean isAvailable = false;
    private int price = 0;

    public Product() {
        super();
    }

    public Product(String productName, boolean isAvailable, int price) {
        this.productName = productName;
        this.isAvailable = isAvailable;
        this.price = price;

        TotalNumberOfProducts++;
        TotalPriceOfTheProducts += price;
    }

    public Product(String productName, boolean isAvailable) {
        this.productName = productName;
        this.isAvailable = isAvailable;

        TotalNumberOfProducts++;
    }

    public Product(String productName) {
        this.productName = productName;

        TotalNumberOfProducts++;
    }

    public static int getTotalNumberOfProducts() {
        return TotalNumberOfProducts;
    }

    public static int getTotalPriceOfTheProducts() {
        return TotalPriceOfTheProducts;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
       this.isAvailable = isAvailable;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void printInfoAboutProductObject() {
        System.out.println("Название продукта: " + productName);
        System.out.println("Наличие: " + (isAvailable ? "+" : "-"));
        System.out.println("Цена продукта: " + price);
        System.out.println("\nОбщее кол-во товара: " + TotalNumberOfProducts);
        System.out.println("Общая цена всех продуктов: " + TotalPriceOfTheProducts);
    }

    public static Product getRandomProduct() {
        String name = "Продукт - " + (TotalNumberOfProducts  + 1);
        boolean isAvailable = !(Math.random() < 0.5);
        int price = (int)(Math.random() * 100) + 100;

        return new Product(name, isAvailable, price);
    }
}
