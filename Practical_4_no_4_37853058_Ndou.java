
/**
 * A Java program to display student details..
 *
 * @author (Thuso Ndou)
 * @version (08/04/2023)
 */
public class Practical_4_no_4_37853058_Ndou
{
    public static void main(String[] args)
    {
        String studentNumber = "12345678";
        String name = "Tom";
        String surname = "Jefferson";
        String student_detail = studentNumber +" "+ name +" "+ surname;
        
        int detailsLength = student_detail.length();
        System.out.println(detailsLength);
        
        String lowerCaseDetails = student_detail.toLowerCase();
        System.out.println(lowerCaseDetails);
        
        char detailChar = student_detail.charAt(9);
        System.out.println(detailChar);
        
        String studentName = student_detail.substring(0, name.length());
        System.out.println(studentName);
        
        System.out.println(student_detail+".");
    }
}
