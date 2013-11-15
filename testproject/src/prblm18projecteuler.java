import java.util.Scanner;



public class prblm18projecteuler {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
Scanner inputarray = new Scanner(System.in);
int[][] triarray = new int[15][15];
for(int k = 0;k<15;k++)
{	for(int l=0;l<=k;l++){
	triarray[k][l] = inputarray.nextInt();
}

}

System.out.println("Insertion completed");


int pointer=0;
int sum = 75;
int m=15;
int k= 0;
for(int i=1;i<m;i++)
{

		if(triarray[i][pointer]>triarray[i][pointer+1])
		{
			k = triarray[i][pointer];
		}
		else
			{
			k = triarray[i][pointer+1];
			pointer = pointer+1;
			}
		System.out.println(k);
		sum = sum + k;
	System.out.println("Sum= " + sum + "\n" + "i " + i);
	
}
	System.out.println(sum);
		
		inputarray.close();
		
	}
	
}


