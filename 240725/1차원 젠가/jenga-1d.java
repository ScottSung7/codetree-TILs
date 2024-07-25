import java.util.*;

public class Main {
    private static int length;
    private static int[] grid;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        length = sc.nextInt();
        grid = getGrid(sc);
       
        int from = sc.nextInt()-1; 
        int to = sc.nextInt()-1;    
        
        cut(from, to);
            
        int from2 = sc.nextInt()-1;
        int to2 = sc.nextInt()-1;
        
        cut(from2, to2);

        System.out.println(grid.length);
        print();
        

    }
    private static void cut(int from, int to){
        int newSize = grid.length - (to-from) -1;
        int[] newGrid = new int[newSize];
   
        int j = 0;
        for(int i = 0; i < from; i++){
            newGrid[i] = grid[i];
            j++;
        }
        
        for(int i = (to+1); i < grid.length; i++){
            newGrid[j] = grid[i];
            j++;
        }
        grid = newGrid;
    }
    private static int[] getGrid(Scanner sc){
        int[] grid = new int[length];
        for(int i = 0; i < length; i++){
            grid[i] = sc.nextInt();
        }
        return grid;
    }
    private static void print(){
          for(int i =0; i < grid.length; i++){
            //System.out.print(grid[i] + " ");
            System.out.println(grid[i]);
        }
    }
}