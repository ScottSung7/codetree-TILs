import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();

        if(x2 < a1){
            System.out.println("nonoverlappint");
        }else if(a2 < x1){
            System.out.println("nonoverlappint");    
        }else if(y2 < b1){
            System.out.println("nonoverlappint");
        }else if(b2 < y1){
            System.out.println("nonoverlappint");
        }else{
            System.out.println("overlapping");
        }



    }
}