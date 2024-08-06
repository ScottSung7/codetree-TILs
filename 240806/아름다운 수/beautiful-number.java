import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static int n;
    public static int ans;
    public static ArrayList<Integer> seq = new ArrayList<>();
    
    public static boolean isBeautiful() {
        for(int i = 0; i < n; i += seq.get(i)) { //seq.get(i) 만큼 반복 되어야 함.
            if(i + seq.get(i) - 1 >= n) //seq.get(i) 보다 많아지면 어차피 필요하지 않음.
                return false;
            for(int j = i; j < i + seq.get(i); j++)
                if(seq.get(j) != seq.get(i)) //현재 위치에서 앞에 중복되는게 없는지 확인.
                    return false;
        }
        return true;
    }
    
    public static void countBeautifulSeq(int cnt) {
        if(cnt == n) {
            if(isBeautiful())
                ans++;
            return;
        }
        
        for(int i = 1; i <= 4; i++) {
            seq.add(i);
            countBeautifulSeq(cnt + 1);
            seq.remove(seq.size() - 1);
        }
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        countBeautifulSeq(0);
        
        System.out.print(ans);
    }
}