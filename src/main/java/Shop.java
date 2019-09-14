import

public class Shop {

    private ArrayList<Item> items;

    public Shop() {
    items = new ArrayList<item>();
    }
}





public class ThemePark {

    private ArrayList<Stall> stalls;
    private ArrayList<Attraction> attractions;

    public ThemePark() {
        stalls = new ArrayList<Stall>();
        attractions = new ArrayList<Attraction>();
    }

    public void addAttraction(Attraction attraction){
        this.attractions.add(attraction);
    }

    public void addStall(Stall stall){
        this.stalls.add(stall);
    }