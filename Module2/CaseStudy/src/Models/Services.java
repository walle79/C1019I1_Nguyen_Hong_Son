package Models;

public abstract class Services {
    private String servicesName;
    private double aresUsed;
    private int feeRent;
    private int maxOfPeople;
    private String type;
    private String id;

    public Services() {
    }

    public Services(String servicesName, double aresUsed, int feeRent, int maxOfPeople, String type, String id) {
        this.servicesName = servicesName;
        this.aresUsed = aresUsed;
        this.feeRent = feeRent;
        this.maxOfPeople = maxOfPeople;
        this.type = type;
        this.id = id;
    }

    public String getServicesName() {
        return servicesName;
    }

    public void setServicesName(String servicesName) {
        this.servicesName = servicesName;
    }

    public double getAresUsed() {
        return aresUsed;
    }

    public void setAresUsed(double aresUsed) {
        this.aresUsed = aresUsed;
    }

    public int getFeeRent() {
        return feeRent;
    }

    public void setFeeRent(int feeRent) {
        this.feeRent = feeRent;
    }

    public int getMaxOfPeople() {
        return maxOfPeople;
    }

    public void setMaxOfPeople(int maxOfPeople) {
        this.maxOfPeople = maxOfPeople;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public abstract String showInfo();
}
