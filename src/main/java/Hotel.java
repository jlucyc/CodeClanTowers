import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    private HashMap<String, DiningRoom> diningRooms;

    public Hotel(String name){
        this.name = name;
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
        this.diningRooms = new HashMap<String, DiningRoom>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBedroomsLength() {
        return bedrooms.size();
    }

    public int getConferenceRoomsLength() {
        return conferenceRooms.size();
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRooms.add(conferenceRoom);
    }

    public void checkInGuest(Guest guest, Room room) {
        room.addGuest(guest);

    }

    public void checkOutGuest(Room room) {
        room.removeGuests();

    }

    public Booking bookRoom(Bedroom bedroom, int nights) {
        return new Booking(bedroom, nights);


    }

    public void addDiningRoom(DiningRoom diningRoom) {
        diningRooms.put(diningRoom.getName(), diningRoom);
    }

    public int countDiningRooms() {
        return diningRooms.size();
    }
}
