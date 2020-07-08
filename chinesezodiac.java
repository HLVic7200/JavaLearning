// MrDarkness's Road of Java Learning Project 2020 <ROJLP 2020>
// Doing programming with enjoyments
// Write y'all codes after this..
// Yo! Java hook me up with yr scanner..
import java.util.Scanner;
// Chinese Zodiac Calculation
public class chinesezodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Desire Year > ");
        int year = input.nextInt();

        switch (year % 12) {
            case 0:
                System.out.println(year + " = Monkey");
                break;
            case 1:
                System.out.println(year + " = Rooster");
                break;
            case 2:
                System.out.println(year + " = Dog");
                break;
            case 3:
                System.out.println(year + " = Pig");
                break;
            case 4:
                System.out.println(year + " = Rat");
                break;
            case 5:
                System.out.println(year + " = Ox");
                break;
            case 6:
                System.out.println(year + " = Tiger");
                break;
            case 7:
                System.out.println(year + " = Rabbit");
                break;
            case 8:
                System.out.println(year + " = Dragon");
                break;
            case 9:
                System.out.println(year + " = Snake");
                break;
            case 10:
                System.out.println(year + " = Horse");
                break;
            case 11:
                System.out.println(year + " = Sheep");
                break;
        }
    }
}
