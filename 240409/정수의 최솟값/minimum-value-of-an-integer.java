import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        getMin(a,b,c);

    }
    private static void getMin(int a, int b, int c){
        int min = c;
        int[] arr = new int[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;

        for(int i =0; i < 3; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);



    }
}