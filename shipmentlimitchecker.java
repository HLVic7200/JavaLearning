// MrDarkness's Road of Java Learning Project 2020 <ROJLP 2020>
// Doing programming with enjoyments
// Write y'all codes after this..
// Yo! Java hook me up with yr scanner..
import java.util.Scanner;
// Shipment Limit Checker (50 or more = no, less than 50 = ship)
public class shipmentlimitchecker {
    public static void main(String[] arg) {
        System.out.println("Please Enter A Package Weight :");
        Scanner input = new Scanner(System.in);
        int userinput = input.nextInt();
        if(userinput >= 50) {
            System.out.println("Package cannot be shipped..");
        } else {
            System.out.println("Package will be shipped..");
        }
    }
}
