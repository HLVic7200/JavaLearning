// MrDarkness's Road of Java Learning Project 2020 <ROJLP 2020>
// Doing programming with enjoyments
// Write y'all codes after this..
// Plate Number
public class platenumber {
    public static void main(String[] args) {
        char bet1 = (char)(Math.random() * 26 + 'A');
        char bet2 = (char)(Math.random() * 26 + 'A');
        char bet3 = (char)(Math.random() * 26 + 'A');
        int num1 = (int)(Math.random() * 9);
        int num2 = (int)(Math.random() * 9);
        int num3 = (int)(Math.random() * 9);
        int num4 = (int)(Math.random() * 9);
        System.out.println(bet1 + "" + bet2 + "" + bet3 + "" + num1 + "" + num2 + "" + num3 + "" + num4);

    }
}
