
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nasse
 */
public class ShoppingCart {
    private Map<String, Item> contents;
    
    public ShoppingCart(){
        this.contents = new HashMap<>();
    }
    
    public void add(String product, int price){
        if(this.contents.containsKey(product)){
            this.contents.get(product).increaseQuantity();
        } else{
            Item item = new Item(product, 1, price);
            this.contents.put(product, item);
        }
    }
    public int price(){
        int totalPrice = 0;
        for(String key : this.contents.keySet()){
            totalPrice = totalPrice + this.contents.get(key).price();
        } return totalPrice;
    }
    public void print(){
        for (String key:this.contents.keySet()) {
            System.out.println(this.contents.get(key));
        }
    }
    
}
