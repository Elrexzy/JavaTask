import java.util.Scanner;

public class Numbers{
   public static void main(String[]args){

  Scanner input = new Scanner(System.in);

  System.out.print("input a number: ");
  int integer1 = input.nextInt();
  
  System.out.print("input a number: ");
  int integer2 = input.nextInt();

  System.out.print("input a number: ");
  int integer3 = input.nextInt();

  System.out.print("input a number: ");
  int integer4 = input.nextInt();

  System.out.print("input a number: ");
  int integer5 = input.nextInt();



        int largest = integer2;
        int smallest = integer2;

        if (integer1 > largest)
            largest = integer1;
       

        if (integer3 > largest) 
            largest = integer3;
        

        if (integer4 > largest) 
            largest = integer4;
        

        if (integer5 > largest) 
            largest = integer5;
        

        if (integer1 < smallest) 
            smallest = integer1;
        

        if (integer3 < smallest) 
            smallest = integer3;
        

        if (integer4 < smallest) 
            smallest = integer4;
        

        if (integer5 < smallest) 
            smallest = integer5;
            
            System.out.println("smallest" + smallest);
            System.out.println("largest" + largest);
    }
 }
