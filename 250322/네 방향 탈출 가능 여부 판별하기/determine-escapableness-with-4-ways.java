import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStream(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] grid = new int[n][m]();
        for(int i = 0; i < m; i++){
            StringTokenizer st = new StringTokenizer(br.readLine);
            for(int j = 0; j < n; j++){
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print("{} ", grid[i][j]);
            }
            System.out.println();
        }
    }
}