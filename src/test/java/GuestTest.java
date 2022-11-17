import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void before(){
        guest = new Guest("Steve");
    }

    @Test
    public void canGetName(){
        assertEquals("Steve", guest.getName());
    }

    @Test
    public void canSetName(){
        guest.setName("Veronica");
        assertEquals("Veronica", guest.getName());
    }
}
