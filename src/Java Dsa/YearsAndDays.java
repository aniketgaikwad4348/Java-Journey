import java.util.Scanner;
class YearsAndDays
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Minutes : ");
		
		int minutes = sc.nextInt();
		
		int years = minutes / (60 * 24 * 365);
		int days =  (minutes - (years * (60 * 24 * 365))) / (60 * 24);
		
		System.out.println("Numbers of years : " +years +" years");
		System.out.println("Numbers of days : " +days +" days");
	}
		
		
		
}