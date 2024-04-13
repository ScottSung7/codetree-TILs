import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int max = 0;
        for(int i = a; i <= b; i++){
            String num = String.valueOf(i);
            char[] numChar = num.toCharArray();
            int sum = 0;
            for(int j = 0; j < numChar.length; j++){
                int cur = Character.getNumericValue(numChar[j]);
                sum += cur;
            }
            max = Math.max(max, sum);
        }
        System.out.println(max);


    }
}