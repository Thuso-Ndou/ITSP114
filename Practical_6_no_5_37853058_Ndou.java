
/**
 * A java program that you enter three names (not in alphabetical order). 
 * Display the names in alphabetical order
 * 
 * @author (Thuso Ndou)
 * @version (05/05/2023)
 */
import java.util.*;
public class Practical_6_no_5_37853058_Ndou
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        String first;
        String second;
        String third;
        
        String name1;
        System.out.println("Enter first name");
        name1 = input.nextLine();
        
        String name2;
        System.out.println("Enter second name");
        name2 = input.nextLine();
        
        String name3;
        System.out.println("Enter third name");
        name3 = input.nextLine();
        
        switch (name1.compareToIgnoreCase(name2) < 0 ? name1.compareToIgnoreCase(name3) < 0 ? 1 : 3 : name2.compareToIgnoreCase(name3) < 0 ? 2 : 3) {
            case 1:
                first = name1;
                second = name2.compareToIgnoreCase(name3) < 0 ? name2 : name3;
                third = second.equals(name2) ? name3 : name2;
                System.out.println("The names in alphabetical order:");
                System.out.println(first);
                System.out.println(second);
                System.out.println(third);
                break;
            case 2:
                first = name2;
                second = name1.compareToIgnoreCase(name3) < 0 ? name1 : name3;
                third = second.equals(name1) ? name3 : name1;
                System.out.println("The names in alphabetical order:");
                System.out.println(first);
                System.out.println(second);
                System.out.println(third);
                break;
            case 3:
                first = name3;
                second = name1.compareToIgnoreCase(name2) < 0 ? name1 : name2;
                third = second.equals(name1) ? name2 : name1;
                System.out.println("The names in alphabetical order:");
                System.out.println(first);
                System.out.println(second);
                System.out.println(third);
                break;
            default:
                System.out.println("Error: Invalid name");
                break;
            }
        
    }
}
