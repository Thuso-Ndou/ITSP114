
/**
 * A java program where you input three names and it displays them alphabetical.
 *
 * @author (Thuso Ndou)
 * @version (13/04/2023)
 */
import java.util.Scanner;

public class Practical_5_no_5_37853058_Ndou
{
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       
       System.out.print("Please enter first name: ");
       String name1 = input.nextLine();
       
       System.out.print("Please enter second name: ");
       String name2 = input.nextLine();
       
       System.out.print("Please enter third name: ");
       String name3 = input.nextLine();
       
       if (name1.compareTo(name2) > 0 && name2.compareTo(name3) > 0 ){
           System.out.println("Names in alphabetical order:");
           System.out.println(name3);
           System.out.println(name2);
           System.out.println(name1);
       } else
       if (name1.compareTo(name2) > 0 && name3.compareTo(name1) > 0 ){
           System.out.println("Names in alphabetical order:");
           System.out.println(name2);
           System.out.println(name1);
           System.out.println(name3);
       } else
       if (name2.compareTo(name1) > 0 && name3.compareTo(name2) > 0 ){
           System.out.println("Names in alphabetical order:");
           System.out.println(name1);
           System.out.println(name2);
           System.out.println(name3);
       } else
       if (name2.compareTo(name1) > 0 && name1.compareTo(name3) > 0 ){
           System.out.println("Names in alphabetical order:");
           System.out.println(name1);
           System.out.println(name3);
           System.out.println(name2);
       } else
       if (name3.compareTo(name2) > 0 && name1.compareTo(name3) > 0 ){
           System.out.println("Names in alphabetical order:");
           System.out.println(name2);
           System.out.println(name3);
           System.out.println(name1);
       } else{
           System.out.println("Names in alphabetical order:");
           System.out.println(name3);
           System.out.println(name1);
           System.out.println(name2);
       }
   }
}
