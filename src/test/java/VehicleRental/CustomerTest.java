package VehicleRental;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {
    @Test
    public void testAddRental() {
        Customer customer = new Customer("CT001", "Flora Kyei");
        Customer customer2 = new Customer("CT002", "Bruce Wayne");
        customer.addRental("M001");
        customer2.addRental("M002");
        assertEquals(2, customer.getRentalHistory().size(), customer2.getRentalHistory().size());
    }

    @Test
    public void testClearRentalHistory() {
        Customer customer = new Customer("CT001", "Flora Kyei");
        Customer customer2 = new Customer("CT002", "Bruce Wayne");
        customer.addRental("M001");
        customer2.addRental("M002");
        customer.clearRentalHistory();
        assertEquals(0, customer.getRentalHistory().size());
    }
}
