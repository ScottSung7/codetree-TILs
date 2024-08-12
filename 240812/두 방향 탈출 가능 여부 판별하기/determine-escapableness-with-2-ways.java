import java.util.*;
public class Main {
    public static List<List<Integer>> list = new ArrayList<List<Integer>>();
    public static int v,e;
    public static boolean[] visited; 
    public static int cnt;
    public static int curV = 1;
    public static void main(String[] args) {
        makeAL();
        cnt = 0;
        
        for(int i = 1; i <= v; i++){
            DFS(i);
        }
        System.out.println(curV == v+1 ? 1 : 0);
        //print();
    }
    
    public static void DFS(int vertex){
       for(int i = 0; i < list.get(vertex).size(); i++){
            if(list.get(vertex).get(i) == curV){
                curV++;        
            }
        }
        
    }
    public static void makeAL(){
        Scanner sc = new Scanner(System.in);
        v = sc.nextInt();
        e = sc.nextInt();
        visited = new boolean[v+1];


        for(int i = 0; i <= v; i++){
            list.add(new ArrayList<Integer>());
        }

        for(int i = 1; i <= v; i++){
            for(int j = 0; j < e; j++){
                if(sc.nextInt() == 1) {
                    list.get(i).add(j+1);
                }
            }
        }

    }
    public static void print(){
        for(int i = 0; i <= v; i++){
            System.out.print("V" + i + ": ");
            for(int j =0; j < list.get(i).size(); j++){
                System.out.print(list.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
    
}