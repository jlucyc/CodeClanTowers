public class DiningRoom extends Room{

    private String name;
    private int capacity;


    public DiningRoom(Double length, Double width, String name, int capacity){
        super(length, width);
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
