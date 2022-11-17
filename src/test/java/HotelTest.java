import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom;
    ConferenceRoom conferenceRoom;

    Guest guest;

    @Before
    public void before(){
        hotel = new Hotel("CodeClan Towers");
        bedroom = new Bedroom(RoomType.SUITE, "200");
        conferenceRoom = new ConferenceRoom("Lewis");
        guest = new Guest("Frank");

    }

    @Test
    public void canGetNameOfHotel(){
        assertEquals("CodeClan Towers", hotel.getName());
    }

    @Test
    public void canGetBedroomListLength(){
        assertEquals(0, hotel.getBedroomsLength());
    }

    @Test
    public void canGetConferenceListLength(){
        assertEquals(0, hotel.getConferenceRoomsLength());
    }

    @Test
    public void canAddBedroomToHotel(){
        hotel.addBedroom(bedroom);
        assertEquals(1, hotel.getBedroomsLength());
    }

    @Test
    public void canAddConferenceRoomToHotel(){
        hotel.addConferenceRoom(conferenceRoom);
        assertEquals(1, hotel.getConferenceRoomsLength());
    }

    @Test
    public void canCheckInGuest(){
        hotel.checkInGuest(guest, bedroom);
        assertEquals(1, bedroom.getGuestsLength());
    }

    @Test
    public void canCheckOutGuest(){
        hotel.checkInGuest(guest, conferenceRoom);
        assertEquals(1, conferenceRoom.getGuestsLength());
        hotel.checkOutGuest(conferenceRoom);
        assertEquals(0, conferenceRoom.getGuestsLength());
    }
}
