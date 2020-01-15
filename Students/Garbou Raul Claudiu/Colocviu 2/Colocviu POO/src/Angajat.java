import java.util.Date;

public class Angajat implements AtributiiAngajat {
	private String nume;
	private Date dataAngajarii;
	private Long ID;
	private Double bonusSalariu;

	public Angajat(String nume, Date dataAngajarii, Long ID, Double bonusSalariu) {
		this.nume = nume;
		this.dataAngajarii = dataAngajarii;
		this.ID = ID;
		this.bonusSalariu = bonusSalariu;
	}
	

	@Override
	public void vinMedicamente() {
	}

	@Override
	public void scoateMedicament() {
	}

	@Override
	public int verificareStoc(String denumireMedicament) {
		return 0;
	}

	@Override
	public boolean disponibilitateMedicament(String denumireMedicament) {
		return false;
	}

	@Override
	public void introduReteta() {
	}

	public Double getBonusSalariu() {
		return bonusSalariu;
	}

	public void setBonusSalariu(Double bonusSalariu) {
		this.bonusSalariu = bonusSalariu;
	}

	public Date getDataAngajarii() {
		return dataAngajarii;
	}

	public void setDataAngajarii(Date dataAngajarii) {
		this.dataAngajarii = dataAngajarii;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

}