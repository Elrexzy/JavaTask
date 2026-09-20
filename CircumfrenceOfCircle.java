import java.util.Scanner;

public class CircumferenceOfCircle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double pi = 3.14159;

        System.out.print("Enter radius: ");
        int radius = input.nextInt();

        System.out.println("Diameter = " + 2 * radius);
        System.out.println("Circumference = " + 2 * pi * radius);
        System.out.println("Area = " + pi * radius * radius);
    }
}
