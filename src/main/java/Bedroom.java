import java.util.ArrayList;

public class Bedroom extends Room {

    private RoomType roomType;
    private String roomNumber;

    private int rate;

    public Bedroom(Double length, Double width, RoomType roomType, String roomNumber, int rate){
        super(length, width);
        this.roomType = roomType;
        this.roomNumber = roomNumber;
        this.rate = rate;
    }


    public RoomType getRoomType() {
        return this.roomType;

    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getCapacityFromEnum() {
        return this.roomType.getCapacity();
    }

    public int getRate() {
        return this.rate;
    }
}
