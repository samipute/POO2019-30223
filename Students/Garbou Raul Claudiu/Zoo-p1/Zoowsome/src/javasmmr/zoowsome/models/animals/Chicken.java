package javasmmr.zoowsome.models.animals;

public abstract class Chicken extends Bird{
	public Chicken(){
		this.setavgFlightAltitude(0);
		this.setMigrates(false);
		this.setName("Perfect cure for any cold in Romania");
		this.setNrOfLegs(2);
	}
}
