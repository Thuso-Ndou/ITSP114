
/**
 * A java will prompt the user to enter their employee code
 * and a price of an item.
 *
 * @author (Thuso Ndou)
 * @version (37853058)
 */
// import class
import java.util.*;
public class TPNdou_37853058_Question_1
{
    public static void main(String[] args)
    {
        // clear console
        System.out.println("\f");
        
        // creating a scanner object
        Scanner x = new Scanner(System.in);
        
        // declare variables
        String employeCode;
        String capCode;
        char code;
        double price;
        double newPrice;
        double discount;
        
        // prompting the user for input
        System.out.println("Enter the employee code: ");
        employeCode = x.nextLine();
        
        System.out.println("Enter the price: ");
        price = x.nextDouble();
        
        // converting string to upper case
        capCode = employeCode.toUpperCase();
        
        // converting an string to char
        code = capCode.charAt(0);
        
        // set the locale to us for decimal formating
        Locale.setDefault(Locale.US);
        
        if (code == 'W')
        {
            System.out.println("\n");
            discount = price * 0.56;
            newPrice = price - discount;
            System.out.println("Orignal Price\t R" + String.format("%.2f",price));
            System.out.println("Discount\t R" + String.format("%.2f",discount));
            System.out.println("New Price\t R" + String.format("%.2f",newPrice));
        }
        else if (code == 'T')
        {
            System.out.println("\n");
            discount = price * 0.37;
            newPrice = price - discount;
            System.out.println("Orignal Price\t R" + String.format("%.2f",price));
            System.out.println("Discount\t R" + String.format("%.2f",discount));
            System.out.println("New Price\t R" + String.format("%.2f",newPrice));
        }
        else if (code == 'S')
        {
            System.out.println("\n");
            discount = price * 0.33;
            newPrice = price - discount;
            System.out.println("Orignal Price\t R" + String.format("%.2f",price));
            System.out.println("Discount\t R" + String.format("%.2f",discount));
            System.out.println("New Price\t R" + String.format("%.2f",newPrice));
        }
        else
        {
            System.out.println("No discount\n\n");
            discount = price * 0.00;
            newPrice = price - discount;
            System.out.println("Orignal Price\t R" + String.format("%.2f",price));
            System.out.println("Discount\t R" + String.format("%.2f",discount));
            System.out.println("New Price\t R" + String.format("%.2f",newPrice));
        }
    }
}
