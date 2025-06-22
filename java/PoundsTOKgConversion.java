import java.util.Scanner;
class PoundsToKgConversion
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value in Pounds : ");
		
		float pounds = sc.nextFloat();
		
		float kg = pounds * 0.454f;
		
		System.out.println("Pounds : " +pounds);
		System.out.println("Kilogram : " +kg);
	}
}