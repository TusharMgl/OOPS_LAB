import java.util.HashMap;
import java.util.Map;

public class l9q3 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> inventory = new HashMap<>();

        inventory.put(101, 20);
        inventory.put(102, 30);
        inventory.put(103, 40);

        // Update quantity of product 102
        inventory.put(102, 45);

        // Remove product 103
        inventory.remove(103);

        // Display inventory
        for (Map.Entry<Integer, Integer> entry : inventory.entrySet()) {
            System.out.println("Product ID: " + entry.getKey() + ", Quantity: " + entry.getValue());
        }
    }
}
