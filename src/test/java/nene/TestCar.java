package nene;

import static org.junit.jupiter.api.Assertions.*;

class TestCar {

    @org.junit.jupiter.api.Test
    void TestgetColor() {
        Car car = new Car("blue", "fiat" ,1);
        assertEquals("blue", car.getColor());
    }

    @org.junit.jupiter.api.Test
    void TestgetType() {
        Car car = new Car("blue", "fiat", 1);
        assertEquals("fiat", car.getBrand());
    }
}