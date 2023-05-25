
/**
 * A java program that read in the names, hours worked and code of a worker 
 * (M for Manager, W for Worker). If the code is M the person earns R50.00 
 * per hour. If the code is W, the person earns R30.00 per hour. Any other 
 * code is an error.
 *
 * @author (Thuso Ndou)
 * @version (05/05/2023)
 */
public class Practical_6_no_3_37853058_Ndou
{
   public static void main(String[] args)
   {
       String name = "Thuso";
       int hoursWorked = 140;
       char code = 'M';
       int salary;
       
       switch(code)
       {
           case 'M':
               salary = hoursWorked * 50;
               System.out.println("Salary Slip");
               System.out.println("Name: " + name);
               System.out.println("Hours Worked: " + hoursWorked);
               System.out.println("Code: " + code);
               System.out.println("Salary: " + salary);
               break;
           case 'W':
               salary = hoursWorked * 30;
               System.out.println("Salary Slip");
               System.out.println("Name: " + name);
               System.out.println("Hours Worked: " + hoursWorked);
               System.out.println("Code: " + code);
               System.out.println("Salary: " + salary);
               break;
           default:
               System.out.println("Error. Invalid code");
        }
    }
}
