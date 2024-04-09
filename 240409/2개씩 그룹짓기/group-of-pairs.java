import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        //맨뒤랑 맨앞을 더하고
        //그 중에 제일 큰값.
        int size = Integer.parseInt(bf.readLine());
        int[] arr = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt)
                    .toArray();
        Arrays.sort(arr);
        
        List<Integer> list = new ArrayList<Integer>();
        int backward = arr.length-1;
        for(int i = 0; i < arr.length/2; i++){

            list.add(arr[i] + arr[backward]);
            backward--;
        }

        System.out.println(Collections.max(list));

    }
}