import java.util.ArrayList;
import java.util.HashSet;

public class l9q5 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int[] input = {7, 5, 9, 3, 2, 6};
        for (int num : input) {
            numbers.add(num);
        }

        HashSet<Integer> unique = new HashSet<>(numbers);
        int sum = 0;
        for (int num : unique) {
            sum += num;
        }

        System.out.println("Unique values: " + unique);
        System.out.println("Sum of unique values: " + sum);
    }
}
