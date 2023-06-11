
/**
 * A Java program that takes input from the user to process sneaker orders 
 * and calculate the total amount.
 *
 * @author (Thuso Ndou)
 * @version (37853058)
 */
// import classes
import javax.swing.JOptionPane;
public class ITSP114_TPNdou_37853058_Question
{
    public static void main(String[] args)
    {
        // clear console
        System.out.println("\f");
        
        // declaring varaibles
        String name;
        String surname;
        String sOrder;
        String nameCap;
        String surnameCap;
        char initial;
        char stSurnameLetter;
        char order;
        int size;
        String sSize;
        int quantity;
        String sQuantity;
        int nameLength;
        int surNameLength;
        String subSurname;
        String subName;
        String nameSurname;
        int price;
        float amount;
        float totalAmount = 0;
        
        // prompting the user for input
        name = JOptionPane.showInputDialog("Name:");
        surname = JOptionPane.showInputDialog("Surname:");
        sOrder = JOptionPane.showInputDialog("Would you like to order sneakers?(Y/N):");
        
        // conc
        nameSurname = name+ surname;
        
        // determining name and surname length
        nameLength = name.length() + 1;
        surNameLength = nameSurname.length();
        
        // substring
        subName = nameSurname.substring(nameLength,surNameLength);
        
        // converting a string to a character
        order = sOrder.charAt(0);
        
        // converting to upperCase
        nameCap = name.toUpperCase();
        surnameCap = surname.toUpperCase();
        
        // converting a string to a character
        initial = nameCap.charAt(0);
        stSurnameLetter = surnameCap.charAt(0);
        
        // display headings
        System.out.println("Order Slip");
        System.out.println("___________________________________________________");
        System.out.println("\nCustomer: "+ initial + "." + stSurnameLetter + subName +"\n");
        System.out.printf("\n%2s%16s%20s","Size","Quantity","Price");
        System.out.println("\n___________________________________________________");
        
        while(!(Character.toUpperCase(order) == 'N'))
        {
            // prompting the user for input
            sSize = JOptionPane.showInputDialog("Size(5-11):");
            sQuantity = JOptionPane.showInputDialog("Number of Sneakers");
            
            // converting strings to integers
            size = Integer.parseInt(sSize);
            quantity = Integer.parseInt(sQuantity);
            
            // determining the price based on shore size
            switch(size)
            {
                case 5:
                    price = 120;
                    amount = price * quantity;
                    totalAmount += amount;
                    System.out.printf("\n%1s%12s%23s%7.2f",size,quantity,"R",amount);
                    break;
                case 6:
                    price = 125;
                    amount = price * quantity;
                    totalAmount += amount;
                    System.out.printf("\n%1s%12s%23s%7.2f",size,quantity,"R",amount);
                    break;
                case 7:
                    price = 130;
                    amount = price * quantity;
                    totalAmount += amount;
                    System.out.printf("\n%1s%12s%23s%7.2f",size,quantity,"R",amount);
                    break;
                case 8:
                    price = 135;
                    amount = price * quantity;
                    totalAmount += amount;
                    System.out.printf("\n%1s%12s%23s%7.2f",size,quantity,"R",amount);
                    break;
                case 9:
                    price = 140;
                    amount = price * quantity;
                    totalAmount += amount;
                    System.out.printf("\n%1s%12s%23s%7.2f",size,quantity,"R",amount);
                    break;
                case 10:
                    price = 145;
                    amount = price * quantity;
                    totalAmount += amount;
                    System.out.printf("\n%1s%12s%23s%7.2f",size,quantity,"R",amount);
                    break;
                case 11:
                    price = 150;
                    amount = price * quantity;
                    totalAmount += amount;
                    System.out.printf("\n%1s%12s%23s%7.2f",size,quantity,"R",amount);
                    break;
            }
            
            // ask the user if they would like to order more
            sOrder = JOptionPane.showInputDialog("Would you like to order sneakers?(Y/N):");
            
            // converting a string to a character
            order = sOrder.charAt(0);
            
            // assigning character "Y" to continue ordering
            if(Character.toUpperCase(order) == 'Y')
            {
                order = 'Y';
            }
            // assigning character "N" to stop the program
            if(Character.toUpperCase(order) == 'N')
            {
                order = 'N';
            }
        }
        System.out.println("\n___________________________________________________");
        System.out.println("Total Amount: R " + totalAmount);
    }
}
