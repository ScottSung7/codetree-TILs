import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[11];
        int cnt = 0;
        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            int place = sc.nextInt();
            if(place == 0){
                place = 3;
            }else if(place == 1){
                place = 4;
            }
            if(arr[num] == 0){
                arr[num] = place;
            }else if(arr[num] != 0 && arr[num] != place){
                cnt++;
                arr[num] = place;
            }
        }
        System.out.println(cnt);
    }
}