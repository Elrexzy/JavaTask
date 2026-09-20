import java.util.Scanner;

public class RemaindersOfThree{
   public static void main(String[]args){

      Scanner input = new Scanner(System.in);

      System.out.print("Enter a number: ");
      int number = input.nextInt();

      if (number % 3 == 0) {
         System.out.print( "Divisible by 3");
      } if (number % 3 != 0) {
         System.out.print("Not divisible by 3");
      }
      input.close();
    }
}
