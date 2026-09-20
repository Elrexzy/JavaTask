import java.util.Scanner;
public class TouchAddition{
  public static void main(String [] args){
    Scanner input = new Scanner (System.in);

    System.out.print("Enter a number: ");
    long number = input.nextInt();

   for (long index = number -1; index >= 1; index--){
        number = number * index;
      }
     
      System.out.println(number);
      }
}
  
