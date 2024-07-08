import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = getGrid(sc, n, m);

        int typeAMax = typeA(n, m, grid);
        int typeBMax = typeB(n, m, grid);
        int result = Math.max(typeAMax, typeBMax);
        System.out.println(result);
       
    }
    private static int typeB(int n, int m, int[][] grid){
        int max = 0;
        for(int i =0; i < n; i++){
            int tempMax = 0;
            for(int j = 0; j < m; j++){
                if((j+2) < m && i < n){
                    int sum =
                        grid[i][j] + grid[i][j+1] + grid[i][j+2];
                    tempMax = Math.max(tempMax, sum);
                }

                if((i+2) < n && j < m){
                    int sum =
                        grid[i][j] + grid[i+1][j] + grid[i+2][j];
                    tempMax = Math.max(tempMax, sum);
                }
                max = Math.max(max, tempMax);
                
            }
        }
        
        return max;
    }

    private static int typeA(int n, int m, int[][] grid){
        int max = 0;
        for(int i =0; i < n; i++){
            int tempMax = 0;
            for(int j = 0; j < m; j++){
                if((j+1) < m && (i+1) < n){

                    int a = grid[i][j];
                    int b = grid[i][j+1];
                    int c = grid[i+1][j];
                    int d = grid[i+1][j+1];

                    int sum = a + b + c + d;

                    tempMax = 
                        Math.max(Math.max(Math.max(sum-a, sum-b),sum-c),sum-d);
                }else{
                    break;
                }
                max = Math.max(max, tempMax);
            }
        }
        return max;
        
        }

    private static int[][] getGrid(Scanner sc, int n, int m){

        int[][] grid = new int[n][m];
        for(int i =0; i < n; i++){
            for(int j = 0; j < m; j++){
                grid[i][j] = sc.nextInt();
            }
        }
        return grid;

    }

}