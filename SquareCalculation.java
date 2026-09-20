import java.util.Scanner;
public class SquareCalculation{
	public static void main (String [] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a number: ");
	double squareMeters = input.nextDouble();
	
	double ping = squareMeters * 0.3025;
	System.out.println(squareMeters + " square meters is " + ping + " pings");
  }
}
