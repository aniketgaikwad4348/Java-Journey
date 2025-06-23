import java.util.Scanner;
class celsiusToFahrenheit
{
 public static void main(String[] args)
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("ENTER THE DEGREE IN CELSIUS : " );
  double celsius = sc.nextDouble();
  double fahrenheit = (9.0 / 5) * celsius + 32 ; 
  
  System.out.println("CONVERTION OF CELSIUS TO FAHRENHEIT : " +fahrenheit);
 }
}
  