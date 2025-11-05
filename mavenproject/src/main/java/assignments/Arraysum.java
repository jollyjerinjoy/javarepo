package assignments;

public class Arraysum {

	public static void main(String[] args) {
		int[] arr= {12,11,10};
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			
		}
		System.out.println(sum);
	}

}
