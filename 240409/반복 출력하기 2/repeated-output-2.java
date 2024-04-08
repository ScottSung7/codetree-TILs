import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        hello(length);        
    }
    private static void hello(int num){
        if(num == 0){
            return;
        }
        hello(num - 1);

        System.out.println("HelloWorld");
    }

}