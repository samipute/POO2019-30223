package javasmmr.zoowsome.models.animals;

public class Bird extends Animal{
	private Boolean migrates;
    private Integer avgFlightAltitude;
    
    public Boolean getMigrates() {
        return migrates;
    }
    public void setMigrates(Boolean migrates) {
        this.migrates = migrates;
    }

    public Integer getavgFlightAltitude() {
        return avgFlightAltitude;
    }
    public void setavgFlightAltitude(Integer avgFlightAltitude) {
        this.avgFlightAltitude = avgFlightAltitude;
    }
}
