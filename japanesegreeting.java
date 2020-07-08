// MrDarkness's Road of Java Learning Project 2020 <ROJLP 2020>
// Doing programming with enjoyments
// Write y'all codes after this..
// Yo! Java hook me up with yr scanner..
import java.util.Scanner;
// Japanese Greeting Menu
public class japanesegreeting {
    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            Scanner ins = new Scanner(System.in);
            System.out.println("Select an Option >");
            System.out.println("1. Good Morning" + "\n" + "2. Good Afternoon" + "\n" + "3. Good Night");
            System.out.println("4. Good Bye" + "\n" + "5. Thank You" + "\n" + "Your Option >");

            int option = ins.nextInt();
            System.out.println("");
            switch (option) {
                case 1:
                    System.out.println("Ohayō");
                    break;
                case 2:
                    System.out.println("Konnichiwa");
                    break;
                case 3:
                    System.out.println("Oyasuminasai");
                    break;
                case 4:
                    System.out.println("Sayōnara");
                    break;
                case 5:
                    System.out.println("Arigatou");
                    break;
                default:
                    System.out.println("Invalid Option... Exiting now...");
                    run = false;
            }
            System.out.println("");
        }
    }
}