// MrDarkness's Road of Java Learning Project 2020 <ROJLP 2020>
// Doing programming with enjoyments
// Write y'all codes after this..
// Yo! Java hook me up with yr scanner..
import java.util.Scanner;
// String Reverser
public class stringreverser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your String >");
        String value1 = input.nextLine();
        // i = value1 length, is i longer than 0 ?, calculate i in reverse
        for (int i = value1.length() - 1 ; i >= 0 ; i--) {
            // extract chars from length numbers
            char cache = value1.charAt(i);
            System.out.print(cache);
        }
    }
}

