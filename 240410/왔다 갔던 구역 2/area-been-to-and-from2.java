import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int from = 0;
        int to = 0;
        for(int i = 0; i < length; i++){
            int a = sc.nextInt();
            String b = sc.next();
            if(b.equals("R")){
                to = a;
            }else if(b.equals("L")){
                to = from - a;
            }

            for(int j = from; j < to; j++){
                if(map.get(j) == null){
                    map.put(j, 0);
                }
                int now = map.get(j);
                
                map.put(j, now + 1);
            }

            from = to;
        }
        
        int total = 0;
        for(Integer key : map.keySet()){
            int cur = map.get(key);
            if(cur > 1){
                total++;
            }
        }
        System.out.println(total);


    }
}