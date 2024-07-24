import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int rot = sc.nextInt();
        
        int[] gridUp = getGrid(sc, size);
        int[] gridDown = getGrid(sc, size);
        

        for(int j = 0; j < rot; j++){
          
            int tempU = gridUp[size-1];
            for(int i = (size-1); i > 0; i--){
                gridUp[i] = gridUp[i-1];
            }

            int tempD = gridDown[size-1];
            for(int i = (size-1); i > 0; i--){
                gridDown[i] = gridDown[i-1];
            }
            gridUp[0] = tempD;
            gridDown[0] = tempU;
        }
        
        //print
        for(int i =0; i < size; i++){
            System.out.print(gridUp[i] + " ");  
        }
            System.out.println();
        for(int i =0; i < size; i++){
            System.out.print(gridDown[i] + " ");  
        }
        
    }
    private static int[] getGrid(Scanner sc, int size){
        int[] grid = new int[size];
         for(int i =0; i < size; i++){
            grid[i] = sc.nextInt();    
        }
        return grid;
    }
}