import java.util.Scanner;

public class SimpleNumber {
    static boolean checkConsecutiveAndEqual(String str){
        for(int i=0; i<str.length()-2; i++){
            char char1 = str.charAt(i);
            char char2 = str.charAt(i+1);
            char char3 = str.charAt(i+2);
            if(char1 == char2 && char2 == char3) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.next();
        if(checkConsecutiveAndEqual(str)){
            System.out.println("Awesome");
        }
        else{
            System.out.println("Good");
        }
    }
}
