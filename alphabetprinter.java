// MrDarkness's Road of Java Learning Project 2020 <ROJLP 2020>
// Doing programming with enjoyments
// Write y'all codes after this..
// Yo! Java hook me up with yr scanner..
import java.util.Scanner;
// Alphabet Printer
public class alphabetprinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your String >");
        String value1 = input.nextLine();
        // i = 0, is value1 length longer than i ?, calculate i
        for (int i = 0; i < value1.length(); i++) {
            // extract chars from length numbers
            char cache = value1.charAt(i);
            System.out.println(cache);
        }
    }
}
