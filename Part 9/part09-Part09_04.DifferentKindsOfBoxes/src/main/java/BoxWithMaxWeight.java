
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
public class BoxWithMaxWeight extends Box {

    private ArrayList<Item> items;
    private int capacity;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }

    @Override
    public void add(Item item) {
        int weight = 0;
        
        if (this.items.isEmpty()) {
            this.items.add(item);
        }
        for (Item i : this.items) {
            weight = weight + i.getWeight();           
        }
        if (weight + item.getWeight() <= this.capacity && !this.items.contains(item)) {
           // System.out.println(weight);
            this.items.add(item);
                    
        }
        
    }

    @Override
    public String toString() {
        String printOutput = "items: " + this.items.toString();
        return printOutput;
    }
   
}
