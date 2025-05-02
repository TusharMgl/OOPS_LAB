package LAB_8;

import java.io.*;
import java.util.Scanner;

public class FileOperations {
    
    // Method that throws FileNotFoundException
    public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        System.out.println("Attempting to read file: " + file.getAbsolutePath());
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }

    public static void main(String[] args) {
        String fileName = "D:\\Semester 4\\OOPS\\LAB_8\\Tushar.txt";
        
        try {
            readFile(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        } finally {
            System.out.println("File operation attempted.");
        }
    }
}
