
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nasse
 */
public class Herd implements Movable {
    private ArrayList<Movable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Movable m:this.herd){
            sb.append(m.toString() + "\n");
        }
        return sb.toString(); //To change body of generated methods, choose Tools | Templates.
    }
   
    public void addToHerd(Movable movable){
        this.herd.add(movable);
    }
        
    @Override
    public void move(int dx, int dy) {
        this.herd.forEach(m -> {
            m.move(dx, dy);
        });
    }

}
