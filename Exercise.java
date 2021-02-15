/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifswitchstetment;

import java.util.Scanner;

/**
 *
 * @author Mamun
 */
public class Exercise {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int i = input.nextInt();

        boolean even;

        if ((i / 2) * 2 == i) {
            even = true;
            System.out.println("Is " + i + " an even? " + even);
        }
        if ((i / 2) * 2 != i) {
            even = false;
            System.out.println("Is " + i + " an even? " + even);
        }
    }
}
