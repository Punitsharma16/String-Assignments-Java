import java.util.Scanner;

public class LuckyNum {
    static void luckyNum(String str, int n){
        long sum1 = 0;
        long sum2 = 0;
        for(int i=0; i<n; i++){
            sum1 += str.charAt(i) - '0';
        }
        for(int i=n; i<str.length(); i++){
            sum2 += str.charAt(i) - '0';
        }
        if(sum1 == sum2){
            System.out.println("LUCKY");
        }
        else{
            System.out.println("UNLUCKY");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Half value of string");
        int n = sc.nextInt();
        System.out.println("Enter the String");
        String str = sc.next();
        luckyNum(str,n);
    }
}
