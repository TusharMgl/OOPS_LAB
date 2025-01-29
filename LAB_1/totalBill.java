import java.util.Scanner;

public class totalBill {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total units consumed: ");
        int units = scanner.nextInt();

        int totalBill = 0;

        if (units <= 100) {
            totalBill = units * 5;
        } else if (units <= 200) {
            totalBill = (100 * 5) + ((units - 100) * 7);
        } else if (units <= 300) {
            totalBill = (100 * 5) + (100 * 7) + ((units - 200) * 10);
        } else {
            totalBill = (100 * 5) + (100 * 7) + (100 * 10) + ((units - 300) * 15);
        }

        System.out.println( totalBill );
    }
}