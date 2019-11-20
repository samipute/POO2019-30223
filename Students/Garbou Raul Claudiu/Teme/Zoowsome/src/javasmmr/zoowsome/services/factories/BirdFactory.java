package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Crow;
import javasmmr.zoowsome.models.animals.Goose;
import javasmmr.zoowsome.models.animals.Chicken;

public class BirdFactory extends SpeciesFactory {

	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Birds.Crow.equals(type)) {
			return new Crow();

		} else if (Constants.Animals.Birds.Goose.equals(type)) {
			return new Goose();

		} else if (Constants.Animals.Birds.Chicken.equals(type)) {
			return new Chicken();

		} else {
			throw new Exception("Invalid animal exception!");
		}
	}

}