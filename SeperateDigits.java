import java.util.Scanner;

public class SeperateDigits {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int number = input.nextInt();

        int firstDigit = number / 10000;
        int secondDigit = (number / 1000) % 10;
        int thirdDigit = (number / 100) % 10;
        int fourthDigit = (number / 10) % 10;
        int fifthDigit = number % 10;

        System.out.println(firstDigit + "   " + secondDigit + "   "
                + thirdDigit + "   " + fourthDigit + "   " + fifthDigit);
    }
}
