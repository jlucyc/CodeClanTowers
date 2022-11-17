import java.util.ArrayList;

public abstract class Room {


    private ArrayList<Guest> guests;

    private Double length;

    private Double width;

    public Room(Double length, Double width){

        this.guests = new ArrayList<Guest>();
        this.length = length;
        this.width = width;
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

    public Double calculateSize(){
        return length*width;
    }
}
