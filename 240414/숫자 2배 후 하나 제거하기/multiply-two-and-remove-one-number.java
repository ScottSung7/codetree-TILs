import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for(int i = 0; i < length; i++){
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < length; i++){
            arr[i] *= 2;

            for(int j = 0; j < length; j++){
                int[] reducedArr = new int[length-1];
                int num = 0;
                //새 배열 초기화
                for(int k = 0; k < length; k++){
                    if(j==k)
                        continue;
                    reducedArr[num++] = arr[k];
                }

                int lineSum = 0;
                for(int m = 0; m < reducedArr.length -1; m++){
                    lineSum += Math.abs(reducedArr[m] - reducedArr[m+1]);
                }
                min = Math.min(min, lineSum);
            }
            arr[i] /= 2;
        }

        System.out.println(min);


    }
}