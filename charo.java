// MrDarkness's Road of Java Learning Project 2020 <ROJLP 2020>
// Doing programming with enjoyments
// Write y'all codes after this..
// Yo! Java hook me up with yr scanner..
import java.util.Scanner;
public class charo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your String >");
        String value = input.nextLine();

        int cache = value.length();
        char cachedfirst = value.charAt(0);
        int cachedlastint = value.length() - 1;
        char cachedlast = value.charAt(cachedlastint);

        System.out.println("The Length is " + cache);
        System.out.println("The First Word is " + cachedfirst);
        System.out.println("The Last Word is " + cachedlast);

    }
}
