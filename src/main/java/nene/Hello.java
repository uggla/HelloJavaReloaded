package nene;

import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.IOException;

public class Hello {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello, world!");
        var objectMapper = new ObjectMapper();
        var car1 = new Car("yellow", "renault");
        var car2 = new Car("green", "lotus");
        var car3 = new Car("purple", "lambo");

        var parking = new Parking();
        parking.add(car1);
        parking.add(car2);
        parking.add(car3);
        System.out.println(objectMapper.writeValueAsString(parking));
    }

}

