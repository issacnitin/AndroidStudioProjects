
public class noofsudayson1st {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 1900,b = 1,co=0;
		String[] week  = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		
		
while(i<2000)
{
		System.out.println(i);
		b = b+31;
		System.out.println(week[b%7]);
		if(b%7==6)
			co++;
		//February Year
		if(i%100 != 0){
			if(i%4==0)
				b = b + 29;
		}
		else if(i%400 == 0)
			b = b+29;
		else b = b + 28;
		System.out.println(week[b%7]);
		if(b%7==6)
			co++;
		//March
		b = b + 31;
		System.out.println(week[b%7]);
		if(b%7==6)
			co++;
		//April
		b = b + 30;
		System.out.println(week[b%7]);
		if(b%7==6)
			co++;
		//May
		b = b + 31;
		System.out.println(week[b%7]);
		if(b%7==6)
			co++;
		//June
		b = b + 30;
		System.out.println(week[b%7]);
		if(b%7==6)
			co++;
		//July
		b = b  + 31;
		System.out.println(week[b%7]);
		if(b%7==6)
			co++;
		//August
		b = b + 31;
		System.out.println(week[b%7]);
		if(b%7==6)
			co++;
		//September
		b = b + 30;
		System.out.println(week[b%7]);
		if(b%7==6)
			co++;
		//October
		b = b  + 31;
		System.out.println(week[b%7]);
		if(b%7==6)
			co++;
		//November
		b = b + 30;
		System.out.println(week[b%7]);
		if(b%7==6)
			co++;
		//December
		b = b + 31;
		System.out.println(week[b%7]);
		if(b%7==6)
			co++;

		i++;
		}
System.out.println(co);

		
		
		
	}

}
