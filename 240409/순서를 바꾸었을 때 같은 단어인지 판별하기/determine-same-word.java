import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();

        char[] arr1 = word1.toCharArray();
        Arrays.sort(arr1);
        char[] arr2 = word1.toCharArray();
        Arrays.sort(arr2);

        String newWord1 = new String(arr1);
        String newWord2 = new String(arr2);

        System.out.println(
            newWord1.equals(newWord2) ? "Yes" : "No"
        );


    }
}