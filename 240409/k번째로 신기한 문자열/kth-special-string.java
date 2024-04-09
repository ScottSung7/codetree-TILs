import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = bf.readLine().split(" ");
        int length = Integer.parseInt(firstLine[0]);
        int target = Integer.parseInt(firstLine[1]) - 1;
        String find = firstLine[2];

        List<String> list = new ArrayList<String>();        
        for(int i = 0; i < length; i++){
            String word = bf.readLine();
            if(word.startsWith(find)){
                list.add(word);
            }
        }
        Collections.sort(list);
        System.out.println(list.get(target));

    }
}