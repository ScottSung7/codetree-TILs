import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int from = sc.nextInt();
        int to = sc.nextInt();
        int total = 0;
        for(int i = from; i <= to; i++){
            if(isPrime(i)){
                total += i;
            }
        }
        System.out.println(total);
    }
    private static boolean isPrime(int n){
        for(int i = 2; i < n; i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}