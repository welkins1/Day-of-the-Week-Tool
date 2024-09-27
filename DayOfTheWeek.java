package dayoftheweek;

//This is my first GitHub upload :)
//Programmer Name: Austin
//GitHub Username: 

//Catches invalid input beyond invalid numbers
import java.util.InputMismatchException;

//Allows for Scanner input
import java.util.Scanner;

public class DayOfTheWeek {

    public static void main(String[] args) {

        //Program Description
        System.out.println("This program tells you what day of the week it will be after a certain amount of days after your selected day of the week.\n");

        //Legend 
        System.out.println("~~~~~~~~~~~~~~\n");
        System.out.println("0 = Sunday\n");
        System.out.println("1 = Monday\n");
        System.out.println("2 = Tuesday\n");
        System.out.println("3 = Wednesday\n");
        System.out.println("4 = Thursday\n");
        System.out.println("5 = Friday\n");
        System.out.println("6 = Saturday\n");
        System.out.println("~~~~~~~~~~~~~~\n");

        Scanner input = new Scanner(System.in);

        //Declaring DayOfTheWeek variable
        int DayOfTheWeek;

        //DayOfTheWeek Prompt
        System.out.print("Please select a day of the week using the legend above (0-6): ");

        //Invalid input loop for DayOfTheWeek
        while (true) {

            try {

                //DayOfTheWeek input
                DayOfTheWeek = input.nextInt();

                if (DayOfTheWeek >= 0 && DayOfTheWeek <= 6) {
                    break;
                } else {
                    System.out.print("Please select a number 0-6: ");

                }
                //Prevents program from crashing if there is an invalid input beyond an invalid number
            } catch (InputMismatchException error) {
                input.next();
                System.out.print("Please select a number 0-6: ");

            }
        }

        //Spacer 
        System.out.println("");

        //Declaring DaysAhead 
        int DaysAhead = -1;

        //DaysAheadPrompt
        System.out.print("Enter the amount of days you would like to look ahead to see the new day of the week (Max is 100,000): ");

        //Invalid input loop for DaysAhead 
        while (true) {
            try {
                //DaysAheadInput
                DaysAhead = input.nextInt();

                if (DaysAhead >= 0 && DaysAhead <= 100000) {
                    break;
                } else {
                    System.out.print("Please select a number between 0 and 100,000: ");

                }
                //Prevents program from crashing if there is an invalid input beyond an invalid number
            } catch (InputMismatchException error) {
                input.next();
                System.out.print("Please select a number between 0 and 100,0000: ");
            }
        }

        //Calculation for newDate
        int newDate = (DayOfTheWeek + DaysAhead) % 7;

        //Switch statement for displaying new day of the week (dayName)
        String dayName = "";

        switch (newDate) {
            case 0 ->
                dayName = "Sunday";
            case 1 ->
                dayName = "Monday";
            case 2 ->
                dayName = "Tuesday";
            case 3 ->
                dayName = "Wednesday";
            case 4 ->
                dayName = "Thursday";
            case 5 ->
                dayName = "Friday";
            case 6 ->
                dayName = "Saturday";

        }

        //Spacer
        System.out.println("");

        //Result
        System.out.println(DaysAhead + " Day(s) after your chosen day of the week is " + dayName + ".\n");
    }
}
