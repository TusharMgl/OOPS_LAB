import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class l8q3 {  // Ensure class name matches filename
    public static void main(String[] args) {
        File file = new File("student.txt"); // Ensure file exists in the same directory

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: student.txt not found.");
        }
    }
}
