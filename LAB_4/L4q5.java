class Product {
    int productId;
    String productName, category;
    private double price;
    
    static int totalProducts = 0;

    Product() {
        this.productId = 0;
        this.productName = "Unknown";
        this.category = "General";
        this.price = 0.0;
        totalProducts++; 
    }

    Product(int productId, String productName, String category, double price) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.price = price;
        totalProducts++;
    }

    public double getPrice() {
        return price;
    }
    
    void displayProductInfo() {
        System.out.println("Product ID: " + productId + ", Name: " + productName + ", Category: " + category + ", Price: " + price);
    }
    
    static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
    
    double calculateStockValue(int quantity) {
        return price * quantity;
    }
    
    double calculateStockValue(int quantity, double discountRate) {
        double discountedPrice = price - (price * discountRate / 100);
        return discountedPrice * quantity;
    }
}

public class L4q5 {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product(101, "Laptop", "Electronics", 750.0);
        Product p3 = new Product(102, "Phone", "Electronics", 500.0);
        
        p1.displayProductInfo();
        p2.displayProductInfo();
        p3.displayProductInfo();
        
        Product.displayTotalProducts();
        
        System.out.println("Stock Value of Laptop (5 units): $" + p2.calculateStockValue(5));
        System.out.println("Stock Value of Phone (10 units, 10% discount): $" + p3.calculateStockValue(10, 10));
    }
}
