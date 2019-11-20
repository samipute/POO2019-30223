package javasmmr.zoowsome.models.animals;

import java.util.Random;

public abstract class Animal implements Killer {
	private final double maintenanceCost;
	private final double dangerPerc;
	private Integer nrOfLegs;
	private String name;
	private boolean takenCareOf = false;

	public Animal(double maintenanceCost, double dangerPerc) {
		this.dangerPerc = dangerPerc;
		this.maintenanceCost = maintenanceCost;
	}

	public boolean kill() {
		Random r = new Random();
		double random = r.nextDouble();
		if (random < dangerPerc) {
			return true;
		} else
			return false;
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

	public boolean isTakenCareOf() {
		return takenCareOf;
	}

	public void setTakenCareOf(boolean takenCareOf) {
		this.takenCareOf = takenCareOf;
	}

	public double getMaintenanceCost() {
		return maintenanceCost;
	}

	public Animal() {
	}
}
