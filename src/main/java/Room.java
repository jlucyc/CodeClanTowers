import java.util.ArrayList;

public abstract class Room {


    private ArrayList<Guest> guests;

    public Room(){

        this.guests = new ArrayList<Guest>();
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public void setGuests(ArrayList<Guest> guests) {
        this.guests = guests;
    }

    public void addGuest(Guest guest) {
        this.guests.add(guest);
    }

    public int getGuestsLength() {
        return this.guests.size();
    }

    public void removeGuests() {
        this.guests.clear();
    }
}
