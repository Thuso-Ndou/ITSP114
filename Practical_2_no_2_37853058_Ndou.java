
/**
 * A java program that prompt for name, surname and student number then displays the details.
 *
 * @author (Thuso Ndou)
 * @version (114/03/2023)
 */
import javax.swing.JOptionPane;
public class Practical_2_no_2_37853058_Ndou
{
    public static void main(String [] args)
    {
        String student_number;
        String name;
        String surname;
        int studentNumber;
        
        JOptionPane.showMessageDialog(null,"Hallo ITSP114 student");
        
        student_number = JOptionPane.showInputDialog("Please enter your student number");
        studentNumber = Integer.parseInt(student_number);
        
        name = JOptionPane.showInputDialog("Please enter your name");
        
        surname = JOptionPane.showInputDialog("Please enter your surname");
        
        JOptionPane.showMessageDialog(null, "Your student number is: " +studentNumber);
        JOptionPane.showMessageDialog(null, "Your name is: " +name);
        JOptionPane.showMessageDialog(null, "Your surname is: "+surname);
    }
}
