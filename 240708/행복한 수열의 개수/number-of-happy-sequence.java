import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int happy = sc.nextInt();

        int[][] grid = getgrid(sc, size);

        int happyCnt = findHappyCnt(grid, happy);
        System.out.println(happyCnt);
        
    }

    private static int findHappyCnt(int[][] grid, int happy){


        int maxCollected = Integer.MIN_VALUE;
        boolean last = false;
        
        int dupCnt;
        int happyCnt = 0;
        int numBefore;
        for(int i = 0; i < grid.length; i++){
            dupCnt = 1;
            int num = -1;
            numBefore = -1;
            for(int j = 0; j< grid.length; j++){
                num = grid[i][j];
                if(num == numBefore) dupCnt++;
                numBefore = num;
            }
            if(dupCnt >= happy) happyCnt++;
            
        }
         
        for(int j=0; j< grid.length; j++){
            dupCnt = 1;
            numBefore = -1;
            int num = -1;
            for(int i = 0; i< grid.length; i++){
                num = grid[i][j];
                if(num == numBefore) dupCnt++;
                numBefore = num;
            }
            if(dupCnt >= happy) happyCnt++;
            
        }
        
        return happyCnt;

    }
    private static int[][] getgrid(Scanner sc, int size){

        int[][] grid = new int[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                grid[i][j] = sc.nextInt();
            }
        }
        return grid;
    }
}