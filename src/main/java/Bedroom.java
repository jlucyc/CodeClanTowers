import java.util.ArrayList;

public class Bedroom extends Room {

    private RoomType roomType;
    private String roomNumber;

    public Bedroom(RoomType roomType, String roomNumber){

        this.roomType = roomType;
        this.roomNumber = roomNumber;
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
}
