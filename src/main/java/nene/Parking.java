package nene;

import java.util.ArrayList;

public class Parking {
    private ArrayList<Car> cars;

    public Parking() {
        this.cars = new ArrayList<>();
    }

    public void add(Car car){
        this.cars.add(car);
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }
}
