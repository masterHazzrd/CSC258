package Project.Review;

public class Tenant {

    private String tenantName;
    private String sport;

    public Tenant() {
    }

    public Tenant(String name, String sport) {
        this.tenantName = name;
        this.sport = sport;
    }

    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String name) {
        this.tenantName = name;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    @Override
    public String toString() {
        String rtnStr = "Tenant: " + tenantName + "\nSprort: " + sport;
        return rtnStr;
    }    
}
