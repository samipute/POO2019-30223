package conturi;

public class InitializareConturi {
	public static void main(String argv[]) {
		Account conturileMele[] = new Account[10];
		conturileMele[0] = new Account(1);
		conturileMele[1] = new SavingsAccount(2, 420);
		conturileMele[2] = new CurrentAccount(3, 7590);

		Bank banca = new Bank(conturileMele, 3);
		SavingsAccount contFirma = new SavingsAccount(4, 12345);
		banca.openAccount(contFirma);

		System.out.println("Numar conturi dupa deschidere " + banca.getNrConturi());

		banca.closeAccount(conturileMele[0]);
		System.out.println("Numar conturi dupa inchidere " + banca.getNrConturi());

		banca.updateConturi();
		Account[] conturiNoi = banca.conturi();
		for (int i = 0; i < banca.getNrConturi(); i++)
			System.out.println(
					"nr card " + conturiNoi[i].getAccountNumber() + " suma din cont " + conturiNoi[i].getBalance());

		System.out.println("starea conturilor dupa plata dividendelor:");
		banca.payDividente(500);
		conturiNoi = banca.conturi();
		for (int i = 0; i < banca.getNrConturi(); i++)
			System.out.println(
					"nr card " + conturiNoi[i].getAccountNumber() + " suma din cont " + conturiNoi[i].getBalance());

	}
}