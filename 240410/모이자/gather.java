import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] home = new int[length+1];

        for(int i =1; i <= length; i++){
            home[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int total = 0;
        for(int i =1; i <= length; i++){
            int target = i;
            for(int j = 1; j<=length; j++){
                int times = Math.abs(j-i);
                total += (home[j] * times);
            
            }
            if(total < min){
                min = total;
            }
            total = 0;            
        }
        System.out.println(min);
    }
}