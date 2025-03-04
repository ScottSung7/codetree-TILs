import java.io.*;
import java.util.*;

public class Main {
    private static int n;
    private static int[][] grid;
    private static int[][] visited;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        grid = new int[n][n];
        visited = new int[n][n];
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++)
                grid[i][j] = Integer.parseInt(st.nextToken());
        }
        // Please write your code here.
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1 && visited[i][j]==0){
                    countTowner = 0;
                    DFS(i, j);
                    towns.add(countTowner); 
                }
            }
        }
        towns.sort(Comparator.naturalOrder());
        System.out.println(towns.size());
        for(int i : towns){
            System.out.println(i);
        }
        
    }
    private static int countTowner = 0;
    private static List<Integer> towns = new ArrayList<Integer>();
    public static void DFS(int x, int y){
        countTowner++;
        visited[x][y] = 1;

        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        for(int i = 0; i < 4; i++){
            int newX = x + dx[i];
            int newY = y + dy[i];
            if(foundPerson(newX, newY)){
                DFS(newX, newY);
            }
         
        }
    }
    private static boolean inRange(int x, int y){
        return x >= 0 && y >= 0 && x < n && y < n;
    }
    
    private static boolean foundPerson(int x, int y){
        if(!inRange(x, y)){
            return false;
        }else if(grid[x][y] == 0 || visited[x][y] == 1){
            return false;
        }else {
            return true;
        }
    }
}