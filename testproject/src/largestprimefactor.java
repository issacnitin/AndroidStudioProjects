import java.util.Scanner;


public class largestprimefactor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	long a = 0L;
	Scanner inputreader = new Scanner(System.in);
	System.out.println("Enter InpuT:");
	a = inputreader.nextLong();
	long bigger=0L,div=2L;
	while(div<=a/2)
	{
		if(ifprime(div)==1)
		{
			if(div>bigger)
				bigger  =div;
		}
		div+=2;
		if(div-1%100000==0 && div>100000)
			System.out.println(bigger);
	}
	inputreader.close();
System.out.println(bigger);
	}
	
public static int ifprime(long n)
{
	for(int i=2;i<n/2;i++)
	{
		if(n%i==0)
			return 0;
	}
	return 1;
}

}
