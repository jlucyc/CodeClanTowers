import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;
    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(5.00, 5.00, RoomType.DOUBLE, "112", 99);
        booking = new Booking(bedroom, 3);

    }

    @Test
    public void canGetNights(){
        assertEquals(3, booking.getNights());

    }

    @Test
    public void canSetNights(){
        booking.setNights(4);
        assertEquals(4, booking.getNights());
    }

    @Test
    public void canGetBedroom(){
        assertEquals("112", booking.getBedroomNumber());
    }
}
