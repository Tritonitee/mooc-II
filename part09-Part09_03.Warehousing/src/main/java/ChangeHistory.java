
import java.util.ArrayList;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nasse
 */
public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }

    public double maxValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        double maxValue = 0;

        for (Double value : this.history) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;

    }

    public double minValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        double minValue = this.history.get(0);
        for (Double value : this.history) {
            if (value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }

    public double average() {
        if (this.history.isEmpty()) {
            return 0;
        }
        double sum = 0;
        double divisor = 0;

        for (int i = 0; i < this.history.size(); i++) {
            sum = sum + this.history.get(i);
            divisor++;
        }
        return sum / divisor;
    }

    public String toString() {
        return this.history.toString();
    }
}
