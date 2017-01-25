/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ferris_david_page87_question2;

import java.util.Scanner;

/**
 *
 * @author davidferris
 */
public class Ferris_David_Page87_Question2 {

    /**
     * @param args the command line arguments
     */
    
    public static double InchestoCentimeters(double Inches)
    {
        double Centimeters = Inches*2.54;
        return Centimeters;
    }
    
    public static double CentimeterstoInches(double Centimeters)
    {
        double Inches = Centimeters/2.54;
        return Inches; 
    }
    
    public static double FeettoCentimeters(double Feet)
    {
        double Centimeters = Feet*30;
        return Centimeters;
    }
    
    public static double CentimeterstoFeet(double Centimeters)
    {
        double Feet = Centimeters/30;
        return Feet; 
    }
    
    public static double YardstoMeters(double Yards)
    {
        double Meters = Yards*.91;
        return Meters;
    }
    
    public static double MeterstoYards(double Meters)
    {
        double Yards = Meters/.91;
        return Yards; 
    }
    
    public static double KilometerstoMiles(double Kilometers)
    {
        double Miles = Kilometers/1.6;
        return Miles; 
    }
    
    public static double MilestoKilometers(double Miles)
    {
        double Kilometers = Miles*1.6;
        return Kilometers; 
    }
    
    public static void main(String[] args) {
        
        int conversioninput;
        int Selection;
        
        System.out.print("Enter a number: ");
        
        Scanner inputnumber = new Scanner(System.in);
        conversioninput = inputnumber.nextInt();
        
        System.out.print("\nConvert:\n"
                + "1. Inches to Centimeters     5. Centimeters to Inches\n"
                + "2. Feet to Centimeters       6. Centimeters to Feet\n"
                + "3. Yards to Meters           7. Meters to Yards\n"
                + "4. Miles to Kilometers       8. Kilometers to Miles\n");
        
        System.out.println("\nEnter your choice: ");
        
        Scanner Convert = new Scanner(System.in);
        Selection = Convert.nextInt();
        
        switch (Selection) {
            case 1:
                System.out.println(conversioninput + " inches is " + InchestoCentimeters(conversioninput) + " centimeters.");
                break;
            case 2:
                System.out.println(conversioninput + " feet is " + FeettoCentimeters(conversioninput) + " centimeters.");
                break;
            case 3:
                System.out.println(conversioninput + " yards is " + YardstoMeters(conversioninput) + " meters.");
                break;
            case 4:
                System.out.println(conversioninput + " miles is " + MilestoKilometers(conversioninput) + " kilometers");
                break;
            case 5:
                System.out.println(conversioninput + " centimeters is " + CentimeterstoInches(conversioninput) + " inches.");
                break;
            case 6:
                System.out.println(conversioninput + " centimeters is " + CentimeterstoFeet(conversioninput) + " feet");
                break;
            case 7:
                System.out.println(conversioninput + " meters is " + MeterstoYards(conversioninput) + " yards");
                break;
            case 8:
                System.out.println(conversioninput + " kilometers is " + KilometerstoMiles(conversioninput)  + " miles");
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }           
    }
}
