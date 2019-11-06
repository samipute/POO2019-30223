package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Chameleon;
import javasmmr.zoowsome.models.animals.Lizard;
import javasmmr.zoowsome.models.animals.Snake;

public class ReptileFactory extends SpeciesFactory {

	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Reptiles.Lizard.equals(type)) {
			return new Lizard();

		} else if (Constants.Animals.Reptiles.Snake.equals(type)) {
			return new Snake();

		} else if (Constants.Animals.Reptiles.Chameleon.equals(type)) {
			return new Chameleon();

		} else {
			throw new Exception("Invalid animal exception!");
		}
	}

}