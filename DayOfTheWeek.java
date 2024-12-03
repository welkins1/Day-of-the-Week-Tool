//This is my first GitHub upload :)
//Programmer Name: Austin
//GitHub Username: welkins1


//Allows for Scanner input
import java.util.Scanner;

public class DayOfTheWeek {

    public static void main(String[] args) {

        //Program Description
        System.out.println("This program tells you what day of the week it will be after a certain amount of days after your selected day of the week.\n");

        //Legend 
        System.out.println("""
                          ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                                                 0 = Sunday
                           
                                                 1 = Monday
                           
                                                 2 = Tuesday
                           
                                                 3 = Wednesday
                            
                                                 4 = Thursday
                           
                                                 5 = Friday
                           
                                                 6 = Saturday
                           
                          ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                           """);
        
        
        
         //Creating scanner instance method
        Scanner input = new Scanner(System.in);

       
       

        
        //Declaring & Assigning Variable for first day chosen
        int FirstDayOfTheWeek = -5;

        //Declaring variable for invalid input
        boolean InputValid1 = false;

        //FirstDayofTheWeek input prompt
        System.out.print("Please select a day of the week using the legend above (0-6): ");
        
        //Loop used for input validation
        while (!InputValid1) {

            //If statement to check if user input is an Int
            if (input.hasNextInt()) { //input.hasNextInt checks if value is an Int
                FirstDayOfTheWeek = input.nextInt();
                
           
                 //If statemement to verify valid number
            if (FirstDayOfTheWeek >= 0 && FirstDayOfTheWeek <= 6) {
                InputValid1 = true;
            } else { //This else is associated with the second if expression
                System.out.print("Invalid day, please enter a number 0-6: ");
               
               
            }

             } else { //This else is associated with the first if expression
                System.out.print("Invalid input, please enter a number 0-6: ");
                input.next();
            }
        }


        //Declaring FirstDay to display a string
        String FirstDay = "";

        //Switch statement for string
        switch (FirstDayOfTheWeek) {
            case 0 ->
                FirstDay = "Sunday";
            case 1 ->
                FirstDay = "Monday";
            case 2 ->
                FirstDay = "Tuesday";
            case 3 ->
                FirstDay = "Wednesday";
            case 4 ->
                FirstDay = "Thursday";
            case 5 ->
                FirstDay = "Friday";
            case 6 ->
                FirstDay = "Saturday";

        
        }
        
        //Displays day chosen (FirstDay)
        System.out.println("\nYou chose " + FirstDay + ".");
        
        
       

        //Declaring DaysAhead 
        int DaysAhead = -1;

        //DaysAheadPrompt
        System.out.print("\nEnter the amount of days you would like to look ahead to see the new day of the week (Max is 999,999): ");

        
        
        
       
         
         //Declaring variable for invalid input
         boolean InputValid2 = false;
         
         //Loop used for input validation
         while (!InputValid2) {

            if (input.hasNextInt()) {
                DaysAhead = input.nextInt();
                
           

            if (DaysAhead >= 0 && DaysAhead <= 999999) {
                InputValid2 = true;
            } else { //This else is associated with second if expression
                System.out.print("\nInvalid day, please enter a number 0-999,999: ");
               
            }

             } else { //This else is associated with first if expression
                System.out.print("\nInvalid input, please enter a number 0-999,999: ");
                input.next();
            }
        }
         
         
       

        //Calculation for newDate
        int newDate = (FirstDayOfTheWeek + DaysAhead) % 7;

        //Switch statement for displaying new day of the week (SecondDay)
        String SecondDay = "";

        switch (newDate) {
            case 0 ->
                SecondDay = "Sunday.";
            case 1 ->
                SecondDay = "Monday.";
            case 2 ->
                SecondDay = "Tuesday.";
            case 3 ->
                SecondDay = "Wednesday.";
            case 4 ->
                SecondDay = "Thursday.";
            case 5 ->
                SecondDay = "Friday.";
            case 6 ->
                SecondDay = "Saturday.";

        }

        //Result
        System.out.printf("\n%,d Day(s) after a " + FirstDay + " is a " + SecondDay + "\n", DaysAhead);
                
    }
}

        
