import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(magicNum(a));        
    }
    private static String magicNum(int a){
        String str = String.valueOf(a);
        int c = Character.getNumericValue(str.charAt(0));
        int d = Character.getNumericValue(str.charAt(1));
        int num = c+d;

        if(a%2==0 && num%5==0){
            return "Yes";
        }else{
            return "No";
        }
    }
}