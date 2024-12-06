# DayOfTheWeekTool 🗓️

This is my first GitHub upload! 

DayOfTheWeekTool is a simple program that helps you figure out what day of the week it will be after a certain number of days starting from your chosen day. 

The user picks a day using a numeric legend (0 = Sunday, 1 = Monday, etc.) and enters how many days to look ahead. 

It validates both inputs, ensuring they are integers and within acceptable ranges (0–6 for the day, 0–999,999 for days ahead). Input loops are used for error handling—invalid entries prompt the user to try again.

The program uses variables like ```FirstDayOfTheWeek``` (stores the chosen day), ```DaysAhead``` (number of days to add), and ```InputValid1```/```InputValid2``` (booleans for input validation). 

It also converts the numeric days into string names with ```FirstDay``` and ```SecondDay``` using switch statements. The new day is calculated with ```(FirstDayOfTheWeek + DaysAhead) % 7```, ensuring the result loops back through the week.


# Setup ⚙️

You can run this program by downloading the .java file and running ```java DayOfTheWeekTool.java``` in the directory you installed it in.