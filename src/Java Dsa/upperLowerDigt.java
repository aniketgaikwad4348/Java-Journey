import java.util.Scanner;
class upperLowerDigt
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the charater : ");
		char ch = sc.next().charAt(0);
		
		String op = (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z')?
			((ch >= 'A' && ch <= 'Z')?(ch +" is UpperCase Alphabet"):(ch +" is Lowercase Alphabet")):
			((ch >= '0' && ch <=  '9')?(ch + " is a Digit"):(ch +" is a Special Character"));
		System.out.println(op);
	}
}