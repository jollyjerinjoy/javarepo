package assignments;

public class Matricesadd {

	public static void main(String[] args) {
		int[][] a= {{1,2,3},{1,2,3}};
		int[][] b= {{1,4,5},{1,4,5}};
		int rows=2;
		int cols=3;
		int[][] sum=new int[rows][cols];
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				sum[i][j]=a[i][j]+b[i][j];
				
				System.out.print(sum[i][j]);
						}
			System.out.println();
		
		}
	

	}

}
