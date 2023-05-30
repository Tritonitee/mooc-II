package FlightControl;

import FlightControl.logic.*;
import FlightControl.domain.*;
import FlightControl.ui.*;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // Write the main program here. It is useful to create some classes of your own.
        Scanner scan = new Scanner(System.in);
        
        FlightControl fc = new FlightControl();
        TextUI ui = new TextUI(fc, scan);
        
        ui.start();
    }
}
