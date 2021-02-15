package ifswitchstetment;

import java.util.Scanner;

public class IfCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any sign that you want to calculate : ");
        String sign = input.nextLine();

        System.out.print("Enter two number: ");
        double i = input.nextDouble();
        double j = input.nextDouble();

        double sum = i + j;
        double sub = i - j;
        double mul = i * j;
        double div = i / j;
        double mod = i % j;

        if (sign.equals("+")) {
            System.out.println("Sum of " + i + " and " + j + " is=" + sum);
        } else if (sign.equals("-")) {
            System.out.println("Subtruct of " + i + " and " + j + " is=" + sub);
        } else if (sign.equals("*")) {
            System.out.println("Multiply of " + i + " and " + j + " is=" + mul);
        } else if (sign.equals("/")) {
            System.out.println("Divition of " + i + " and " + j + " is=" + div);
        } else if (sign.equals("%")) {
            System.out.println("Modulas of " + i + " and " + j + " is=" + mod);
        }
    }
}
