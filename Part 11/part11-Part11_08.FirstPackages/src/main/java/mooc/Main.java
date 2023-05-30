package mooc;
import mooc.ui.*;
import mooc.logic.*;

public class Main {

    public static void main(String[] args) {
        UserInterface ui = new TextInterface();
        new ApplicationLogic(ui).execute(3);
    }
}
