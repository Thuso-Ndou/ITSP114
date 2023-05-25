
/**
 * A Java program to prompt in three marks then prints them from highest to smallest .
 *
 * @author (Thuso Ndou)
 * @version (13/04/2023)
 */
import java.util.Scanner;
public class Practical_5_no_4_37853058_Ndou
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int highest;
        
        System.out.print("Please enter name: ");
        String name = input.nextLine();
        
        System.out.print("Please enter mark 1: ");
        int mark1 = input.nextInt();
        
        System.out.print("Please enter mark 2: ");
        int mark2 = input.nextInt();
        
        System.out.print("Please enter mark 3: ");
        int mark3 = input.nextInt();
        
        System.out.println("Name: " + name);
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Mark 3: " + mark3);
        
        if (mark1 > mark2 && mark1 > mark3){
            highest = mark1;
            System.out.println("Highest mark: " + highest);
        } else
        if (mark2 > mark1 && mark2 > mark3){
            highest = mark2;
            System.out.println("Highest mark: " + highest);
        } else
        if (mark3 > mark1 && mark3 > mark2){
            highest = mark3;
            System.out.println("Highest mark: " + highest);
        }
    }
}
