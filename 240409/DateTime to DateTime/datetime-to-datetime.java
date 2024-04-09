import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int day = 11;
        int hour = 11;
        int min = 11;
        int minPast = 0;
        while(true){
            if(c < 11 || b < 11 || a < 11){
                if((b <= 11) && (a <= 11)){
                    minPast = -1;
                    break;
                }
                
            }
            if(day == a && hour == b && min == c){
                break;
            }
            min++;
            minPast++;
            if(min == 60){
                hour++;
                min = 0;
            }
            if(hour == 24){
                day++;
                hour = 0;
            }
        }
        System.out.println(minPast);

    }
}