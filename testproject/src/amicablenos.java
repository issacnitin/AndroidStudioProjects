
public class amicablenos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long sum1=0,i = 2,totalsum = 0,no2=0;
		
		while(i<10000)
		{sum1 = purediv(i);
		no2 = purediv(sum1);
		if(i == no2)
		{	System.out.println(sum1 + "  " + no2);
			totalsum = totalsum + sum1 + no2;
		}	
		i++;
		}
		System.out.println(totalsum);
		
		
		}
	public static long purediv(long a){
		long sum = 0;
		for(int i =1;i<=a/2;i++)
		{	if(a%i==0)
		{
			sum = sum + i;
		}
		}
		return sum;
		}
	}

