package javasmmr.zoowsome.models.animals;

public abstract class Frog extends Aquatic{
	public Frog() {
		setNrOfLegs(4);
		setName("Anura or jumpy slimy green thing");
		setavgSwimDepth(20);
		setWaterType(TypeOfWater.SALTWATER);
	}
}
