
/**
 * A java program that prompt for name, surname and student number then displays the details.
 *
 * @author (Thuso Ndou)
 * @version (14/03/2023)
 */
import java.util.Scanner;
public class Practical_2_no_1_37853058_Ndou
{
    public static void main(String [] args)
    {
        System.out.println("Hallo ITSP114 student");
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter your student number");
        String studentNumber = input.nextLine();
        
        System.out.println("Please enter your name");
        String name = input.nextLine();
        
        System.out.println("Please enter your surname");
        String surname = input.nextLine();
        
        System.out.println("Your student number is: "+ studentNumber);
        System.out.println("Your name is: "+ name);
        System.out.println("Your surname is: "+ surname);
        
    }
}
