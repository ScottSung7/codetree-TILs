import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = 2;
        if(a + 1 == b && b + 1 == c){
            result = 0;
        }
        int[] arr = new int[] {a, b, c};
        for(int i =0; i < 3; i++){
            int toCompare = arr[i]+1;
            for(int j = 0; j < 3; j++){
                if(toCompare == arr[j]){
                    result = 1;
                    break;
                }
            }
        }        
        System.out.println(result);


    }
}