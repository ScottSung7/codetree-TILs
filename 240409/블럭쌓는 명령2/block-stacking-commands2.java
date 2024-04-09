import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int length = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = 0;
        }

        for(int i = 0; i < length; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            for(int j = a; j <= b; j++){
                
                arr[j-1]++;
            }
        }
        
        int max = Arrays.stream(arr).max().getAsInt();

        System.out.println(max);
        


    }
}