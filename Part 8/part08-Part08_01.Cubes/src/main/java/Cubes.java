
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        while(true) {            
            String number = scanner.nextLine();
            try{if(number.equals("end")){
                break;
            } else {
                int actualNumber = Integer.parseInt(number);
              System.out.println(actualNumber*actualNumber*actualNumber);  
            }}
            catch(Exception e){
                System.out.println("Error converting to int: " + e.getMessage());
                continue;
            }
            
            
        }
    }
}
