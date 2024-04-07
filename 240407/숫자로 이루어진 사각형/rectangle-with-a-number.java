import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();        
        square(size);
    }
    private static void square(int n){
        int num = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                num++;
                if(num == 10){
                    num = 1;
                }
                System.out.print(num +" ");
            }
            System.out.println();
        }
    }

}