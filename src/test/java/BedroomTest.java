import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BedroomTest {

    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(RoomType.DOUBLE, "420", 99);
    }

    @Test
    public void canGetRoomType(){
        assertEquals(RoomType.DOUBLE, bedroom.getRoomType());
    }

    @Test
    public void doubleHasCapacityOf2(){
        assertEquals(2, bedroom.getCapacityFromEnum());
    }

    @Test
    public void canGetRoomNumber(){
        assertEquals("420", bedroom.getRoomNumber());
    }

}
