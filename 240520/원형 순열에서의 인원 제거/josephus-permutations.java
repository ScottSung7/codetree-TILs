import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int target = sc.nextInt();
        Queue<Integer> q = new LinkedList<Integer>();

        for(int i = 1; i <= length; i++){
            q.add(i);
        }

        while(!q.isEmpty()){
            for(int i = 1; i < target; i++){
                q.add(q.poll());
            }
            System.out.print(q.poll() + " ");
        }





    }
}