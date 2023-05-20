
/**
 * A java program that will ask the user to enter the name, surname,
 * and mark of a student until a name of “zzz” is received.
 *
 * @author (Thuso Ndou)
 * @version (20/05/2023)
 */
import java.util.*;
public class Praactical_8_no_2_37853058_Ndou
{
    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);  // scanner object
        
        System.out.println("\f");
        // Declarating variables
        String name;
        String surname;
        int mark;
        String receive = "";
        
        do 
        {
            // prompting user for the name
            System.out.println("Please enter your name : ");
            name = x.nextLine();
            
            // prompting user for surname
            System.out.println("Please enter your surname : ");
            surname = x.nextLine();
            
            // prompting user for test mark
            System.out.println("Please enter test mark : ");
            mark = x.nextInt();
            
            // prompt string to stop the program
            System.out.println("Enter zzz to stop the program");
            x.nextLine();  // consume newline string
            receive = x.nextLine(); // getting string value
            
            // test condition to stop the program
            if(receive == "zzz")
            {
                receive = "zzz";
            }
        }
        while(!receive.equals("zzz"));
    }
}
