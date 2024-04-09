import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(bf.readLine());
        int[] arr = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt)
                        .toArray();
        List<Integer> list = new ArrayList<Integer>();

        for(int i =1; i <= arr.length; i++){
            list.add(arr[i-1]);
            if(i%2 != 0){
                int mid = (i-1)/2;
                Collections.sort(list);
                System.out.print(list.get(mid) + " ");
            }
        }
        
    
    }
}