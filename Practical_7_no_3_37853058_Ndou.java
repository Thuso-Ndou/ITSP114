
/**
 * A Java program that asks the user to enter two numbers.
 * The numbers should be added and the sum displayed.
 *
 * @author (Thuso Ndou)
 * @version (19/05/2023)
 */
import java.util.*;
public class Practical_7_no_3_37853058_Ndou
{
    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in); // scanner object
        
        boolean answer = true; // boolen string
        String answerString;
        int sum = 0; // declaring and assigning sum to 0
        
        do
        {
            System.out.println("Please enter the first number: "); // message for the first number
            int number1; // declaring variable for first number
            number1 = x.nextInt(); // prompts for the input value
        
            System.out.println("Please enter the second number: "); // message for the second number
            int number2; // declaring variable for the second number
            number2 = x.nextInt(); // prompts for the input value
            
            sum = number1 + number2; // addition for the two numbers
            
            System.out.println("The sum is: " + sum); // displays the sum
            
            System.out.println("Do you wish to to perfom the operation again? Y/N"); // yes or no message
            answerString = x.next(); // response input as a String
    
            if (answerString.equalsIgnoreCase("y")) // repeats the loop when input is y
            {
                answer = true;  // sets boolean value to true
            }
            else // terminates the program
            {
                answer = false; // sets boolean value to false
            }
        }
        while(answer); // control statement
    }
}
