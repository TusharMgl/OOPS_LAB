import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class l8q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter roll number: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Enter grade: ");
        String grade = scanner.nextLine();

        try (FileWriter writer = new FileWriter("student.txt", true)) { // Append mode
            writer.write("Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + grade + "\n");
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error: Unable to write to file.");
        }

        scanner.close();
    }
}
