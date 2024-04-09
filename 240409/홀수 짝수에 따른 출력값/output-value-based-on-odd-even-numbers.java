import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(calculate(n));
    }
    private static int calculate(int n){
        if(n <= 0){
            return 0;
        }
        if(n%2==0){
            return n + calculate(n-2);
        }else{
            return n + calculate(n-2);
        }
    }
}