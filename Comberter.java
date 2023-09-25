/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comberter;

import java.util.Scanner;

/**
 *
 * @author Sacil_CPE
 */
public class Comberter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
        System.out.println("Comberterrrrrrr Ahu!!!!");
        System.out.println("  ");
        System.out.println("Select Operatoin");  
        System.out.println("[1.C to F]"
                + "[2.F to C]"
                + "[3.K to F]"
                + "[4.K to C]"
                + "[5.C to K]"
                + "[6.F to K]");
        int z = input.nextInt();

        if (z == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter value to combert: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
            scanner.close();
        } else if (z == 2) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter value to combert: ");
            double farenheight = scanner.nextDouble();
            double celcius = ((farenheight - 32) * 5 / 9);
            System.out.println("Temperature in celcius: " + celcius);
            scanner.close();
        } else if (z == 3) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter value to combert: ");
            double kelvin = scanner.nextDouble();
            double farenheight = (((kelvin - 273.15) * 9 / 5) + 32);
            System.out.println("Temperature in farenheight: " + farenheight);
            scanner.close();
        } else if (z == 4) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter value to combert: ");
            double kelvin = scanner.nextDouble();
            double celcius = ((kelvin - 273.15));
            System.out.println("Temperature in celcius: " + celcius);
            scanner.close();
        } else if (z == 5) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter value to combert: ");
            double celcius = scanner.nextDouble();
            double kelvin = ((celcius + 273.15));
            System.out.println("Temperature in kelvin: " + kelvin);
            scanner.close();
        } else if (z == 6) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter value to combert: ");
            double farenheight = scanner.nextDouble();
            double kelvin = (((farenheight - 32) * 5 / 9 + 273.15));
            System.out.println("Temperature in kelvin: " + kelvin);
            scanner.close();
        }

        {

        }

    }
}
