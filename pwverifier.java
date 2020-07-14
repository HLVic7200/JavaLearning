// MrDarkness's Road of Java Learning Project 2020 <ROJLP 2020>
// Doing programming with enjoyments
// Write y'all codes after this..
// Yo! Java hook me up with yr scanner..
import java.util.Scanner;
// Password Verifier
public class pwverifier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Rules >\nA password must have at least eight characters.");
        System.out.println("A password consists of only letters and digits.\nA password must contain at least two digits.");
        System.out.println("Enter your password > ");
        String password = input.nextLine();
        boolean dig = false;
        boolean let = false;
        int digit = 0;

        System.out.println("Checking password..");
        if (password.length() >= 8) {
            for (int i = 0; i < password.length(); i++) {
                if (Character.isDigit(password.charAt(i))) {
                    digit++;
                    if (digit >= 2) {
                        dig = true;
                    }
                }
                if (Character.isLetter(password.charAt(i))) {
                    let = true;
                }
            }
            if (dig == true) {
                if (let == true) {
                    System.out.println("Password Verified!");
                } else {
                    System.out.println("Password Failed");
                    System.out.println("Reason > Letter is required!");
                }
            } else {
                System.out.println("Password Failed");
                System.out.println("Reason > Minimum 2 digits is required!");
            }
        } else {
            System.out.println("Password length is " + password.length());
            System.out.println("Password Failed");
            System.out.println("Reason > Minimum length of the password is 8!");
        }
    }
}
