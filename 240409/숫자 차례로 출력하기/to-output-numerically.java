import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNASC(n);
        System.out.println();
        printNDESC(n);

    }
    private static void printNASC(int n){
        //시작을 해야하는 부분.
        if(n == 0){
            return;
        }
        printNASC(n-1);
        System.out.print(n + " ");
    }
    private static void printNDESC(int n){
        //끝을 내야하는 부분
        if(n==0){
            return;
        }
        System.out.print(n + " ");
        printNDESC(n-1);
    }
}