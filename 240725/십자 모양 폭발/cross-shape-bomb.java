import java.util.*;
public class Main {
    private static int n;
    private static int[][] grid;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        getGrid(sc);

        bomb(sc);
        arrange();
        print();
}
    private static void arrange(){
        for(int row = 0; row < n; row++){
        int[] temp = new int[n];
        int a = n-1;
        int tempI = a;
        //int row = 3;
        for(int i = a; i >= 0; i--){
            if(grid[i][row] != 0){
                temp[tempI] = grid[i][row];    
                tempI--;
            }
        }
        for(int i = 0; i < n; i++){
            grid[i][row] = temp[i];
        }
    }

    }
    private static void bomb(Scanner sc){
        int x = sc.nextInt()-1; 
        int y = sc.nextInt()-1; 

        int p = grid[x][y];
        
        grid[x][y] = 0;
        for(int i = 1; i < p; i++){
            if(x-i >= 0) grid[x-i][y] = 0;
            if(y-i >= 0) grid[x][y-i] = 0;
            if(x+i < n) grid[x+i][y] = 0;
            if(y+i <n) grid[x][y+i] = 0;
            //[-1][0] [0][-1] [1][0] [0][1]
        }
        

    }
    private static boolean inRange(int x, int y){
        return x > 0 && y >0 && y < n && x < n;
    }
    private static void print(){
        for(int i =0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(grid[i][j] +" ");
            }
            System.out.println();
        }
    }
    private static void getGrid(Scanner sc){
        int[][] g = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                g[i][j] = sc.nextInt();
            }
        }
        grid = g;
    }
}