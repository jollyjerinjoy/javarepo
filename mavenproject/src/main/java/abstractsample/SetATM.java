package abstractsample;

public class SetATM extends ATM {
	void withdraw()
	{
		System.out.println("withdrw activity done serverside, success");
	}

	void balance()
	{
		System.out.println("balace calc activity done serverside, success");
	}

	public static void main(String[] args) {
		ATM atm=new SetATM(); //upcasting
		atm.balance();
		atm.withdraw();
				

	}

}
