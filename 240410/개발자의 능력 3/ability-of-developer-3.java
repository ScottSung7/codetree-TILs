import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 6;
        int k = 3;
        int[] arr = new int[n];
        int allSum = 0;
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            arr[i] = a;
            allSum += a;
        }

        int min = Integer.MAX_VALUE;
        for(int i = 0; i <= n-k; i++)
            for(int j = i+1; j <= n-(k-1); j++)
                for(int h = j+1; h < n; h++){
                    int sum1 = arr[i] + arr[j] + arr[h];
                    int sum2 = allSum - sum1;
                    int dif = Math.abs(sum1 - sum2);
                    min = Math.min(min, dif);
                }
            
        System.out.println(min);
    }
    
}