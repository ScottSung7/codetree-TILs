import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
    private static int factorial(int num){
        if(num == 0){
            return 1;
        }
        return num * factorial(num-1);

    }
}