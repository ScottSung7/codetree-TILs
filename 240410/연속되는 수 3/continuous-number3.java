import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        
        int max = 0;
        int cnt = 0;
        Boolean checkBefore = null;
        Boolean checkNow = null;
        for(int i = 0; i < length; i++){
            int a = sc.nextInt();
            if(a < 0){
                checkNow = false;
            }else{
                checkNow = true;
            }

            if(checkBefore != null && checkNow == checkBefore){
                cnt++;
            }else{
                cnt = 1;
            }
            checkBefore = checkNow;
            if(cnt > max){
                max = cnt;
            }

        }
        System.out.println(max);



    }
}