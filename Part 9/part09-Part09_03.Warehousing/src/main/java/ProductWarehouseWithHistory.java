
import java.util.HashSet;
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
public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.history = new ChangeHistory();
        this.history.add(initialBalance);
        super.setBalance(initialBalance);

    }

    @Override
    public void addToWarehouse(double amount) {
        if (amount < 0) {
            return;
        }
        if (amount <= howMuchSpaceLeft()) {
            this.setBalance(this.getBalance() + amount);
        } else {
            this.setBalance(this.getCapacity());
        }
        this.history.add(this.getBalance());
    }

    @Override
    public double takeFromWarehouse(double amount) {
        if (amount < 0) {
            return 0.0;
        }
        if (amount > super.getBalance()) {
            double allThatWeCan = this.getBalance();
            this.setBalance(0.0);
            return allThatWeCan;
        }

        this.setBalance(this.getBalance() - amount);
        this.history.add(this.getBalance());
        return amount;
    }

    public void printAnalysis() {
        String printOutput = "Product: " + this.getName() + "\n"
                + "History: " + history() + "\n"
                + "Largest amount of product: " + this.history.maxValue() + "\n"
                + "Smallest amount of product: " + this.history.minValue() + "\n"
                + "Average: " + this.history.average();
        System.out.println(printOutput);

    }

    public String history() {
        return this.history.toString();
    }

}
