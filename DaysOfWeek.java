import java.util.Scanner;
public class DaysOfWeek{
	public static void main (String [] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the subtotal and a gravity rate": );
	int days = input.nextInt();
	
	if (days % 7 == 0);
	System.out.print("Monday");
	
	if (days % 7 == 1);
	System.out.print("Tuesday");
	
	if (days % 7 == 2);
	System.out.print("Wednesday");
	
	if (days % 7 == 3);
	System.out.print("Thursday");
	
	if (days % 7 == 4);
	System.out.print("Friday");
	
	if (days % 7 == 5);
	System.out.print("Saturday");
	
	if (days % 7 == 6);
	System.out.print("Sunday");
	 }
	}
