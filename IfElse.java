package ifswitchstetment;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int i = input.nextInt();

        if (i == 0) {
            System.out.println("The input number is Zerro.");
        }else if ((i % 2) == 0) {
            System.out.println("The input number is Positive.");
        } else if ((i % 2) != 0) {
            System.out.println("The input number is Negitive.");
        }
    }
}
