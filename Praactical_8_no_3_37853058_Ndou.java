/**
 * A java program that will ask the user which times table they would like to practice.
 * And displays the times table. 
 *
 * @author (Thuso Ndou)
 * @version (20/05/2023)
 */
import java.util.*;
public class Praactical_8_no_3_37853058_Ndou
{
    public static void main(String[] args)
    {
        // clear console
        System.out.println("\f");
        
        // scanner object
        Scanner x = new Scanner(System.in); 
        
        // table value input
        System.out.print("Which times table would you like to practice? ");
        int table = x.nextInt();
        
        // Declaring variables
        int score = 0;
        int questions = 10;

        for (int i = 1; i <= questions; i++) {
            // generate a random number then multiply by table value
            int randomNumber = (int) (Math.random() * 10) + 1;
            int correctAnswer = table * randomNumber;
            
            // user input for answer
            System.out.print(table + " x " + randomNumber + " = ? ");
            int answer = x.nextInt();
            
            // display for right and wrong answer
            if (answer == correctAnswer) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect, the answer is " + correctAnswer + ".");
            }
        }
        // displays the final results
        System.out.println("Your score was " + score + "/" + questions + ".");
    
    }
}
