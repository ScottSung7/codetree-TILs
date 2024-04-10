import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        int min = Integer.MIN_VALUE;
        int total = 0;
        for(int i = 0; i <= n - k; i++){
            for(int j = i; j < i + k; j++){
                total += arr[j];
            }
            min = Math.max(min, total);
            total = 0;
        }

        System.out.println(min);
        

    }
}