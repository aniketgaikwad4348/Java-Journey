import java.util.Scanner;
class AreaAndVolumeOfCylinder
{
 public static void main(String[] args)
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("ENTER THE RADIUS OF CYLINDER :");
  double r = sc.nextFloat();
  System.out.println("ENTER THE LENGTH OF CYLINDER : " );
  double length = sc.nextFloat();
  double pi = 3.14;
  double area = pi * r * r ;
  double volume = area * length ;
  
  System.out.println("AREA OF CYLINDER : " +area);
  System.out.println("VOLUME OF CYLINDER : " +volume);
 }
}
  