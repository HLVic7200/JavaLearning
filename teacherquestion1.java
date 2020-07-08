// MrDarkness's Road of Java Learning Project 2020 <ROJLP 2020>
// Doing programming with enjoyments
// Write y'all codes after this..
// Yo! Java hook me up with yr scanner..
import java.util.Scanner;
// Teacher's Question 1
public class teacherquestion1 {
    public static void main(String[] arg) {
        System.out.println("Please Enter Total Lines :");
        Scanner input = new Scanner(System.in);
        int userinput = input.nextInt();

        if(userinput > 90) {
            System.out.println("The line of code is complicated");
        } else if(userinput > 75) {
            System.out.println("The line of code is acceptable");
        } else if(userinput > 50) {
            System.out.println("The line of code is great");
        } else {
            System.out.println("The line of code is terrible");
        }
    }