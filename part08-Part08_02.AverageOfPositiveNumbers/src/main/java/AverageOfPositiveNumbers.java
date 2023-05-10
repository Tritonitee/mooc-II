
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int index = 0;
        double average = 0;
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 0) {
                break;
            } else if (input < 0) {
                continue;
            } else {
                sum = sum + input;
                index++;
            }
            average = 1.0 * sum / index;

        }
        if (sum <= 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println("Average: " + average);
        }
    }
}
