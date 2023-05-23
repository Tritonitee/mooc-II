
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadingFilesPerLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test the method here
        read("presidents.txt");

    }

    public static List<String> read(String file) {

        try {
            List<String> presidents = Files.lines(Paths.get(file))
                    .collect(Collectors.toCollection(ArrayList::new));
            return presidents;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }

    }

}
