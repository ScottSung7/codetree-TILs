import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int width = sc.nextInt();

        int[] arr = new int[length];
        String[] type = new String[length];
        for(int i = 0; i < length; i++){
            arr[i] = sc.nextInt();
            type[i] = sc.next();
        }

        int maxNow = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(maxNow < arr[i]){
                maxNow = arr[i];
            }
        }

        //0넣기
        String[] newArr = new String[maxNow+2];
        for(int i =0; i <= maxNow; i++){
            newArr[i] = null;
        }
        for(int i = 0; i < arr.length; i++){
            newArr[arr[i]] = type[i];
        }
        int max = Integer.MIN_VALUE;
        //찾기
        for(int i = 1; i <= (maxNow+2-width); i++){
            int total = 0;
            for(int j = i; j <= width+1; j++){
                if(newArr[j] == null){
                    continue;
                }else if(newArr[j].equals("G")){
                    total += 1;
                }else if(newArr[j].equals("H")){
                    total += 2;
                }
            }
            if(max < total){
                max = total;
            }
        }

        System.out.println(max);

    }
}