// MrDarkness's Road of Java Learning Project 2020 <ROJLP 2020>
// Doing programming with enjoyments
// Write y'all codes after this..
// Yo! Java hook me up with yr scanner..
import java.util.Scanner;
// Simple Multiplication Table
public class simplemultiplicationtable {
    public static void main(String[] args) {
        //* Initial Scanner..
        Scanner userinput = new Scanner(System.in);
        // Safety Checks
        int startvalue = 0;
        int endvalue = 0;
        // Gimme y'all inputs
        System.out.println("Input Your Starting Value >");
        startvalue = userinput.nextInt();
        System.out.println("Input Your Ending Value >");
        endvalue = userinput.nextInt();

        // Lets Start The Loop
        for (int x = startvalue; x <= endvalue; x++) {
            for (int y = startvalue; y <= endvalue; y++) {
                System.out.print(" " + x * y);
            }
            System.out.println("");
        }
        System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
        }
        catch(Exception e)
        {}
    }
}
