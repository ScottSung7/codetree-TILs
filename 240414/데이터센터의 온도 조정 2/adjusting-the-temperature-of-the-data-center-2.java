import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt(); 
        int c = sc.nextInt(); //ta 보다 낮을 때
        int g = sc.nextInt(); // ta ~ tb
        int h = sc.nextInt(); // tb 보다 높으면 
        int maxTemp = 1000;
        int maxNum = 1000;
        // a, b 
        // 2차원 배열 
        int[] ta = new int[length];
        int[] tb = new int[length];
        for(int i = 0; i < length; i++){
            ta[i] = sc.nextInt();
            tb[i] = sc.nextInt();
        }
        //1~maxTemp 까지 각 머신별 
        // 현재 기준에서 각 온도별
        int maxEff = 0;
        for(int t = 0; t < maxTemp; t++){
            maxEff = Math.max(maxEff,totalEfficiencyOfCurrentTemp(length, ta, tb, c, g, h, t));
        }
        System.out.println(maxEff);
    }
    public static int oneMachineEfficiencyByTemp(int from, int to, int c, int g, int h, int t){
        if(t < from){
            return c;
        }else if(t > to){
            return h;
        }else{
            return g;
        }
    }

    public static int totalEfficiencyOfCurrentTemp(int length, int[] ta, int[] tb, int c, int g, int h, int t){
        int totalEfficiency = 0;
        for(int i = 0; i < length; i++){
            totalEfficiency += oneMachineEfficiencyByTemp(ta[i], tb[i], c, g, h, t);
        }
        return totalEfficiency;
    }
}