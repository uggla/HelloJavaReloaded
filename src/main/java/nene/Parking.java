package nene;

import java.util.ArrayList;
import java.util.List;

public class Parking {
    private ArrayList<Car> cars;

    public Parking() {
        this.cars = new ArrayList<>();
    }

    public void add(Car car){
        this.cars.add(car);
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars =(ArrayList<Car>) cars;
    }
}
