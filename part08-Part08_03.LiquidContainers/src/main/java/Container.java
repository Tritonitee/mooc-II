/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nasse
 */
public class Container {

    private final int full = 100;
    private final int empty = 0;
    private String name;
    private int amount;

    public Container(String name) {
        this.amount = empty;
        this.name = name;
    }
    
    public void add(int amountToAdd){
        if(amountToAdd > 0){
          if(this.amount + amountToAdd <= full){
          this.amount = this.amount + amountToAdd;  
        } else {
            this.amount = full;
        }     
        }           
    }
    public void move(Container moveTo, int amountToMove){
        if(this.amount - amountToMove >= empty && moveTo.getAmount() + amountToMove <= full){
            moveTo.add(amountToMove);
            this.amount = this.amount - amountToMove;           
        } else if (moveTo.getAmount() + amountToMove <= full) {
            moveTo.add(this.amount);
        } else {
            this.amount = empty;
            moveTo.setAmount(full);
        }
    }
    public void remove(int amountToRemove){
        if(this.amount - amountToRemove >= empty){
            this.amount = this.amount - amountToRemove;
        } else {
            this.amount = empty;
        }
    }

    public int getAmount() {
        return this.amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name + ": " + this.amount + "/100"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
