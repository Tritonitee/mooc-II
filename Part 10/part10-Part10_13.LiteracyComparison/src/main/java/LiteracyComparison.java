
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

public class LiteracyComparison {

    public static void main(String[] args) {

        ArrayList<Result> literacy = new ArrayList<>();
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(","))
                    .map(parts -> new Result(parts[3], Integer.valueOf(parts[4]), parts[2].replace("(%)", "").trim(), Double.parseDouble(parts[5])))
                    .forEach(r -> literacy.add(r));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        literacy.stream().sorted((r1, r2) -> {
            if(r1.getLiteracyPercent() > r2.getLiteracyPercent()){
                return 1;
            }
            if(r1.getLiteracyPercent() < r2.getLiteracyPercent()){
                return -1;
            }
                return 0;
        }).forEach(r -> System.out.println(r));
    }

}
