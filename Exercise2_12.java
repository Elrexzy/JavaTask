public class Exercise2_12 {
    public static void main(String[] args) {
        double p = 1000.0;
        double r = 0.07;
       

        double amountTen = p * Math.pow(1 + r, 10);
        double amountTwenty = p * Math.pow(1 + r, 20);
        double amountThirty = p * Math.pow(1 + r, 30);

        System.out.printf("Amount after 10 years: $%.2f\n", amountTen);
        System.out.printf("Amount after 20 years: $%.2f\n", amountTwenty);
        System.out.printf("Amount after 30 years: $%.2f\n", amountThirty);
    }
}
