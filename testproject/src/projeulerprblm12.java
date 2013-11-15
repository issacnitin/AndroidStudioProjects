
public class projeulerprblm12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long a = 1,co=0;
		int b = 1;
		long sum = 0;
		long largestco = 0;
		while(b == 1){
			for(int i = 1;i<=a;i++)
			{ sum = sum + i;
			}		
			for(int i = 1 ; i <=sum;i++)
			{
				if(sum%i==0){
					co++;
					if(co>500){
						System.out.println(co);
						System.out.println(sum);
						System.exit(0);
					}
				}
					if(co>largestco){
					System.out.println(sum + " " + co);
					largestco = co;
					}
			}
					
				
			a++;
			co = 0;
			sum = 0;
			
				
			
		}
		
		
		
	}

}
