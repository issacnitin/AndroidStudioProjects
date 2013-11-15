import java.util.Scanner;
public class projeulergrid20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[][] arrayofnumbers = inputArray();
		long bigger = 0L;
		for(int i =0; i<20; i++){
			for(int j =0; j<20; j++){
				if(j<=16)
				{
					if(frontcheck(arrayofnumbers,i,j)>bigger)
						bigger = frontcheck(arrayofnumbers,i,j);
					System.out.println(bigger);
				}
				if(j>=3)
				{
					if(backcheck(arrayofnumbers,i,j)>bigger)
						bigger = backcheck(arrayofnumbers,i,j);
				}
					
				if(i>=3)
				{
					if(upcheck(arrayofnumbers,i,j)>bigger)
						bigger = upcheck(arrayofnumbers,i,j);
					}
				if(i<=16)
				{
					if(downcheck(arrayofnumbers,i,j)>bigger)
						bigger = downcheck(arrayofnumbers,i,j);
				}
				if(i<=16&&j<=16)
				{
					if(rightbottom(arrayofnumbers,i,j)>bigger)
						bigger = rightbottom(arrayofnumbers,i,j);
				}
				if(i>=3&&j<=16)
				{
					if(righttop(arrayofnumbers,i,j)>bigger)
						bigger = righttop(arrayofnumbers,i,j);
				}
				if(i>=3&&j>=3){
					if(lefttop(arrayofnumbers,i,j)>bigger)
						bigger=lefttop(arrayofnumbers,i,j);
				}
				if(i<=16&&j>=3)
				{
					if(leftbottom(arrayofnumbers,i,j)>bigger)
						bigger=leftbottom(arrayofnumbers,i,j);
				}
				
			}
		}
		System.out.println("\n" + bigger);
	}
	
	public static long rightbottom(int[][] arrayofnumbers,int a,int b){
		long big =1;
			for(int j = b,i =a;j<(b+4);j++,i++){
				big = big * arrayofnumbers[i][j];
				System.out.print(arrayofnumbers[i][j]  + " ");
			}
		
		return big;
	}
	
	public static long righttop(int[][] arrayofnumbers,int a,int b){
		long big =1;
	
			for(int j = b,i=a;j<(b+4);j++,i--){
				big = big * arrayofnumbers[i][j];
				System.out.print(arrayofnumbers[i][j] + " ");
			}
		
		return big;
	}
	
	public static long leftbottom(int[][] arrayofnumbers,int a,int b){
		long big =1;
		
			for(int j = b,i=a;j>(b-4);j--,i++){
				big = big * arrayofnumbers[i][j];
				System.out.print(arrayofnumbers[i][j] + " ");
			}
		
		return big;
	}
	
	public static long lefttop(int[][] arrayofnumbers,int a,int b){
		long big =1;
			for(int j = b,i=a;j>(b-4);j--,i--){
				big = big * arrayofnumbers[i][j];
				System.out.print(arrayofnumbers[i][j] + " ");
			}
		
		return big;
	}
	
	public static long frontcheck(int[][] arrayofnumbers, int a, int b){
		long big = 1;
			for(int j=b; j<(b+4); j++){
				big = big * arrayofnumbers[a][j];
				System.out.print(arrayofnumbers[a][j] + " ");
			}
			System.out.println();
			return big;
		}
	
	public static long backcheck(int[][] arrayofnumbers, int a, int b){
		long big = 1;
		for(int j=b;j>(b-4);j--){
			big = big * arrayofnumbers[a][j];
			System.out.print(arrayofnumbers[a][j] + " ");
		}
		System.out.println();
		return b;
	}
	
	public static long downcheck(int[][] arrayofnumbers, int a, int b){
		long big = 1;
		for(int j = a; j<(a+4); j++){
			big = big * arrayofnumbers[j][b];
			System.out.print(arrayofnumbers[j][b] + " ");
		}
		System.out.println();
		return big;
	}
	
	public static long upcheck(int[][] arrayofnumbers, int a, int b){
		long big =1;
		for(int j = a; j>(a-4);j--){
			big = big * arrayofnumbers[j][b];
			System.out.print(arrayofnumbers[j][b] + " ");
		}
		System.out.println();

		return big;
	}
	public static int[][] inputArray()
	{
		Scanner in = new Scanner(System.in);
		int[][] a = new int[20][20];
		System.out.println("Input array : ");
		for(int i = 0;i<20; i++){
			for(int j = 0; j<20; j++){
			a[i][j] = in.nextInt();
			}
		}
		for( int i = 0;i<20;i++){
			for(int j=0;j<20;j++){
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		in.close();
		
		return a;
	}
	
	
}


