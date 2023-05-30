/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author Nasse
 */
public class TemperatureSensor implements Sensor {

    private boolean state;

    public TemperatureSensor() {
        this.state = state;
    }

    @Override
    public boolean isOn() {
        if (this.state == true) {
            return true;
        }
        return false;
    }

    @Override
    public void setOn() {
        this.state = true;
    }

    @Override
    public void setOff() {
        this.state = false;
    }

    @Override
    public int read() {
        if (this.state == true) {
            return new Random().nextInt(61) - 30;

        }
        throw new IllegalStateException("sensor is off");
    }    
}
