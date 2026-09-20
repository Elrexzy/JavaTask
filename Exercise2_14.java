import java.util.Scanner;

public class Exercise2_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age in years: ");
        int age = input.nextInt();

        int maxHeartRate = 220 - age;
        double minTarget = maxHeartRate * 0.50;
        double maxTarget = maxHeartRate * 0.85;

        System.out.println("Your maximum heart rate is: " + maxHeartRate + " bpm");
        System.out.printf("Your target heart-rate range is: %.1f - %.1f bpm\n", minTarget, maxTarget);
    }
}
