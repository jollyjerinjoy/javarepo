package exception;

public class Throwsexample {

	public static void main(String[] args) throws VotingExceptiontest {
	int age=16;
		if (age<=18)
		{
			throw new VotingExceptiontest("votingexception due to ineligibility");
		}
		else
		{
			System.out.println("eligible");
		}

	}

}
