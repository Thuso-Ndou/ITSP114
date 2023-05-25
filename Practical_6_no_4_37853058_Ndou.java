/**
 * A java program that you type a person's name and three marks. Display the 
 * person’s name, the three marks. Determine and and display the highest mark
 * 
 * @author (Thuso Ndou)
 * @version (05/05/2023)
 */
public class Practical_6_no_4_37853058_Ndou
{
    public static void main(String[] args)
    {
        
        String name = "Thuso";
        
        int mark1 = 50;
        
        int mark2 = 80 ;
        
        int mark3 = 70;
        
        int highestMark;
        
        switch (Math.max(Math.max(50, 80), 70))
        {
            case 50:
                highestMark = mark1;
                System.out.println("Name: " + name);
                System.out.println("Mark 1: " + mark1);
                System.out.println("Mark 2: " + mark2);
                System.out.println("Mark 3: " + mark3);
                System.out.println("Highest mark: " + highestMark);
                break;
            case 80:
                highestMark = mark2;
                System.out.println("Name: " + name);
                System.out.println("Mark 1: " + mark1);
                System.out.println("Mark 2: " + mark2);
                System.out.println("Mark 3: " + mark3);
                System.out.println("Highest mark: " + highestMark);
                break;
            case 70:
                highestMark = mark3;
                System.out.println("Name: " + name);
                System.out.println("Mark 1: " + mark1);
                System.out.println("Mark 2: " + mark2);
                System.out.println("Mark 3: " + mark3);
                System.out.println("Highest mark: " + highestMark);
                break;
            default:
                System.out.println("Error: Invalid mark");
                break;
        }
    }
}
