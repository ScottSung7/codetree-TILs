import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();      
        sumAndDivide10(num);  
    }
    private static void sumAndDivide10(int a){
        int sum = 0;
        for(int i = 1; i <= a; i++){
            sum += i;
        }
        System.out.println(sum/10);

    }
}