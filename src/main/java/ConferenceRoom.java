public class ConferenceRoom extends Room{
    private String name;

    public ConferenceRoom(Double length, Double width, String name){
        super(length, width);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
