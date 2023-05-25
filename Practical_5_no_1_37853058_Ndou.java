
/**
 * A java program that determines if a number is negative or positive.
 *
 * @author (Thuso Ndou)
 * @version (13/04/2023)
 */
import java.util.Scanner;

public class Practical_5_no_1_37853058_Ndou
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter a number: ");
        int number = input.nextInt();
        
        if (number >= 0 )
        {
            System.out.println("Positive");
        } else
        if (number < 0){
            System.out.println("Negative");
        }
    }
}
