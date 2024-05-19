import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        Queue<Integer> q = new LinkedList<>();


        for(int i = 0; i < length; i++){
            String c = sc.next();

            if(c.equals("push")){
                int num = sc.nextInt();
                q.add(num);
            }else if(c.equals("size")){
                System.out.println(q.size());
            }else if(c.equals("pop")){
                System.out.println(q.poll());
            }else if(c.equals("empty")){
                System.out.println(q.isEmpty() ? 1 : 0);
            }else if(c.equals("front")){
                System.out.println(q.peek());
            }

        }



    }
}