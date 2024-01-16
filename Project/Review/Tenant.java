package Project.Review;

public class Tenant {

    private String teamName;
    private String sport;
    private String league;

    public Tenant() {
    }

    public Tenant(String name, String sport, String league) {
        this.teamName = name;
        this.sport = sport;
        this.league = league;
    }

    public void setTeamName(String name) {
        this.teamName = name;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setSport(String sport) {
        this.sport  = sport;
    }

    public String getSport() {
        return sport;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public String getLeague() {
        return league;
    }

    @Override
    public String toString() {
        return "Tenant: " + teamName + "\nSport: " + sport + "\nLeague: " + league;
    }
       
}
