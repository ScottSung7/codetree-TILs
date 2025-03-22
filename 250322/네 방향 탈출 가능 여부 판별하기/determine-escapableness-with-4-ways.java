import java.util.*;
import java.io.*;
public class Main {
    private static int n;
    private static int m;
    private static int[][] grid;
    private static boolean[][] visited;
    private static boolean found = false;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        grid = new int[n][m];
        visited = new boolean[n][m];
        for(int i = 0; i < m; i++){
            StringTokenizer stg = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++){
                grid[i][j] = Integer.parseInt(stg.nextToken());
                visited[i][j] = false;
            }
        }

        qx.add(0);
        qy.add(0);
        BFS(0,0);
        System.out.println(found ? 1 : 0);
    }   

    private static Queue<Integer> qx = new LinkedList<>();
    private static Queue<Integer> qy = new LinkedList<>();
    private static void BFS(int x, int y){

        if(!qx.isEmpty() || !qy.isEmpty()){
            int[] dx = {1, 0, -1, 0};
            int[] dy = {0, 1, 0, -1};
            
            int currX = qx.poll();
            int currY = qy.poll();

            for(int i = 0; i < 4; i++){
                int newX = currX + dx[i];
                int newY = currY + dy[i];
                if(found) break;
                if(canGo(newX, newY)){
                    visited[newX][newY] = true;
                    qx.add(newX);
                    qy.add(newY);
                    BFS(newX, newY);
                }
            }
        }
    }
    private static boolean inRange(int x, int y){
         if(x == (n-1) && y == (m-1)) {
            found = true;
        }
        return x >= 0 && y >= 0 && x < n && y < n;
    }
        private static boolean canGo(int nx, int ny){
        if(!inRange(nx, ny)){
            return false;
        }else if(visited[nx][ny] == true || grid[nx][ny] == 0){
            return false;
        }else{
            return true;
        }
    }

}