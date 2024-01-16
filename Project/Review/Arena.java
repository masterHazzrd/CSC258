package Project.Review;

public class Arena {

    private String venueName;
    private String city;
    private String state;
    private int maxCapcity;
    private int yearOpened;
    private Tenant team;

    public Arena() {        
    }

    public Arena(String venue, String city, String state, int capcity, int yrOpened, Tenant team) {
        this.venueName = venue;
        this.city = city;
        this.state = state;
        this.maxCapcity = capcity;
        this.yearOpened = yrOpened;
        this.team = team;
    }

    public void setVenueName(String venue) {
        this.venueName = venue;
    }

    public String getVenueName() {
        return venueName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setMaxCapcity(int capcity) {
        this.maxCapcity = capcity;
    }

    public int getMaxCapcity() {
        return maxCapcity;
    }

    public void setYearOpened(int yrOpened) {
        this.yearOpened = yrOpened;
    }

    public int getYearOpened() {
        return yearOpened;
    }

    public void setTenant(Tenant team) {
        this.team = team;
    }

    public Tenant getTenant() {
        return team;
    }

    @Override
    public String toString() {
        return "Arena: " + venueName + "\nCity: " + city + "\nState: " + state + "\nCapcity" + maxCapcity + "\nOpened: " + yearOpened + "\nTenant: " + team;
    }
    
}