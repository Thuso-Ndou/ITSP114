
/**
 * A java program that Read in the name and balance of a client of business. 
 * If the balance is negative, print the names, balance and a message..
 *
 * @author (Thuso Ndou)
 * @version (05/05/2023)
 */
public class Practical_6_no_2_37853058_Ndou
{
  public static void main(String[] args)
  {
      String name = "Thuso";
      int balance = -30000;
      
      switch(Integer.compare(balance,0))
      {
          case -1 :
              System.out.println("Name: " + name);
              System.out.println("Balance: " + balance);
              System.out.println("The balance is negative");
              break;
          default:
              break;
        }
    }
}
