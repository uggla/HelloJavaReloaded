package nene;

import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.IOException;

public class Hello {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello, world!");
        ObjectMapper objectMapper = new ObjectMapper();
        Car car1 = new Car("yellow", "renault");
        Car car2 = new Car("green", "lotus");
        Car car3 = new Car("purple", "lambo");

        Parking parking = new Parking();
        parking.add(car1);
        parking.add(car2);
        parking.add(car3);
//        objectMapper.writeValue(new File("target/parking.json"), parking);
        System.out.println(objectMapper.writeValueAsString(parking));
    }

}

