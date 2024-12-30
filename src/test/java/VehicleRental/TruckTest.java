package VehicleRental;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TruckTest {
    @Test
    public void testCalculateRentalCost() {
        Truck load = new Truck("T001", "Ford", 150.0, true);
        assertEquals(7500.0, load.calculateRentalCost(20)); // Assume 25% additional cost
    }

    @Test
    public void testRent() {
        Truck load = new Truck("T001", "Ford", 150.0, true);
        Customer customer = new Customer("Ct001", "Optimus Prime");
        load.rent(customer, 20);
        assertFalse(load.isAvailable());
        assertEquals(1, customer.getRentalHistory().size());
    }

    @Test
    public void testReturnVehicle() {
        Truck load = new Truck("T001", "Ford", 150.0, false);
        load.returnVehicle();
        assertTrue(load.isAvailable());
    }
}