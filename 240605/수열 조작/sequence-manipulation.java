import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        Deque<Integer> dq = new ArrayDeque<>();

        for(int i = 1; i <= length; i++){
            dq.addLast(i);
        }

        while(dq.size() > 1){
            dq.pollFirst();
            dq.addLast(dq.pollFirst());
        }

        System.out.println(dq.peekFirst());

    }
}