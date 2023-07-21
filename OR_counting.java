import java.util.Scanner;

public class OR_counting {
    static int checkPossibleWays(String a, String b) {

        int temp = 1;
        for (int i = 0; i < a.length(); i++) {
            int A = a.charAt(i) - '0';
            int B = b.charAt(i) - '0';

            if (A == 1) {
                if (B == 1) {
                    temp *= 2;
                } else {
                    temp *= 0;
                }
            } else {
                if (B == 1) {
                    temp *= 1;
                } else {
                    temp *= 1;
                }
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int res = checkPossibleWays(a, b);
        System.out.println(res);
    }
}
