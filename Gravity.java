import java.util.Scanner;
public class Gravity{
	public static void main (String [] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the subtotal and a gravity rate: ");
	double subtotal = input.nextDouble();
	double gravityRate = input.nextDouble();
	
	double total = subtotal + gravityRate;
	double gravity = subtotal * gravityRate / 100;
	
	System.out.println(" The gravity is $ " + gravity + " and total is $" + total);
  }
}
