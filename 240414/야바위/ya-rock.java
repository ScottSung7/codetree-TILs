import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        //1일때 //2일때 //3일때 
        int[] arr1 = new int[] {0,1, 0, 0};
        int[] arr2 = new int[] {0,0, 1, 0};
        int[] arr3 = new int[] {0,0, 0, 1};
        int[][] arrTotal = new int[][] {arr1, arr2, arr3};
        int[][] fromToTarget = new int[length][3];

        for(int i = 0 ; i < length; i++){
            int[] info = new int[3];
            info[0] = sc.nextInt();
            info[1] = sc.nextInt();
            info[2] = sc.nextInt();
            fromToTarget[i] = info;
        }
        int max = 0;
        for(int i = 0; i < 3; i++){
           max = Math.max(max, eachGame(arrTotal[i], fromToTarget));
        }
        System.out.println(max);
    }
    private static int eachGame(int[] arr, int[][] fromToTarget){
        int totalScore = 0;
        for(int i = 0; i < fromToTarget.length; i++){
            totalScore += singleGame(arr, fromToTarget[i]);
        }
        return totalScore;
    }
    private static int singleGame(int[] arr, int[] oneFromToTarget){
        int from = oneFromToTarget[0];
        int to = oneFromToTarget[1];
        int target = oneFromToTarget[2];

        int tempFrom = arr[from];
        int tempTo = arr[to];
        arr[to] = tempFrom;
        arr[from] = tempTo;
        if(arr[target] == 1){
            return 1;
        }else{
            return 0;
        }

    }
}