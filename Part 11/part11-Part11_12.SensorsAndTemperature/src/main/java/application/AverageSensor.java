/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nasse
 */
public class AverageSensor implements Sensor {

    private ArrayList<Sensor> sensors;
    private List<Integer> values;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.values = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        if (!this.sensors.contains(toAdd)) {
            this.sensors.add(toAdd);
        }
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : this.sensors) {
            if (!sensor.isOn()) {
                return false;
            }            
        }return true;
    }

    @Override
    public void setOn() {
        for (Sensor sensor : this.sensors) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor : this.sensors) {
            sensor.setOff();
        }

    }

    @Override
    public int read() {
        if (!isOn() || this.sensors.isEmpty()) {
            throw new IllegalStateException("No sensors found");
        }
        int sum = 0;
        int amount = this.sensors.size();
        for (Sensor sensor : this.sensors) {
            sum = sum + sensor.read();
        }
        this.values.add(sum / amount);
        return sum / amount;
    }

    public List<Integer> readings() {
        return this.values;
    }

}
