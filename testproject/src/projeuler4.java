
public class projeuler4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long big = 100L;
		for(int i = 100; i < 1000;i++){
			for(int j =100; j<1000;j++)
			{
				if(isPalindrome(i*j)){
					if(i*j > big){
						big = i*j;
					}
				}
			}
			
		System.out.println(big);
		}
		
	}

	
	 public static boolean isPalindrome(long number) {
	        long palindrome = number; // copied number into variable
	        long reverse = 0L;

	        while (palindrome != 0) {
	            long remainder = palindrome % 10;
	            reverse = reverse * 10 + remainder;
	            palindrome = palindrome / 10;
	        }

	        // if original and reverse of number is equal means
	        // number is palindrome in Java
	        if (number == reverse) {
	            return true;
	        }
	        return false;
	    }

}
