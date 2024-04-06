import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<Integer>();
        
        int length = Integer.parseInt(bf.readLine());
        String input = " ";
        for(int i =0; i < length; i++){
            input = bf.readLine();
            String[] arr = input.split(" ");
            String command = arr[0];
            int num = 0;
            if(command.equals("push_back")){
                num = Integer.parseInt(arr[1]);
                list.add(num);
            }else if(command.equals("get")){
                num = Integer.parseInt(arr[1]);
                System.out.println(list.get(num-1));
            }else if(command.equals("size")){
                System.out.println(list.size());
            }else if(command.equals("pop_back")){
                list.remove(list.size()-1);
            }

        }



    }
}