import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int bigger = Math.max(a, b);
        int smaller = Math.min(a, b);
        
        int instBigger = Math.max(x,y);
        int instSmaller = Math.min(x,y);

        int distance = bigger - smaller;
        int instantDistance = Math.abs(bigger-instBigger) + Math.abs(smaller-instSmaller); 
        
        if(instantDistance < distance){
            System.out.println(instantDistance);
        }else{
            System.out.println(distance);
        }
    }
}