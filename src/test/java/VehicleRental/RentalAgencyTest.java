package VehicleRental;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class RentalAgencyTest {
    @Test
    public void testAddVehicle() {
        RentalAgency agency = new RentalAgency();
        Vehicle motorcycle = new Motorcycle("C001", "Honda", 50.0, true);
        agency.addVehicle(motorcycle);
        Vehicle found = agency.findAvailableVehicle("Honda");
        assertNotNull(found);
    }

    @Test
    public void testHandleRental() {
        RentalAgency agency = new RentalAgency();
        Vehicle car = new Car("C001", "Sedan", 50.0, true);
        agency.addVehicle(car);

        Customer customer = new Customer("CUST001", "Arnold Kyei");
        agency.handleRental(customer, "Sedan", 5);

        assertFalse(car.isAvailable());
        assertEquals(List.of("C001"), customer.getRentalHistory());
    }

    @Test
    public void testReturnVehicle() {
        RentalAgency agency = new RentalAgency();
        Vehicle car = new Car("C001", "Sedan", 50.0, false);
        agency.addVehicle(car);

        agency.returnVehicle("C001");
        assertTrue(car.isAvailable());
    }
}
