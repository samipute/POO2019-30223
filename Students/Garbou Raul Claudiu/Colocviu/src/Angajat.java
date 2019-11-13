import java.util.*;

public class Angajat extends Persoana {
	Date angajare;
	int numarClienti;

	public Date getangajare() {
		return angajare;
	}

	public void setangajare(Date angajare) {
		this.angajare = angajare;
	}

	public int getnumarClienti() {
		return numarClienti;
	}

	public void setnumarClienti(int numarClienti) {
		this.numarClienti = numarClienti;
	}

	public void cazare(Client cazare) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter the id");
		cazare.id = keyboard.nextInt();

		System.out.println("enter the name");
		cazare.nume = keyboard.toString();

		System.out.println("enter the phone number");
		cazare.numarTelefon = keyboard.nextInt();
		keyboard.close();

		System.out.println("enter the phone number");
		cazare.numarCamera = keyboard.nextInt();
		keyboard.close();
	}
}
