package VehicleRental;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RentalTransactionTest {
    @Test
    public void testConstructorValidation() {
        assertThrows(IllegalArgumentException.class, () -> new RentalTransaction("", "CT051", "T001", 5, 250.0));
    }

    @Test
    public void testToString() {
        RentalTransaction transaction = new RentalTransaction("TR001", "CT051", "T001", 5, 250.0);
        String expected = "Transaction ID: TR001, Customer ID: CT051, Vehicle ID: T001, Days: 5, Cost: 250.0";
        assertEquals(expected, transaction.toString());
    }

    @Test
    public void testEqualsAndHashCode() {
        RentalTransaction t1 = new RentalTransaction("T001", "CT051", "T001", 5, 250.0);
        RentalTransaction t2 = new RentalTransaction("T001", "CT051", "T001", 5, 250.0);

        assertEquals(t1, t2);
        assertEquals(t1.hashCode(), t2.hashCode());
    }
}
