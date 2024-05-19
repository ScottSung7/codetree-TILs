import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Stack<String> s = new Stack();
        
        for(int i = 0; i < str.length(); i++){

            if(str.charAt(i) == '('){
                s.push("(");
            }else if(str.charAt(i) == ')'){
                if(s.isEmpty()){
                    System.out.println("No");
                    return;
                }
                s.pop();
            }
        }
        System.out.println(s.isEmpty() ? "Yes" : "No");


    }
}