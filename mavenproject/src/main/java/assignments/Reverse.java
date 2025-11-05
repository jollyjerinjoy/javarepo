package assignments;

public class Reverse {
  
	public static void main(String[] args) {
		int num1= 12;
		int re=0;
		while (num1!=0)  //1!=0   1!=0 0=0
		
		{
			int digit=num1%10;   ///12%10  1%10  1
			re=re*10+digit;   //0*10+2=2   0*10+1=1
			num1=num1/10;      //12/10=1  1/10=0
			
		}
		System.out.println("Reversed number: " + re);  //2 //21
	}

}
