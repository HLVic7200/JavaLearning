// MrDarkness's Road of Java Learning Project 2020 <ROJLP 2020>
// Doing programming with enjoyments
// Write y'all codes after this..
// Yo! Java hook me up with yr scanner..
import java.util.Scanner;
// Min with two public statics
public class min {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter #1 Number > ");
        double n1 = in.nextDouble();
        System.out.println("Enter #2 Number > ");
        double n2 = in.nextDouble();
        System.out.println("Enter #3 Number > ");
        double n3 = in.nextDouble();
        System.out.print("The Min of 3 Number = " + min(n1, n2, n3));
    }

    public static double min(double n1, double n2, double n3) {
        return Math.min(Math.min(n1,n2),n3);
    }
}
