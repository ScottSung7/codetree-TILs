import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfEachPositionSquared(n));
    }
    private static int sumOfEachPositionSquared(int n){
        if(n < 10){
            return (int)Math.pow(n, 2);
        }
        return sumOfEachPositionSquared(n/10) + (int)Math.pow(n%10, 2);

    }

}