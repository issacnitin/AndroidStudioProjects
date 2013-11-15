import java.math.*;
public class sumofalldigitswithpower5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long sum = 0L;
		long num= 0L;
		long limit = (long)Math.pow(9, 5)*5;
		long tempsum = 0L;
		for(long i=2L;i<=limit;i++)
		{	num=i;
		while(num!=0)
		{	
			tempsum = tempsum  + (long)Math.pow(num%10,5);
			num = (int)num/10;
		}
			if(tempsum == i)
			{
				System.out.println(i);
				sum = sum + i;
			
		}
			tempsum = 0 ;
		}
		
		System.out.println(sum);
	}

}
