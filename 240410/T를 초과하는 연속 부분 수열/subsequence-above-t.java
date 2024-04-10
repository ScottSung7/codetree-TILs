import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int target = sc.nextInt();
        
        int max = 0;
        int cnt = 0;
        int numBefore = -1;
        for(int i = 0; i < length; i++){
            int a = sc.nextInt();
            if(numBefore > 0 && a > target && a >= numBefore){
                cnt++;
            }else if(a > target){
                cnt = 1;
            }else{
                cnt = 0;
            }
            numBefore = a;
            if(cnt > max){
                max = cnt;
            }

        }
        System.out.println(max);



    }
}