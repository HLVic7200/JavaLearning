// MrDarkness's Road of Java Learning Project 2020 <ROJLP 2020>
// Doing programming with enjoyments
// Write y'all codes after this..
// Yo! Java hook me up with yr scanner..
import java.util.Scanner;
// Ascending Order
public class ascendingorder {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        System.out.println("Enter Three Values > ");
        double value1 = userinput.nextDouble();
        double value2 = userinput.nextDouble();
        double value3 = userinput.nextDouble();
        double cache;

        if (value2 < value1 && value2 < value3) {
            cache = value1;
            value1 = value2;
            value2 = cache;
        } else if (value3 < value1 && value3 < value2) {
            cache = value1;
            value1 = value3;
            value3 = cache;
        } if (value3 < value2) {
            cache = value2;
            value2 = value3;
            value3 = cache;
        }
        System.out.println(value1 + " " + value2 + " " + value3);
    }
}
