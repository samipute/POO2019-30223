package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Frog;
import javasmmr.zoowsome.models.animals.Octopus;
import javasmmr.zoowsome.models.animals.Goldfish;

public class AquaticFactory extends SpeciesFactory {

	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Aquatics.Frog.equals(type)) {
			return new Frog();

		} else if (Constants.Animals.Aquatics.Octopus.equals(type)) {
			return new Octopus();

		} else if (Constants.Animals.Aquatics.Goldfish.equals(type)) {
			return new Goldfish();

		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}