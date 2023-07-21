import java.util.Scanner;

public class OddCharacters {
    static void oddCharacter(String str){
        for(int i=0; i<str.length(); i++){
            if(i % 2 == 0){
                System.out.print(str.charAt(i)+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        oddCharacter(str);
    }
}
