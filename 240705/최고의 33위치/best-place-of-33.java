import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[][] grid = getgrid();
        
        int max = findMax(grid);
        System.out.println(max);
        
    }

    private static int findMax(int[][] grid){

        int xstart = 0;
        int xend;
        int ystart = 0;
        int yend;

        int maxCollected = Integer.MIN_VALUE;
        boolean last = false;
        while(!last){
            
            xend = xstart + 3;
            yend = ystart + 3;

            if(xend == grid.length && yend == grid.length){
                last = true;
            }

            int collected = 0;
            for(int i = ystart; i < yend; i++){
                for(int j = xstart; j < xend; j++){
                    if(grid[i][j] == 1){
                        collected++;
                    }
                }
            }

            maxCollected = Math.max(maxCollected, collected);

            if(xend < grid.length){
                xstart++;
            }else if(yend < grid.length){
                ystart++;
                xstart = 0;
            }

        }
        return maxCollected;

    }
    private static int[][] getgrid(){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[][] grid = new int[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                grid[i][j] = sc.nextInt();
            }
        }
        return grid;
    }
}