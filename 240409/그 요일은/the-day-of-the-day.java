import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numOfDays = new int[]{0,31,29,31,30,31,30,31,31,30,31,30,31};
        String[] week = new String[]{"", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String targetDay = sc.next();
        int weekCount = 1;
        int daysCount = 0;
        int count = 0;
        boolean direction = getDirection(m1, d1, m2, d2);
        while(true){
            if(week[weekCount].equals(targetDay)){
                count++;
            }
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
        System.out.println(count);   
    }
    private static boolean getDirection(int m1, int d1, int m2, int d2){
         if(m2<m1 || (m1 == m2 && d2 < d1)){
            return true;
         }else{
            return false;
         }

    }
}