import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        char[] elements = word.toCharArray();

        int count = 0;
        for(int i = 0; i < elements.length; i++){
            if(elements[i] == '('){
                for(int j=i; j<elements.length; j++){
                    if(elements[j] == ')'){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);

    }
}