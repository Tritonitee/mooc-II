
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nasse
 */
public class Warehouse {

    private Map<String, Integer> items;
    private Map<String, Integer> stock;

    public Warehouse() {
        this.items = new HashMap<>();
        this.stock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        if (this.items.containsKey(product)) {
            this.stock.put(product, this.stock.get(product) + stock);
        } else {
            this.items.put(product, price);
            this.stock.put(product, stock);
        }
    }

    public int price(String product) {
        if (this.items.containsKey(product)) {
            return this.items.get(product);
        }
        return -99;

    }

    public int stock(String product) {
        if (this.stock.containsKey(product)) {
            return this.stock.get(product);
        }
        return 0;
    }

    public boolean take(String product) {
        if (this.items.containsKey(product) && this.stock.get(product) > 0) {
            this.stock.put(product, this.stock.get(product) - 1);
            return true;
        }
        if (this.items.containsKey(product) && this.stock.get(product) - 1 == 0) {
            this.stock.put(product, this.stock.get(product) - 1);
            this.items.remove(product);
            this.stock.remove(product);
            return true;
        }
        return false;
    }
    public Set<String> products(){
        return this.stock.keySet();
    }

}
