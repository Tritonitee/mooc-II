
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while(true){
            System.out.println("Input the name of the book, empty stops:");
            String name = scanner.nextLine();
            if(name.equals("")){
                break;
            }
            System.out.println("Input the age recommendation: ");
            int age = Integer.valueOf(scanner.nextLine());
            Book book = new Book(name, age);
            books.add(book);
        }
        System.out.println(books.size() + " books in total.");
        System.out.println("Books:");
//        books.stream().sorted((b1, b2) -> {
//            return b1.getAgeRec() - b2.getAgeRec();
//        }).forEach(book -> System.out.println(book));
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAgeRec)
                .thenComparing(Book::getName);
        Collections.sort(books, comparator);
        
        books.stream().forEach(book -> System.out.println(book));
    }

}
