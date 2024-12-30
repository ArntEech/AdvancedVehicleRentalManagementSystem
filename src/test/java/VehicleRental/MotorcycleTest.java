package VehicleRental;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MotorcycleTest {
    @Test
    public void testCalculateRentalCost() {
        Motorcycle ride = new Motorcycle("M001", "Honda", 25.0, true);
        assertEquals(100, ride.calculateRentalCost(8)); // Assume 5% additional cost
    }

    @Test
    public void testRent() {
        Motorcycle ride = new Motorcycle("M001", "Honda", 25.0, true);
        Customer customer = new Customer("CT045", "Armko Paul");
        ride.rent(customer, 8);
        assertFalse(ride.isAvailable());
        assertEquals(1, customer.getRentalHistory().size());
    }

    @Test
    public void testReturnVehicle() {
        Motorcycle ride = new Motorcycle("M001", "Honda", 25.0, false);
        ride.returnVehicle();
        assertTrue(ride.isAvailable());
    }
}
