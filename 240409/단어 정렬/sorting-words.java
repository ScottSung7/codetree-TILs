import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        List<String> list = new ArrayList<String>();
        for(int i = 0; i < length; i++){
            String word = sc.next();
            list.add(word);
        }

        String[] strArr = list.stream().toArray(String[]::new);
        Arrays.sort(strArr);
        
        for(int i = 0; i < strArr.length; i++){
            System.out.println(strArr[i]);
        }

    }
}