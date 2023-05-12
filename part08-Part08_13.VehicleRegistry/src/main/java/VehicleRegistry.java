
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nasse
 */
public class VehicleRegistry {

    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        this.registry = new HashMap<>();

    }

    public boolean add(LicensePlate LP, String owner) {
        if (!this.registry.containsKey(LP)) {
            registry.put(LP, owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate LP) {
        if (this.registry.containsKey(LP)) {
            return this.registry.get(LP);
        }
        return null;

    }

    public boolean remove(LicensePlate LP) {
        if (this.registry.containsKey(LP)) {
            this.registry.remove(LP);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
//        ArrayList<LicensePlate> list = new ArrayList<>();
        for (LicensePlate lp : this.registry.keySet()) {
            System.out.println(lp);
        }
    }

    public void printOwners() {
        ArrayList<String> list = new ArrayList<>();
        for (LicensePlate lp : this.registry.keySet()) {
            try {
                if (!list.contains(this.registry.get(lp))) {
                    list.add(this.registry.get(lp));
                }
            } catch (Exception e) {
                continue;
            }

        }
        list.forEach(owner -> {
            System.out.println(owner);
        });
    }
}
