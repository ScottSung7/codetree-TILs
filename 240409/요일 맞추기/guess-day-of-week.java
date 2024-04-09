import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numOfDays = new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};
        String[] week = new String[]{"", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        int weekCount = 2;
        int daysCount = 0;
        boolean direction = getDirection(m1, d1, m2, d2);
        while(true){

            //
            if(direction){
                if(m1 == m2 && d1==d2){
                    break;
                }
                if(d1 == 0){
                    m1--;
                    d1 = numOfDays[m1]; 
                }
                d1--;
                weekCount--;
                if(weekCount == 0){
                    weekCount = 7;
                }
            }else{
                if(m1 == m2 && d1==d2){
                    break;
                }
                d1++;
                weekCount++;
                if(d1 > numOfDays[m1]){
                    m1++;
                    d1 = 1;
                }
                if(weekCount > 7){
                    weekCount = 1;
                }
            }
        }    
        System.out.println(week[weekCount]);   
    }
    private static boolean getDirection(int m1, int d1, int m2, int d2){
         if(m2<m1 || (m1 == m2 && d2 < d1)){
            return true;
         }else{
            return false;
         }

    }
}