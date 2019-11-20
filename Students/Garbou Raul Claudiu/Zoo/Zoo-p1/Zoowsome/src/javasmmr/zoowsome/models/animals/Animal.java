package javasmmr.zoowsome.models.animals;

public abstract class Animal implements Killer {
	private final double maintenanceCost;
	private final double dangerPerc;
	private Integer nrOfLegs;
	private String name;
	private boolean takenCareOf = 'false';

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
