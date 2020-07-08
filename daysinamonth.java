// MrDarkness's Road of Java Learning Project 2020 <ROJLP 2020>
// Doing programming with enjoyments
// Write y'all codes after this..
// Yo! Java hook me up with yr scanner..
import java.util.Scanner;
// Days in a month with years
public class daysinamonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Desire Month > ");
        int month = input.nextInt();
        System.out.println("Enter Your Desire Year > ");
        int year = input.nextInt();
        System.out.println("Month = " + month);
        System.out.println("Year = " + year);
        String Mon = null;
        int days = 31;

        switch(month) {
            case 1:
                Mon = "January";
                break;
            case 2:
                Mon = "February";
                if ((year%4 == 0 && year%100 != 0) || year%400 == 0) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            case 3:
                Mon = "March";
                break;
            case 4:
                Mon = "April";
                days = 30;
                break;
            case 5:
                Mon = "May";
                break;
            case 6:
                Mon = "June";
                days = 30;
                break;
            case 7:
                Mon = "July";
                break;
            case 8:
                Mon = "August";
                break;
            case 9:
                Mon = "September";
                days = 30;
                break;
            case 10:
                Mon = "October";
                break;
            case 11:
                Mon = "November";
                days = 30;
                break;
            case 12:
                Mon = "December";
                break;
            default:
                System.out.println("Invalid");
        }
        System.out.println(Mon + " " + year + " has " + days + " days");
    }
}