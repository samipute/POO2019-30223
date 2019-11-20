package conturi;

public class SavingsAccount extends Account {
	private double interest;

	public SavingsAccount(int number, double interest) {
		super(number);
		this.interest = interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public double getInterest() {
		return this.interest;
	}

	public void addInterest(double interest) {
		super.deposit(this.interest);
	}
}