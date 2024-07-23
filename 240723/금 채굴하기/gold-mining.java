import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int goldPrice = sc.nextInt();
        int[][] grid = createGrid(sc, size); //그리드 생성

        int maxGold = 0;
        for(int row = 0; row < size; row++){
            for(int col = 0; col < size; col++){
                int numOfGold = 0;
                for(int k = 0; k < 2*(size-1); k++){
                    numOfGold = collectGold(row, col, k, size, grid);
                    if(numOfGold * goldPrice >= getArea(k)){
                        maxGold = Math.max(maxGold, numOfGold);
                    }
                }
            }
        }
        System.out.println(maxGold);
    }
    private static int collectGold(int row, int col, int k, int size, int[][] grid){
        
        if(k == 0){
            return grid[row][col];
        }
        int[] dirX = {1, 1, -1, -1};
        int[] dirY = {-1, 1, 1, -1};
        
        int goldNow = 0;
        for(int curK = 1; curK <= k; curK++){
            int curX = row - curK;
            int curY = col;
            for(int curDir = 0; curDir < 4; curDir++){
                for(int repeat = 0; repeat < curK; repeat++){
                    if(inRange(curX, curY, size)){
                        goldNow += grid[curX][curY];
                    }
                    curX = curX + dirX[curDir];
                    curY = curY + dirY[curDir];
                }
            }
        }
        return goldNow;
    }
    private static boolean inRange(int x, int y, int size){
        return x >= 0 && y >= 0 && x < size && y < size;
            
    }
    private static int getArea(int k){
        return k*k + (k+1)*(k+1);
    }
    private static int[][] createGrid(Scanner sc, int size){
        
        int[][] grid = new int[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                grid[i][j] = sc.nextInt();
            }
        }
        return grid;
    }
}