// MrDarkness's Road of Java Learning Project 2020 <ROJLP 2020>
// Doing programming with enjoyments
// Write y'all codes after this..
// Yo! Java hook me up with yr scanner..
import java.util.Scanner;
// Alphabet Counter
import java.util.Scanner;
public class alphacount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your String > ");
        String value = in.nextLine();
        System.out.println("Letters > " + count(value));
    }
    public static int count (String value) {
        int count = 0;
        for (int i = 0; i < value.length(); i++) {
            count++;
        }
        return count; }
}