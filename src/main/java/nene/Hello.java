package nene;

import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.IOException;

public class Hello {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello, world!");
        var objectMapper = new ObjectMapper();
        var car1 = new Car("yellow", "Renault" , 1);
        var car2 = new Car("green", "Lotus",1 );
        var car3 = new Car("purple", "Lambo",1);
        var truck1 = new Truck("red", "Mack",3);

        var parking = new Parking(10);
        parking.add(car1);
        parking.add(car2);
        parking.add(car3);
        parking.add(truck1);

        System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(parking));
        System.out.println("Parking free space: " + parking.freeSpace());
    }

}

