import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[][] positions = new int[length][2];
        for(int i = 0; i < length; i++){
            positions[i][0] = sc.nextInt();
            positions[i][1] = sc.nextInt();
        }
        
        int minArea = Integer.MAX_VALUE;
        // Math.abs(endy-starty)
        for(int i = 0; i < length; i++){
            int startx= 40001, endx= 0, starty= 40001, endy = 0;
            for(int j = 0; j < length; j++){
                if(i == j)
                    continue;
                startx = Math.min(startx, positions[j][0]);
                endx = Math.max(endx, positions[j][0]);
                starty = Math.min(starty, positions[j][1]);
                endy = Math.max(endy, positions[j][1]);
            }
            int area = Math.abs(endx - startx) * Math.abs(endy-starty);
            minArea = Math.min(minArea, area);
        }
        System.out.println(minArea);
    }
}