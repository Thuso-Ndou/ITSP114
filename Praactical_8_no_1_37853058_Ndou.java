
/**
 * A java rogram that will allow the user to guess a secret number.
 * The program has to allow the user to guess the secret number 
 * between 1-10 until the user guessed the correct number.
 *
 * @author (Thuso Ndou)
 * @version (19/05/2023)
 */
import java.util.*;
public class Praactical_8_no_1_37853058_Ndou
{
    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in); // Scanner object
    
        Random y = new Random(); // Random object
    
        int number = 1 + y.nextInt(10); // generate random number from 1to 10
        
        System.out.print("\f"); // clear the console
        
        int userAnswer; // declaring variable
    
        char continueOption = 'Y'; // declaring and assigning a variable
        
        do
        {
            System.out.println("Guess the number : "); // display the statement
    
            userAnswer = x.nextInt(); // prompt for user input
    
        if (userAnswer == number)
        {
             System.out.println("Correct"); // print statement for correct answer        }
        }
        if (userAnswer != number)
        {
             System.out.println("Incorrect! Try Again"); // print statement for wrong answe
        }
    
        System.out.println("Do you want to continue? Y/N");
        x.nextLine(); // Consume newline character
        String option = x.nextLine(); // getting user input as astring
        
          if(option.equalsIgnoreCase("Y"))
        {
            continueOption = 'Y';   // Assigning character Y to continue
        } else
        {
            continueOption = 'N'; // Assigning character N to continue
        }
        
        if (continueOption == 'Y' && userAnswer == number)
        {
            number = 1 + y.nextInt(10); // generate another random number
        }
        } while(continueOption == 'Y'); // test condition
    }
}
