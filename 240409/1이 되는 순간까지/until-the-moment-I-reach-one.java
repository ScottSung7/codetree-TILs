import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumConditional(n));
    }
    private static int sumConditional(int n){
        if(n == 1){
            return 0;
        }
        if(n%2 == 0){
            return sumConditional(n/2) + 1;
        }else{
            return sumConditional(n/3) + 1;
        }

    }
}