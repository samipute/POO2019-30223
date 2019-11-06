package javasmmr.zoowsome.models.animals;

public abstract class Wasp extends Insect {
	public Wasp() {
		setNrOfLegs(6);
		setName("Dolichovespula arenaria or jackass with wings");
		setCanFly(true);
		setIsDangerous(true);
	}
}
