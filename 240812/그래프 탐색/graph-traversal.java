import java.util.*;
public class Main {
    public static List<List<Integer>> list = new ArrayList<List<Integer>>();
    public static int v, e;
    public static boolean[] visited;
    public static int cnt;

    public static void main(String[] args) {
        makeAL();
        cnt = 0;

        int rootVertex = 1;
        visited[rootVertex] = true;
        DFS(rootVertex);

        System.out.println(cnt);
        //print();
        
    }
    public static void DFS(int vertex){
        for(int i = 0; i < list.get(vertex).size(); i++){
            int curV = list.get(vertex).get(i);
            if(!visited[curV]){
                cnt++;
                visited[curV] = true;
                DFS(curV);
            }
        }
    }
    public static void makeAL(){
        Scanner sc = new Scanner(System.in);
        v = sc.nextInt();
        e = sc.nextInt();

        visited = new boolean[v + 1];
        

        for(int i = 0; i <= v; i++){
            list.add(new ArrayList<Integer>());
        }
        for(int i = 0; i < e; i++){
            int v2 = sc.nextInt();
            int e2 = sc.nextInt();
            list.get(v2).add(e2);
            list.get(e2).add(v2);
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