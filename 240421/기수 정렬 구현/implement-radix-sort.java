import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        arr = radixSort(arr);

        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
    public static int[] radixSort(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=1; i < arr.length; i++){
            max = Math.max(arr[i-1], arr[i]);
        }
        for(int i = 1; (max/i)>0; i=i*10){
            arr = countSort(arr, arr.length, i);
        }
        return arr;
    }
    public static int[] countSort(int[] arr, int n, int digit){
        int[] temp = new int[n];
        int[] cnt = new int[10];

        for(int i =0; i < n; i++){
            cnt[(arr[i]/digit)%10]++;
        }
        for(int i=1; i<=9; i++){
            cnt[i] = cnt[i] + cnt[i-1];
        }
        for(int i=n-1; i>=0; i--){
            int cntValue = (arr[i]/digit) % 10;
            int newIdx = cnt[cntValue]-1;
            temp[newIdx] = arr[i];
            cnt[cntValue]--;
        }
        for(int i=0; i<n; i++){
            arr[i] = temp[i];
        }
        return arr;
    }
}