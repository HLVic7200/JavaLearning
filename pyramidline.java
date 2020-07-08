// MrDarkness's Road of Java Learning Project 2020 <ROJLP 2020>
// Doing programming with enjoyments
// Write y'all codes after this..
// Yo! Java hook me up with yr scanner..
import java.util.Scanner;
// Pyramid Line Generator
public class pyramidline {
    public static void main(String[] args) {
        //* Initial Scanner..
        Scanner in = new Scanner(System.in);
        // Create a looping process..
        boolean looper = true;
        while (looper) {
            // Ask For User Input
            System.out.println("Enter the number of lines (1 ~ 15) :");
            int rownum = in.nextInt();
            // if User Input is less than or equal to then run
            if (rownum <= 15) {
                // create spacing
                for (int spacer = 0; spacer < rownum; spacer++) {
                    for (int row = 0; row < rownum - spacer; row++) {
                        System.out.print(" ");
                    }
                    // create the number to form a pyramid
                    for (int column = 0; column <= spacer; column++) {
                        System.out.print(column + " ");
                    }
                    // line them up
                    System.out.println();
                }
                // stop loop process because we already executed the pyramid..
                looper = false;
                // if it is larger than 15? then im sorry repeat the process..
            } else
                System.out.println("Invalid Number");
        }
    }
}