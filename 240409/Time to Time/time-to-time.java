import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int timeElapsed = 0;
        int hour = a;
        int min = b;
        while(true){
            timeElapsed++;
            min++;
            
            if(min == 60){
                hour++;
                min = 0;
            }

            if(hour == c && min==d){
                break;
            }
        }
        System.out.println(timeElapsed);
    }
}