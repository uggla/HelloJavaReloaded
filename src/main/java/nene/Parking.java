package nene;

import java.util.ArrayList;
import java.util.List;

public class Parking {

    private int size;
    private ArrayList<Vehicle> vehicles;

    public Parking(int size) {
        this.vehicles = new ArrayList<>();
        this.size = size;
    }

    public void add(Vehicle vehicle){
        this.vehicles.add(vehicle);
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles =(ArrayList<Vehicle>) vehicles;
    }

    public int freeSpace(){
        var vehiculesSize = 0;
        for (Vehicle vehicle : this.vehicles){
            vehiculesSize += vehicle.getSize();
        }
        return this.size - vehiculesSize;
    }
}
