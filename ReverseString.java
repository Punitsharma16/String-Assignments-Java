import java.util.Scanner;

public class ReverseString {
    static void revString(String str){
        for(int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i)+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.next();
        revString(str);
    }
}
