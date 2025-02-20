package LAB_5;
import java.util.ArrayList;
import java.util.List;

// Base class
class Chef {
    // Method to be overridden
    public void makeSpecialDish() {
        System.out.println("The chef is making a special dish.");
    }
}

// ItalianChef subclass
class ItalianChef extends Chef {
    @Override
    public void makeSpecialDish() {
        System.out.println("Making pasta ");
    }
}

// ChineseChef subclass
class ChineseChef extends Chef {
    @Override
    public void makeSpecialDish() {
        System.out.println("Making dumplings ");
    }
}

// MexicanChef subclass
class MexicanChef extends Chef {
    @Override
    public void makeSpecialDish() {
        System.out.println("Making tacos ");
    }
}

// Test class
public class RestaurantTest5 {
    public static void main(String[] args) {
        // Creating a list of Chef references with different subclass instances
        List<Chef> chefs = new ArrayList<>();
        chefs.add(new ItalianChef());
        chefs.add(new ChineseChef());
        chefs.add(new MexicanChef());

        // Loop through the list and call makeSpecialDish() (demonstrating polymorphism)
        System.out.println("Restaurant Special Dishes:");
        for (Chef chef : chefs) {
            chef.makeSpecialDish();  // Calls the overridden method based on the actual object type
        }
    }
}
