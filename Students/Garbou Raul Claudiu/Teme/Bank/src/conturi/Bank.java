package conturi;

public class Bank {
	private Account[] idCont = new Account[10];
	private int nrConturi;

	public Bank(Account[] idCont, int nrConturi) {
		this.idCont = idCont;
		this.nrConturi = nrConturi;
	}

	public int getNrConturi() {
		return this.nrConturi;
	}

	public Account getAccount(int index) {
		return this.idCont[index];
	}
	
	public Account[] conturi() {
		return idCont;
	}

	public void openAccount(Account idCont) {
		this.idCont[nrConturi] = idCont;
		nrConturi++;
	}

	public void closeAccount(Account idCont) {
		int index;
		for (index = 0; index < this.nrConturi; index++) {
			if (this.idCont[index].getAccountNumber() == idCont.getAccountNumber()) {
				this.idCont[index].withdraw(this.idCont[index].getBalance());
				break;
			}
		}
		for (int i = index; i < this.nrConturi; i++) {
			this.idCont[i] = this.idCont[i + 1];
		}
		this.nrConturi--;
	}

	public void payDividente(double suma) {
		for (int i = 0; i < this.nrConturi; i++) {
			this.idCont[i].deposit(suma);
		}
	}

	public void updateConturi() {
		for (int i = 0; i < nrConturi; i++) {
			if (idCont[i] instanceof SavingsAccount) {
				((SavingsAccount) idCont[i]).addInterest(250);
			} else {
				if (idCont[i] instanceof CurrentAccount) {
					((CurrentAccount) idCont[i]).isOverdraft();
				}
			}
		}
	}

}