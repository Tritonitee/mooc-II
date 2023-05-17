
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nasse
 */
public class IOU {

    private HashMap<String, Double> debts;

    public IOU() {
        this.debts = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        this.debts.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        try {
            double amount = this.debts.get(toWhom);
            return amount;
        } catch (Exception e) {
            return 0;
        }
    }
}
