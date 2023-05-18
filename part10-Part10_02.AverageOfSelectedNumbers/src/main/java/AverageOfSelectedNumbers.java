
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> numbers = new ArrayList<>();
        // toteuta ohjelmasi tänne

        while (true) {
            System.out.println("Input numbers, type \"end\" to stop.");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            numbers.add(input);

        }
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String input = scanner.nextLine();
        double average = 0;
        if (input.equals("p")) {
            average = numbers.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(num -> num >= 0)
                    .average()
                    .getAsDouble();

        } else if (input.equals("n")) {
            average = numbers.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(num -> num <= 0)
                    .average()
                    .getAsDouble();
        }
        System.out.println("Average: " + average);

    }
}
