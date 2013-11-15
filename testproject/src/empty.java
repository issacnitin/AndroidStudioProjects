import java.math.*;
public class empty {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long num = 0L;
		int num2 = 0,i=2;
		long largestrepeatd;
		long[] checknum = new long[1000];
		long tempnum=0L;
		int j=0,k=0;
		while(i<1000)
		{
			tempnum = 1/i;
			while(tempnum > 0)
			{
			checknum[j] = (int)tempnum*10;
			tempnum = tempnum*10 - checknum[j];
			j++;
			while(k+1<=j)
			{
				checknum[j] = checknum[j] + checknum[k+1]*(long)Math.pow(10, k);
			}
			}
			
			
			for(i = 0;i<1000;i++)
			{
				num = numberofdigits(checknum[i]);
				for(j = 1;j<1000;j+=2)
					if(checknum[i])==checknum[j]/(Math.pow(10,j))
					{
						System.out.println("Repeats! " + checknum[i]);
						if(checknum[i]>largestrepeated)
						{
							largestd = i;
						}
					}
			}
		}
		
		

	}

	
	public int numberofdigits(long thedigit)
	{
		int count =0;;
		while(thedigit > 0)
		{
			thedigit = (int)thedigit/10;
			count++;
		}
		return count;
	}
}
