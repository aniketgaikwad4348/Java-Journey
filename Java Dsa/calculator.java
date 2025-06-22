import java.util.Scanner;
class calculator 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num1 : ");
		float num1 = sc.nextFloat();
		System.out.println("Enter the operator : ");
		char op = sc.next().charAt(0);
		System.out.println("Enter the num2 : ");
		float num2 = sc.nextFloat();
		
		float opt = 0;
		
		opt = (ch == '+')?(num1 + num2):
			(ch == '-')?(num1 - num2):
			(ch == '*')?(num1 * num2):
			(ch == '/')?(num1 / num2):
			(ch == '%')?(num1 % num2):
}