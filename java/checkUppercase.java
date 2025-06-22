import java.util.Scanner;
class checkUppercase
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character : ");
		char ch = sc.next().charAt(0);
		
		String op = (ch >= 'A' && ch <= 'Z')?(ch +" is UpperCase Alphabet"):(ch +" is Lowercase aphabet");
		System.out.println(op);
	}
}