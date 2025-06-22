import java.util.Scanner;
class LoanCalculator
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the months : ");
		int months = sc.nextInt();
		
		int years = months / 12;
		int reMonts = months % 12;
		System.out.println(years + reMonths);
	}
}