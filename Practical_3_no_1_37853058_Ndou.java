
/**
 * A java program that calculates the rental price based on the number of days rent out.
 *
 * @author (Thuso Ndou)
 * @version (23/03/2023)
 */
import javax.swing.JOptionPane;
public class Practical_3_no_1_37853058_Ndou
{
    public static void main(String[] args)
    {
    double rental_costInc;
    int rental_costExc;
    String name;
    String s_carPrice;
    int car_price;
    String s_days;
    int days;
    double vat = 0.15;
    
    name = JOptionPane.showInputDialog("Please enter your name");
    
    s_carPrice = JOptionPane.showInputDialog("Please enter car price");
    car_price = Integer.parseInt(s_carPrice);
    
    s_days = JOptionPane.showInputDialog("Please enter the number of days for car rental");
    days = Integer.parseInt(s_days);
    
    rental_costExc = car_price * days;
    
    rental_costInc = (rental_costExc + (rental_costExc * vat));
    
    System.out.println("Client Bill");
    System.out.println("Name: " + name);
    System.out.println("Car Price: R" + car_price);
    System.out.println("Number of days: " + days);
    System.out.println("Rental Cost excluding vat: R" + rental_costExc);
    System.out.println("Vat: " + vat);
    System.out.println("Rental Cost including vat: R" + rental_costInc);
    
    
    }
}
