public class largestprimefactorprojeuler {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long num =600851475143L;
		long div=1L;
		while(num > 1){
			if(num%div==0){
				System.out.println(div);
			}
			div++;
		}
		
		
		
	}

}
