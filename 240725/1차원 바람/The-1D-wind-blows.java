import java.util.*;
public class Main {
    private static int n;
    private static int m;
    private static int r;
    private static int[][] grid;
    private static int q;
    private static String d;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();       m = sc.nextInt();      q = sc.nextInt();
        grid = getGrid(sc);     
        
        for(int i = 0; i < q; i++){
            r = sc.nextInt()-1;
            d = sc.next();
            
            arrage(r, d);
        
            String D = "";
            if(d.equals("L")){ D = "R";}
            else if(d.equals("R")){ D = "L";}

            checkUp(r, D);
            checkDown(r, D);
        }

        print();
        
    }
    private static void checkUp(int newR, String D){
        if(newR-1 < 0) return;
        
        boolean check = false;
        for(int i =0; i < m; i++){
            if(grid[newR][i] == grid[newR-1][i]){
                check = true;
                arrage(newR-1, D);
                break;
            }
        }
        if(!check) return;

        if(D.equals("L")){ D = "R";}
        else if(D.equals("R")){ D = "L";}

        checkUp(newR-1, D);
    }
    private static void checkDown(int newR, String D){
        if(newR + 1 >= n) return;
           
        boolean check = false;
        for(int i = 0; i < m; i++){
            if(grid[newR][i] == grid[newR+1][i]){
                check = true;
               arrage(newR+1, D);
                break;
            }
        }
        if(!check) return;

        if(D.equals("L")){ D = "R";}
        else if(D.equals("R")){ D = "L";}

        checkDown(newR+1, D);

    }
    private static void arrage(int arrR, String D){


        if(D.equals("L")){
            int tempL = grid[arrR][m-1];
            for(int i = (m-1); i > 0; i--){
                grid[arrR][i] = grid[arrR][i-1];
            }
            grid[arrR][0] = tempL;
        }else if(D.equals("R")){
            int tempR = grid[arrR][0];
            for(int i = 0; i < m-1; i++){
                grid[arrR][i] = grid[arrR][i+1];
            }
            grid[arrR][m-1] = tempR;
        }
    }
    private static int[][] getGrid(Scanner sc){
        int[][] grid = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j =0; j < m; j++){
                grid[i][j] = sc.nextInt(); 
            }
        }
        return grid;
    }
    private static void print(){
        
         for(int i = 0; i < n; i++){
            for(int j =0; j < m; j++){
                System.out.print(grid[i][j] + " ");  
            }
            System.out.println();
        }
       
    }
}