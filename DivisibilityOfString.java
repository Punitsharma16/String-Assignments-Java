import java.util.Scanner;

public class DivisibilityOfString {
    static void divisibleByThirty(String str){
        int sum = 0;
        int lastChar = 0;
        for(int i=0; i<str.length(); i++){
            sum += str.charAt(i) - '0';

            if(i == str.length()-1){
                lastChar = str.charAt(i) - '0';
            }
        }
        if(sum % 3 == 0 && lastChar == 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.next();
        divisibleByThirty(str);
    }
}
