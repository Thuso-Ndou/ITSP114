
/**
 * A java program that you type a number and determine if 
 * it is positive or negative.
 * @author (Thuso Ndou)
 * @version (05/05/2023)
 */

import java.util.*;
public class Practical_6_no_1_37853058_Ndou
{
   public static void main(String[] args)
   {
       Scanner input = new Scanner(System.in);
       
       int number;
       
       System.out.println("Enter a number");
       
       number = input.nextInt();
       
       switch(Integer.compare(number, 0))
       {
           case 1 : 
               System.out.println("positive");
               break;
           case -1 : 
               System.out.println("negative");
               break;
           default :
               System.out.println("The number is zero");
               break;
        }
    }
}
