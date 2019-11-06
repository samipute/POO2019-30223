package javasmmr.zoowsome.models.animals;

public abstract class Goldfish extends Aquatic{
	public Goldfish() {
		setNrOfLegs(0);
		setName("Gold Fish or Mom,another one died");
		setavgSwimDepth(100);
		setWaterType(TypeOfWater.FRESHWATER);
	}
}
