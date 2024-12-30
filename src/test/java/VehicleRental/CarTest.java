package VehicleRental;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest {
    @Test
    public void testCalculateRentalCost() {
        Car car = new Car("C001", "Sedan", 50.0, true);
        assertEquals(750.0, car.calculateRentalCost(10)); // Assume 15% additional cost
    }

    @Test
    public void testRent() {
        Car car = new Car("C001", "Sedan", 50.0, true);
        Customer customer = new Customer("Ct001", "Arnold Kyei");
        car.rent(customer, 5);
        assertFalse(car.isAvailable());
        assertEquals(1, customer.getRentalHistory().size());
    }

    @Test
    public void testReturnVehicle() {
        Car car = new Car("C001", "Lambogini", 50.0, false);
        car.returnVehicle();
        assertTrue(car.isAvailable());
    }
}
