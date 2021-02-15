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
public class UsingSwitchCase {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value from 1 - 12 for check the month in the year.");
        int i = input.nextInt();
        
        String month;
        
        switch (i) {
            case 1:
                month = "january";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "Jun";
                break;
            case 7:
                month = "Julay";
                break;
            case 8:
                month = "Augst";
                break;
            case 9:
                month = "Septembor";
                break;
            case 10:
                month = "Octobor";
                break;
            case 11:
                month = "Novembor";
                break;
            case 12:
                month = "Decembor";
                break;
            default:
                month = "Invlid! Please input value from 1 - 12";
        }
        System.out.println("The month is:  " + month);
    }
    
}
