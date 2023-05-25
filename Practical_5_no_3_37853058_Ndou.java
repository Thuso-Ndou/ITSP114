
/**
 * A Java program that calculates the salary based on the code.
 *
 * @author (Thuso Ndou)
 * @version (13/04/2023)
 */
public class Practical_5_no_3_37853058_Ndou
{
    public static void main(String[] args)
    {
        String name = "Thuso Ndou";
        int hours_worked = 100;
        char code = 'M';
        int salary;
        
        if (code == 'M'){
            salary = hours_worked * 50;
            System.out.println("name: " + name);
            System.out.println("Hours worked: " + hours_worked);
            System.out.println("Work Code: " + code);
            System.out.println("Salary: " + salary);
        } else
        if (code == 'W'){
            salary = hours_worked * 30;
            System.out.println("name: " + name);
            System.out.println("Hours worked: " + hours_worked);
            System.out.println("Work Code: " + code);
            System.out.println("Salary: " + salary);
        } else{
            System.out.println("Error");
        }
    }
  
}
