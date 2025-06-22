import java.util.Scanner;
class CurrencyConvert
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("      CURRENCY CONVERTER");
		System.out.println("Enter the currency amount(in INR) : ");
		Float currInr = sc.nextFloat();
		
		System.out.println();
		
		System.out.println("*******LIST OF CURRENCY******");
		System.out.println("1. USD");
		System.out.println("2. EUR");
		System.out.println("3. YEN");
		System.out.println("4. PKR");
		
		System.out.println("Enter the currency: ");
		String curr = sc.next().toUpperCase();
		
		float newCurr = 0;
		if (curr.equals("USD"))
		{
			newCurr = currInr / 86.56f;
			System.out.println(currInr +"INR = " +newCurr +" USD");
		}
		else if (curr.equals("EUR"))
		{
			newCurr = currInr / 90.26f;
			System.out.println(currInr +"INR = " +newCurr +" EUR");
		}
		else if (curr.equals("YEN"))
		{
			newCurr = currInr / 0.55f;
			System.out.println(currInr +"INR = " +newCurr +" YEN");
		}
		else if (curr.equals("PKR"))
		{
			newCurr = currInr / 0.31f ;
			System.out.println(currInr +"INR = " +newCurr +" PKR");
		}
		else
		{
			System.out.println("INVALID CURRENECY : ");
		}
		
	}
}