import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[][] positions = new int[length][2];
        for(int i =0; i < length; i++){
            positions[i][0] = sc.nextInt();
            positions[i][1] = sc.nextInt();
        }

        int total = Integer.MAX_VALUE;
        for(int i = 0; i <= length-2; i++){
            for(int j = i+1; j <= length-1; j++){
                int x = (int)Math.pow(Math.abs(positions[i][0] - positions[j][0]),2);
                int y = (int)Math.pow(Math.abs(positions[i][1] - positions[j][1]),2);
                total = Math.min(total, x+y);
            }
        }
        System.out.println(total);

    }
}