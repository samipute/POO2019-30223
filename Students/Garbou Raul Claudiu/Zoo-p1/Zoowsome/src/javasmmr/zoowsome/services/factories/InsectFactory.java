package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Wasp;
import javasmmr.zoowsome.models.animals.Cockroach;
import javasmmr.zoowsome.models.animals.Spider;

public class InsectFactory extends SpeciesFactory {

	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Insects.Cockroach.equals(type)) {
			return new Cockroach();

		} else if (Constants.Animals.Insects.Spider.equals(type)) {
			return new Spider();

		} else if (Constants.Animals.Insects.Wasp.equals(type)) {
			return new Wasp();

		} else {
			throw new Exception("Invalid animal exception!");
		}
	}

}