// MrDarkness's Road of Java Learning Project 2020 <ROJLP 2020>
// Doing programming with enjoyments
// Write y'all codes after this..
// Yo! Java hook me up with yr scanner..
import java.util.Scanner;
// Feet to Meter Converter
public class feettometer {
    public static void main(String[] arg) {
        System.out.println("Welcome To Feet To Meter Converter");
        System.out.println("Please Enter Your Desire Feet : ");
        Scanner scanner = new Scanner(System.in);
        double feet = scanner.nextDouble();
        System.out.println("Meter = " + (feet * 0.305));
    }
}