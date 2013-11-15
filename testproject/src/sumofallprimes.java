import java.util.Scanner;


public class sumofallprimes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long num = in.nextLong();
		long sum=0L;
		for(int i=6;i<num;i++)
		{
			if(isprime(i)==1)
				sum+=i;
			if(i>1000000&&i%100000==0)
				System.out.println(i/100000);
			
				}
		
		System.out.println(sum + 10);
		in.close();
		
		

	}
	
	
	public static int isprime(long num)
	{
		for(int i=3;i<=num/2;i+=2)
		{
			if(num%i==0)
				return 0;
		}
		return 1;
	}

}
