import java.util.Scanner;
public class CommonFactors{
  public static void main(String [] args){
    Scanner input = new Scanner (System.in);

    System.out.print("Enter a number: ");
    int number = input.nextInt();
    
    for(int index = 1; index <= number; index++){
     if (number % index == 0){
        System.out.println(index);
       
        
       }
    }
  }
}
