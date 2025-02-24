import java.util.*;
public class Main {
    private static boolean[] visited;
    private static List<Integer>[] graph;
    private static int numVertex;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] u = new int[m];
        int[] v = new int[m];
        for (int i = 0; i < m; i++) {
            u[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }
        
        //visited
        visited = new boolean[n+1];
        visited[0] = true;
        // 담을 리스트 만들기
        graph = new List[n+1];
        for(int i = 0; i <= n; i++){
            graph[i] = new ArrayList<Integer>();
        }
        for(int i = 0; i < m; i++){
            int con1 = u[i];
            int con2 = v[i];
            graph[con1].add(con2);
            graph[con2].add(con1);
        }
        // 보기
        // for(int i = 0; i <= n; i++){
        //     System.out.println(graph[i]);
        // }

        visited[1] = true;
        DFS(1, graph);
        System.out.println(numVertex);

    
    }
    public static void DFS(int vertex, List<Integer>[] graph){
        for(int i = 0; i < graph[vertex].size(); i++){
            int currV = graph[vertex].get(i);
            if(!visited[currV]){
                numVertex++;
                visited[currV] = true;
                DFS(currV, graph);
            }
        }
    }
}