package javasmmr.zoowsome.models.animals;

public class Animal {
	private Integer nrOfLegs;
	private String name;

	public Animal(Integer nrOfLegs, String name) {
		this.nrOfLegs = nrOfLegs;
		this.name = name;
	}

	public void setNrOfLegs(Integer nrOfLegs) {
		this.nrOfLegs = nrOfLegs;
	}

	public Integer getNrOfLegs() {
		return nrOfLegs;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public Animal() {
	}
}
