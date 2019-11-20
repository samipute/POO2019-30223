package conturi;

public class CurrentAccount extends Account {
	private double overdraft;

	public CurrentAccount(int number, int overdraft) {
		super(number);
		this.overdraft = overdraft;
	}

	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}

	public double getOverdraft() {
		return this.overdraft;
	}
	
	public boolean isOverdraft() {
		if (this.getBalance() < 0) {
			return true;
		} else {
			return false;
		}
	}

	public void withdraw(double sum) {
		if (sum < 0) {
			System.err.println("Negative sum");
		} else {
			double withdrawAmount = super.getBalance();
			if (withdrawAmount - sum > this.overdraft) {
				super.withdraw(sum);
			} else {
				System.err.println("Can't withdraw!");
			}
		}
	}
}