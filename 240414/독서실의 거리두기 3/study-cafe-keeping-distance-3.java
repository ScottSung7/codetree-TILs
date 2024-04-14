import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 여기에 코드를 작성해주세요.
        // 가장 가까운 곳이 최대. (가장 가까이 있어도 최대한 멀리 있게)
        int length = sc.nextInt();
        int[] code = sc.next().chars().mapToObj(Character::getNumericValue)
                            .mapToInt(Integer::intValue).toArray();
        
        int maxCnt = 0;
        int maxFrom = 0;
        int maxTo = 0;
        int cnt = 0;
        for(int i = 0; i < length; i++){
            if(code[i] == 0){
                cnt++;
            }else if(code[i] == 1){
                if(cnt > maxCnt){
                    maxFrom = i - cnt;
                    maxTo = i;
                }
                maxCnt = Math.max(maxCnt, cnt);
                cnt = 0;
            }
        }
        
        code[(maxFrom + maxTo)/2] = 1;

        int minCnt = Integer.MAX_VALUE;
        cnt = length;
        for(int i = 0; i < length;i++){
            if(code[i] == 0){
                cnt++;
            }else if(code[i] == 1){
                minCnt = Math.min(minCnt, cnt);
                cnt = 0;
            }
        }
        System.out.println(minCnt+1);
    }
}