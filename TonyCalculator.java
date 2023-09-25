/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tonycalculator;

import java.util.Scanner;

/**
 *
 * @author Sacil_CPE
 */
public class TonyCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello! Welcome to Tony's Calculator");
        System.out.println("  ");
        Scanner huh = new Scanner(System.in);
        
        int a = (100);
        int b = (300);
        System.out.println("Let a=100 and b=300");
        System.out.println("  ");
        
        System.out.println("Please Select an operation");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        int ans = huh.nextInt();
        
        if (ans==1) {
            double add = (a + b);
            System.out.println("The Answer is: " + add);
        } else if (ans==2) {
            double sub = (a - b);
            System.out.println("The Answer is: " + sub);
        } else if (ans==3) {
            double mult = (a * b);
            System.out.println("The Answer is: " + mult);
        } else if (ans==4) {
            double div = (a / b);
            System.out.println("The Answer is: " + div);
        }

    }
    
}
