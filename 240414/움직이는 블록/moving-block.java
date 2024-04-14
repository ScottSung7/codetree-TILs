import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        int total = 0;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        int average = total/n;
        int dif = 0;
        for(int i =0; i < n; i++){
            dif += Math.abs(average - arr[i]);
        }

        System.out.println(dif/2);




    }
}