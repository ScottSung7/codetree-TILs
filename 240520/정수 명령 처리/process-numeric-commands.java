import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        Stack<Integer> s = new Stack();
        for(int i = 0; i < length; i++){

            String command = sc.next();

            if(command.equals("push")){
                int a = sc.nextInt();
                s.push(a);
            }else if(command.equals("size")){
                System.out.println(s.size());
            }else if(command.equals("empty")){
                System.out.println(s.isEmpty() ? 1 : 0);
            }else if(command.equals("pop")){
                System.out.println(s.pop());
            }



        }

    }
}