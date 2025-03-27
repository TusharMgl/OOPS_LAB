package ECommerce;

public class Product {
  
    public void getProductDetails() {
        System.out.println("Product details: Name - Laptop, Price - $1000");
    }
    protected void applyDiscount() {
        System.out.println("Applying discount of 10%");
    }
    void updateStock() {
        System.out.println("Updating stock for the product...");
    }
    private void calculateProfit() {
        System.out.println("Calculating profit margin...");
    }
    public void testPrivateMethod() {
        calculateProfit(); 
    }
}
