import java.util.Scanner;

public class cleanTheRoom {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.next();
        }
        int ans = 0;

        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=0;j<n;j++){
                if(arr[i].equals(arr[j])){
                    count++;
                }
            }
            ans = Math.max(ans,count);
        }
        System.out.println(ans);
    }
}
