import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Map<String, Object>> listA = new ArrayList<Map<String, Object>>();
        List<Map<String, Object>> listB = new ArrayList<Map<String, Object>>();
        int aLength = sc.nextInt();
        int bLength = sc.nextInt();
        
        int totalTime = 0;
        for(int i = 0; i < aLength; i ++){
            String direction = sc.next();
            int amount = sc.nextInt();
            totalTime += amount;
            Map<String, Object> map = new HashMap<>();
            map.put("direction", direction.equals("R")? true : false);
            map.put("amount", amount);
            listA.add(map);
        }
        for(int i = 0; i < bLength; i ++){
            String direction = sc.next();
            int amount = sc.nextInt();
            Map<String, Object> map = new HashMap<>();
            map.put("direction", direction.equals("R")? true : false);
            map.put("amount", amount);
            listB.add(map);
        }
        int aListCnt = 0;
        int bListCnt = 0;
        Map<String, Object> mapA = listA.get(0);
        Map<String, Object> mapB = listB.get(0);
        Boolean directionA = (Boolean)mapA.get("direction");
        Integer valueA = (Integer)mapA.get("amount");
        Boolean directionB = (Boolean)mapB.get("direction");
        Integer valueB = (Integer)mapB.get("amount");

        int timeCnt = 0;
        boolean met = false;
        int a = 0;
        int b = 0;
        for(int i = 0; i < totalTime; i++){
            
            if(directionA){
                a++;
                valueA--;
            }else if(!directionA){
                a--;
                valueA--;
            }
            if(valueA == 0){
                aListCnt++;
                if(aListCnt < listA.size()){
                    mapA = listA.get(aListCnt);
                    directionA = (Boolean)mapA.get("direction");
                    valueA = (Integer)mapA.get("amount");
                }
            }

            if(directionB){
                b++;
                valueB--;
            }else if(!directionB){
                b--;
                valueB--;
            }
            if(valueB == 0){
                bListCnt++;
                if(bListCnt < listB.size()){
                    mapB = listB.get(bListCnt);
                    directionB = (Boolean)mapB.get("direction");
                    valueB = (Integer)mapB.get("amount");
                }
            }

            timeCnt++;
            if(a == b){
                met = true;
                break;
            }

            }
            if(!met) timeCnt = -1;
            System.out.println(timeCnt);
        }
    }