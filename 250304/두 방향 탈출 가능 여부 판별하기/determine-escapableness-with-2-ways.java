import java.util.Scanner;
public class Main {
    private static int n;
    private static int m;
    private static int[][] grid;
    private static int[][] visited;
    private static boolean found = false;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        grid = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                grid[i][j] = sc.nextInt();
        // Please write your code here.
        visited = new int[n][m];
        for(int i = 0; i < n; i++)
            for(int j=0; j < m; j++)
                visited[i][j] = 0;
        visited[0][0] = 1;
        DFS(0,0);
        System.out.println(found ? 1 : 0);
    }
    public static void DFS(int x, int y){

        int[] dx = {1, 0};
        int[] dy = {0, 1};
        for(int i = 0; i < 2; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(found) break;
            if(canGo(nx, ny)){
                visited[nx][ny] = 1;
                DFS(nx,ny);
            }
        }

    }
    private static boolean inRange(int nx, int ny){
        if(nx == (n-1) && ny == (m-1)) {
            found = true;
        }
        return nx >= 0 && nx < n &&
               ny >= 0 && ny < m;
    }
    private static boolean canGo(int nx, int ny){
        if(!inRange(nx, ny)){
            return false;
        }else if(visited[nx][ny] == 1 || grid[nx][ny] == 0){
            return false;
        }else{
            return true;
        }
    }
}