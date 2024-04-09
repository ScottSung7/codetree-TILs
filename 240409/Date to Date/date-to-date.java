import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int mth = a;
        int day = b;
        int daysPast = 1;
        while(true){
            
            day++;
            daysPast++;
            if(day==days[mth]){
                mth++;
                day=0;
            }
            if(mth == c && day == d){
                break;
            }
        }
        System.out.println(daysPast);

    }
}