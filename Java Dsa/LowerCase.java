import java.util.Scanner;
class LowerCase
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the character : ");
		char ch = sc.next().charAt(0);
		
		String op = (ch >= 'a' && ch <= 'z')?(ch +" is a LowerCase Alphabet"):(ch +" is UpperCase Alphabet");
		System.out.println(op);
	}
}