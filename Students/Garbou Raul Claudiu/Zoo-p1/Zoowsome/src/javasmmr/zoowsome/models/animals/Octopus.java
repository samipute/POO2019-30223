package javasmmr.zoowsome.models.animals;

public abstract class Octopus extends Aquatic{
	public Octopus() {
		setNrOfLegs(8);
		setName("Octopoda or Chinese Food");
		setavgSwimDepth(2000);
		setWaterType(TypeOfWater.SALTWATER);
	}
}
