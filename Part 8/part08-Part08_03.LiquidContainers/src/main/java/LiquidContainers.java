
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container("First");
        Container second = new Container("Second");

        OUTER:
        while (true) {
            System.out.print("> ");
            System.out.println(first);
            System.out.println(second);
            String input = scan.nextLine();
            String[] parts = input.split(" ");
            switch (parts[0]) {
                case "quit":
                    break OUTER;
                case "add":
                    first.add(Integer.valueOf(parts[1]));
                    break;
                case "move":
                    first.move(second, Integer.valueOf(parts[1]));
                    break;
                case "remove":
                    second.remove(Integer.valueOf(parts[1]));
                    break;
                default:
                    break;
            }
        }
    }

}
