import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom("Harris");
    }

    @Test
    public void canGetConferenceRoomName(){
        assertEquals("Harris", conferenceRoom.getName());
    }
}
