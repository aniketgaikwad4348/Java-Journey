import java.util.Scanner;
class primeNo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		System.out.print((num == 2 || num == 3 ) ? (num +" is prime"):((num % 2 == 0 || num % 3 == 0)?(num +" is not prime"):(num +" is prime")));
	}
}