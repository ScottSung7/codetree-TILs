import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int rot = sc.nextInt();
        
        int[] gridOne = getGrid(sc, size);
        int[] gridTwo = getGrid(sc, size);
        int[] gridThree = getGrid(sc, size); 
        //Cal
        for(int j = 0; j < rot; j++){
          
            int temp1 = gridOne[size-1];
            for(int i = (size-1); i > 0; i--){
                gridOne[i] = gridOne[i-1];
            }

            int temp2 = gridTwo[size-1];
            for(int i = (size-1); i > 0; i--){
                gridTwo[i] = gridTwo[i-1];
            }
            int temp3 = gridThree[size-1];
            for(int i = (size-1); i > 0; i--){
                gridThree[i] = gridThree[i-1];
            }
            gridOne[0] = temp3;
            gridTwo[0] = temp1;
            gridThree[0] = temp2;
        }
        
        //print
        for(int i =0; i < size; i++){
            System.out.print(gridOne[i] + " ");  
        }
            System.out.println();
        for(int i =0; i < size; i++){
            System.out.print(gridTwo[i] + " ");  
        }
                    System.out.println();
        for(int i =0; i < size; i++){
            System.out.print(gridThree[i] + " ");  
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