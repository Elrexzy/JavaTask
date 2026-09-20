import java.util.Scanner;

public class Exercise2_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int numberOne = input.nextInt();
        System.out.print("Enter second integer: ");
        int numberTwo = input.nextInt();
        System.out.print("Enter third integer: ");
        int numberThree = input.nextInt();

        int sum = numberOne + numberTwo + numberThree;
        double average = sum / 3.0;
        int product = numberOne * numberTwo * numberThree;
        int smallest = Math.min(numberOne, Math.min(numberTwo, numberThree));
        int largest = Math.max(numberOne, Math.max(numberTwo, numberThree));

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Product: " + product);
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
    }
}
