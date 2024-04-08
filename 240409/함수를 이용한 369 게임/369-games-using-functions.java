import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(doGame(a, b));
    }
    private static int doGame(int a, int b){
        int total = 0;
        for(int i =a; i <= b; i++){
            if(contain369(i)){
                total++;
            }else if(i%3==0){
                total++;
            }
        }
        return total;
    }
    private static boolean contain369(int num){
        String strNum = String.valueOf(num);
        for(int i=0; i< strNum.length(); i++){
            int checkingNum = Character.getNumericValue(strNum.charAt(i));
            if(checkingNum == 3){
                return true;
            }else if(checkingNum == 6){
                return true;
            }else if(checkingNum == 9){
                return true;
            }
        }
        return false;
    }
}