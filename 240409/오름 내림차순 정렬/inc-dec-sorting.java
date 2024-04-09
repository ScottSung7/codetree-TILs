import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader  bf = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(bf.readLine());
        int[] arr = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Integer[] arr2 = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        Arrays.sort(arr);
        Arrays.sort(arr2, Collections.reverseOrder());

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();

        for(int i =0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }
    }
}