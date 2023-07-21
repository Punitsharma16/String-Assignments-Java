import java.util.*;
public class MakeTiny {
    static boolean lexicographically(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        str1 = new String(arr1);
        str2 = new String(arr2);
        char firstCharStr1 = str1.charAt(0);
        char lastCharStr2 = str2.charAt(str2.length() - 1);
        if (firstCharStr1 < lastCharStr2) {
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the str1");
        String str1 = sc.next();
        System.out.println("Enter the str2");
        String str2 = sc.next();
        if(lexicographically(str1,str2)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
