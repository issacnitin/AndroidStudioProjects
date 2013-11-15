
public class projeuler3 {

	public static int primeornot(long n){
		for(long i = 2L;i <= n/2; i++){
			if(n%i == 0){
				return 0;
			}
		}
		return 1;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long num = 600851475143L;
		long num2 = num;
		long div = 2L;
		while(num2 >=1){
			if(primeornot(div) == 1){
				System.out.println(num2);
				if(num%div == 0){
					System.out.println(div);
					num2 = num / div;
				}
				div++;
				
			}
		}
		
		
		
		
	}

}
