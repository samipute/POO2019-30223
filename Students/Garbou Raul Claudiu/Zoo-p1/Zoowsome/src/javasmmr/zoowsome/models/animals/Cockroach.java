package javasmmr.zoowsome.models.animals;

public abstract class Cockroach extends Insect {
	public Cockroach() {
		setNrOfLegs(6);
		setName("Blattodea or Bring me the flamethrower");
		setCanFly(false);
		setIsDangerous(false);
	}
}
