
public class problem2projeuler {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	 long  a = 1, b= 2, sumeven=0;
	 long   temp = b;
	 while(a<=4000000){
		 if(a%2==0){
			 sumeven=sumeven + a;
		 }
		 b = a + b;
		 a = temp;
		 temp = b;
	 }
	 System.out.println(sumeven );

	}

}
