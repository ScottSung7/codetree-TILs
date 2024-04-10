import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int target = sc.nextInt();
        
        int max = 0;
        int cnt = 0;
        for(int i = 0; i < length; i++){
            int a = sc.nextInt();
            if(a > target){
                cnt++;
            }else{
                cnt = 0;
            }
            if(cnt > max){
                max = cnt;
            }

        }
        System.out.println(max);



    }
}