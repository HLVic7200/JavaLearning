// MrDarkness's Road of Java Learning Project 2020 <ROJLP 2020>
// Doing programming with enjoyments
// Write y'all codes after this..
// Yo! Java hook me up with yr scanner..
import java.util.Scanner;
// is Secondary String substring of Primary String ?
public class substringchecks {
    public static void main(String[] args) {
        Scanner inputo = new Scanner(System.in);
        System.out.println("Enter Your Primary String >");
        String ps = inputo.nextLine();
        System.out.println("Enter Your Secondary String >");
        String ss = inputo.nextLine();

        if (ps.contains(ss)) {
            System.out.println(ss + " is substring of " + ps);
        } else
            System.out.println(ss + " is not substring of " + ps);
    }
}
