import java.util.*;
public class Main {
    private static int n;
    private static int m;
    private static int[] grid;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    n = sc.nextInt();       m = sc.nextInt();   grid = getGrid(sc);
        
        while(true){
            numChanged = false;
            findNum();
            removeZero();
            if(numChanged != true){ break;}
        }
        

        System.out.println(grid.length);
        print();
    }
    private static void removeZero(){
        int cntZero = 0;
        for(int i =0; i < grid.length; i++){
            if(grid[i] == 0) cntZero++;
        }
        
        int[] newG = new int[grid.length - cntZero];
        int tempI = 0;
        for(int i = 0; i < grid.length; i++){
            if(grid[i] != 0){
                newG[tempI] = grid[i];
                tempI++;
            } 
        }
        grid = newG;

    }
    private static boolean numChanged;
    private static void check(){
        cnt = 1;    temp = 0;    num = 0;   start = -1;
        
        for(int i = 1; i < grid.length; i++){
                temp = grid[i-1];
                if(temp!=0 && temp == grid[i]){
                    //System.out.print(temp + " " + grid[i] + " ");
                    //System.out.println();
                    cnt++;
                    if(cnt >= m){
                        if(num > 0 && num != grid[i]) {
                            cnt--;  
                            break;  
                        }
                        if(start == -1) start = i-1;
                        num = grid[i]; //2 
                        numChanged = true;
                    }
                }
            }
        //System.out.println("numC " + numChanged);

    }
    private static int start;
    private static int num;
    private static int temp;
    private static int cnt;
    private static void findNum(){
        
        while(true){
            //findNum
            //System.out.println("cnt ini: " + cnt);
            check();
            
            if(num == 0) break; 
            //System.out.println();
            //System.out.println("start: " + start);
            //System.out.println("cnt: " + cnt);
            //System.out.println("num: " + num);
            //System.out.println("numC " + numChanged);
            
            //remove
            remove();
            //print();
            //System.out.println();
            //System.out.println();
        }
    }
    private static void remove(){
        int[] tempG = grid;
        int newLength = grid.length - cnt;
        int tempR = 0;

        for(int i = 0; i < grid.length; i++){
            if(grid[i] != num) tempG[i] = grid[i];
            else if(i >= start) tempG[i] = 0;
        }
        grid = tempG;
    }
    
    private static int[] getGrid(Scanner sc){
        int[] grid = new int[n];
        for(int i = 0; i < n; i++){
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