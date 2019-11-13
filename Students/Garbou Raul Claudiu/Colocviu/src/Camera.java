
public class Camera {
	int numar;
	int capacitate;
	int pret;
	int pretSpecial;
	int cazati;
	String Oasepeti;

	public int calcul(int pret, int Discount) {
		int pretFinal;
		pretFinal = pret - Discount;
		return pretFinal;
	}

	public boolean isFull(int capacitate, int cazati) {
		if (capacitate == cazati)
			return true;
		else
			return false;
	}
}
