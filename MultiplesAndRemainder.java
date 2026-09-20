import java.util.Scanner;

public class MultiplesAndRemainder{
   public static void main(String[]args){

      Scanner input = new Scanner(System.in);

      System.out.print("Enter a number: ");
      int firstNumber = input.nextInt();

      System.out.println(firstNumber * 3);

      System.out.print("Enter a number: ");
      int secondNumber = input.nextInt();

      System.out.println(secondNumber * 2);

      System.out.println(firstNumber % secondNumber);


   }
}
