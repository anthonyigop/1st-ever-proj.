/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch.kuno;

import java.util.Scanner;

/**
 *
 * @author Sacil_CPE
 */
public class SwitchKuno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Comberterrrrrrr Ahu!!!!");
        System.out.println("Select Operatoin");
        System.out.println("[1.C to F]"
                + "[2.F to C]"
                + "[3.K to F]"
                + "[4.K to C]"
                + "[5.C to K]"
                + "[6.F to K]");
        System.out.println("Enter here: ");
        int z = input.nextInt();

        switch (z) {
            case 1:
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter value to combert: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
                scanner.close();
                break;

            case 2:

                System.out.print("Enter value to combert: ");
                double farenheight = input.nextDouble();
                double celcius = ((farenheight - 32) * 5 / 9);
                System.out.println("Temperature in celcius: " + celcius);
                input.close();
                break;

            case 3:

                System.out.print("Enter value to combert: ");
                double kelvin = input.nextDouble();
                double farenheight2 = (((kelvin - 273.15) * 9 / 5) + 32);
                System.out.println("Temperature in farenheight: " + farenheight2);
                input.close();
                break;

            case 4:

                System.out.print("Enter value to combert: ");
                double kelvin2 = input.nextDouble();
                double celcius2 = ((kelvin2 - 273.15));
                System.out.println("Temperature in celcius: " + celcius2);
                input.close();
                break;

            case 5:

                System.out.print("Enter value to combert: ");
                double celcius3 = input.nextDouble();
                double kelvin3 = ((celcius3 + 273.15));
                System.out.println("Temperature in kelvin: " + kelvin3);
                input.close();
                break;

            case 6:

                System.out.print("Enter value to combert: ");
                double farenheight3 = input.nextDouble();
                double kelvin4 = (((farenheight3 - 32) * 5 / 9 + 273.15));
                System.out.println("Temperature in kelvin: " + kelvin4);
                input.close();
                break;
        }

    }
}
    

