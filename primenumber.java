// MrDarkness's Road of Java Learning Project 2020 <ROJLP 2020>
// Doing programming with enjoyments
// Write y'all codes after this..
// Prime Number With two public statics
public class primenumber {
    public static void main(String[] args) {
        String prime = "";
        System.out.println("Prime numbers from 1 to 50 are : ");
        System.out.println(prime(prime));
    }
    public static String prime(String prime) {
        int i = 0;
        int num = 0;

        for (i = 1; i <= 50; i++) {
            int count = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    count = count + 1;
                }
            }
            if (count == 2) {
                System.out.println("(" + i + ")");
            }
        }
        return prime;
    }
}
