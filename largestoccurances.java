// MrDarkness's Road of Java Learning Project 2020 <ROJLP 2020>
// Doing programming with enjoyments
// Write y'all codes after this..
// Yo! Java hook me up with yr scanner..
import java.util.Scanner;
// Largest Number & Most Occurance
public class largestoccurances {
    public static void main(String[] args) {
        int num = -1;
        int high = 0;
        int count = 0;

        Scanner userinput = new Scanner(System.in);
        System.out.println("Enter numbers > ");
        while (num != 0) {
            num = userinput.nextInt();
            if (num > high) {
                high = num;
                count = 1;
            } else if (num == high) {
                count++;
            }
        }
        System.out.println("The largest number is > " + high);
        System.out.println("The occurrence count of the largest number is > " + count);
    }
}