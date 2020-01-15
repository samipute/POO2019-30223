import java.util.Random;

public class Doctor {
	boolean determinare_boala()
	{
		Random rand = new Random();
		Boolean boala = rand.nextBoolean();
		return boala;
	}
}
