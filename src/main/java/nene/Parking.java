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
        var vehiculesSize = this.vehicles.stream().mapToInt(Vehicle::getSize).sum();
        return this.size - vehiculesSize;
    }
}
