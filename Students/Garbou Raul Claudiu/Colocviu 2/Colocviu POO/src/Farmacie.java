import java.util.HashMap;
import java.util.List;

public class Farmacie {
	private String denumire;
	private String adresa;
	private String numarTelefon;
	private String website;
	private HashMap<String, Integer> stocMedicamente;
	private HashMap<String, Integer> reteteProcesate;
	private List<Angajat> angajati;

	public Farmacie(String denumire, String adresa, String numarTelefon, String website,
			HashMap<String, Integer> stocMedicamente, HashMap<String, Integer> reteteProcesate,
			List<Angajat> angajati) {
		this.denumire = denumire;
		this.adresa = adresa;
		this.numarTelefon = numarTelefon;
		this.website = website;
		this.stocMedicamente = stocMedicamente;
		this.reteteProcesate = reteteProcesate;
		this.angajati = angajati;
	}

	//deep copy
	public Farmacie(Farmacie otherFarmacie) {
		this(otherFarmacie.getDenumire(), otherFarmacie.getAdresa(), otherFarmacie.getNrTelefon(),
				otherFarmacie.getWebsite(), otherFarmacie.getStocMedicamente(), otherFarmacie.getReteteProcesate(),
				otherFarmacie.getAngajati());
	}

	public String getDenumire() {
		return denumire;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getNrTelefon() {
		return numarTelefon;
	}

	public void setNrTelefon(String nrTelefon) {
		this.numarTelefon = nrTelefon;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public HashMap<String, Integer> getStocMedicamente() {
		return stocMedicamente;
	}

	public void setStocMedicamente(HashMap<String, Integer> stocMedicamente) {
		this.stocMedicamente = stocMedicamente;
	}

	public HashMap<String, Integer> getReteteProcesate() {
		return reteteProcesate;
	}

	public void setReteteProcesate(HashMap<String, Integer> reteteProcesate) {
		this.reteteProcesate = reteteProcesate;
	}

	public List<Angajat> getAngajati() {
		return angajati;
	}

	public void setAngajati(List<Angajat> angajati) {
		this.angajati = angajati;
	}
}