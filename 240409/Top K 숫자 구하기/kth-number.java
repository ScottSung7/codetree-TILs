import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] basic = bf.readLine().split(" ");
        int length = Integer.parseInt(basic[0]);
        int target = Integer.parseInt(basic[1])-1;

        int[] arr = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt)
                        .toArray();
        Arrays.sort(arr);

        System.out.println(arr[target]);


    }
}