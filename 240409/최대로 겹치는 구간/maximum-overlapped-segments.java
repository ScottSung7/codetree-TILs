import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < length; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            for(int j = a+1; j < b; j++){
                if(map.get(j) == null){
                    map.put(j, 0);
                }
                int now = map.get(j);
                
                map.put(j, now + 1);
            }
        }
        
        int max = 0;
        for(Integer key : map.keySet()){
            int cur = map.get(key);
            if(cur > 1){
                if(max < cur){
                    max = cur;
                }
            }
        }
        System.out.println(max);


    }
}