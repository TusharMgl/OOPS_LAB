import java.util.HashSet;

public class l9q4 {
    public static void main(String[] args) {
        String[] names = {"Tushar", "Tilka", "Sonu", "Ajay", "Nakul"};
        HashSet<String> uniqueNames = new HashSet<>();

        for (String name : names) {
            uniqueNames.add(name);
        }

        String checkName = "Sourabh";
        if (uniqueNames.contains(checkName)) {
            System.out.println(checkName + " is in the set.");
        }

        System.out.println("Unique names: " + uniqueNames);
    }
}
