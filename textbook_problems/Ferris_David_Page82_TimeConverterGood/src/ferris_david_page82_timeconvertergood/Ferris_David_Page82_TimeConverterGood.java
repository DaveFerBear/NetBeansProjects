package ferris_david_page82_timeconvertergood;

import javax.swing.JOptionPane;

public class Ferris_David_Page82_TimeConverterGood {

    public static void SecondstoMinutes(double Parse2) { //Seconds to Minutes Conversion Method
        double output = Parse2 / 60;
        System.out.println(Parse2 + " seconds is " + output + " minutes.");
    }

    public static void SecondstoHours(double Parse2) { //Seconds to Hours Conversion Method
        double output = Parse2 / 3600;
        System.out.println(Parse2 + " seconds is " + output + " hours.");
    }

    public static void SecondstoDays(double Parse2) { //Seconds to Days Conversion Method
        double output = Parse2 / 86400;
        System.out.println(Parse2 + " seconds is " + output + " days.");
    }

    public static void MinutestoSeconds(double Parse2) { //Minutes to Seconds Conversion Method
        double output = Parse2 * 60;
        System.out.println(Parse2 + " minutes is " + output + " seconds.");
    }

    public static void MinutestoHours(double Parse2) { //Minutes to Hours Conversion Method
        double output = Parse2 / 60;
        System.out.println(Parse2 + " minutes is " + output + " hours.");
    }

    public static void MinutestoDays(double Parse2) { //Minutes to Days Conversion Method
        double output = Parse2 / 3600;
        System.out.println(Parse2 + " minutes is " + output + " days.");
    }

    public static void HourstoSeconds(double Parse2) { //Hours to Seconds Conversion Method
        double output = Parse2 * 3600;
        System.out.println(Parse2 + " hours is " + output + " seconds.");
    }

    public static void HourstoMinutes(double Parse2) { //Hours to Minutes Conversion Method
        double output = Parse2 * 60;
        System.out.println(Parse2 + " hours is " + output + " minutes.");
    }

    public static void HourstoDays(double Parse2) { //Hours to Days Conversion Method
        double output = Parse2 / 24;
        System.out.println(Parse2 + " hours is " + output + " days.");
    }

    public static void DaystoSeconds(double Parse2) { //Days to Seconds Conversion Method
        double output = Parse2 * 86400;
        System.out.println(Parse2 + " days is " + output + " seconds.");
    }

    public static void DaystoMinutes(double Parse2) { //Days to Minutes Conversion Method
        double output = Parse2 * 1440;
        System.out.println(Parse2 + " days is " + output + " minutes.");
    }
    
    public static void DaystoHours(double Parse2) { //Days to Hours Conversion Method
        double output = Parse2 * 24;
        System.out.println(Parse2 + " days is " + output + " hours.");
    }

    public static void main(String[] args) {

        int Parse1;
        double Parse2;
        
        String Initialinput = JOptionPane.showInputDialog("Please select the units:\n" //Display all possible conversions
                + "1 - Seconds to Minutes\n"
                + "2 - Seconds to Hours\n"
                + "3 - Seconds to Days\n"
                + "4 - Minutes to Seconds\n"
                + "5 - Minutes to Hours\n"
                + "6 - Minutes to Days\n"
                + "7 - Hours to Seconds\n"
                + "8 - Hours to Minutes\n"
                + "9 - Hours to Days\n"
                + "10 - Days to Seconds\n"
                + "11 - Days to Minutes\n"
                + "12 - Days to Hours\n");

        String Numberinput = JOptionPane.showInputDialog("Please enter a value:"); //box for entering initial value

        Parse1 = Integer.parseInt(Initialinput); //converts conversion choice to int
        Parse2 = Double.parseDouble(Numberinput); //converts input to a double

        switch (Parse1) { //Various cases regarding the different selected inputs
            case 1: {
                SecondstoMinutes(Parse2);
                break;
            }
            case 2: {
                SecondstoHours(Parse2);
                break;
            }
            case 3: {
                SecondstoDays(Parse2);
                break;
            }
            case 4: {
                MinutestoSeconds(Parse2);
                break;
            }
            case 5: {
                MinutestoHours(Parse2);
                break;
            }
            case 6: {
                MinutestoDays(Parse2);
                break;
            }
            case 7: {
                HourstoSeconds(Parse2);
                break;
            }
            case 8: {
                HourstoMinutes(Parse2);
                break;
            }
            case 9: {
                HourstoDays(Parse2);
                break;
            }
            case 10: {
                DaystoSeconds(Parse2);
                break;
            }
            case 11: {
                DaystoMinutes(Parse2);
                break;
            }
            case 12: {
                DaystoHours(Parse2);
                break;
            }
            default: //Invalid input error - end program
                System.out.println("Invalid Input");
                System.exit(0);
        }
    }
}