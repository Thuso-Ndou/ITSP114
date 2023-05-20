
/**
 * A Java program that prompts the user to input an integer and then outputs the
 * number with the digits reversed.
 *
 * @author (Thuso Ndou)
 * @version (19/05/2023)
 */
import java.util.*;
public class Practical_7_no_2_37853058_Ndou
{
    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in); // scanner object
        
        System.out.println("Please enter an integer number: "); // first message to display on the program
        
        int number; // declaring variable number
        number = x.nextInt(); // prompts for the input value
        
        if (number > 0) // test condition for positive integer
        {
            do {
                System.out.print(number); // displays the number value
                number --; // decrement number by 1
            } 
            while (number != 0); // controll statement
        }
        if (number < 0) // test condition for negative integer
        {
            do {
                System.out.print(number); // displays the number value
                number ++; // increment number by 1
            } 
            while (number != 0); // controll statement
        }
        if (number == 0) // test condition for a zero value
            {
                System.out.print(".."); // display message when number is zero
            }
    }
}
