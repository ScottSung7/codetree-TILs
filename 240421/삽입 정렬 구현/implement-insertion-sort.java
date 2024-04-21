import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for(int i = 0; i < length; i++){
            arr[i] = sc.nextInt();
        }
        arr = insertionSort(arr);
        for(int i = 0; i < length; i++){
            System.out.print(arr[i] + " ");
        }


    }
    private static int[] insertionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
           int j = i-1;
           int key = arr[i];
           while(j >= 0 && arr[j] > key){
               arr[j+1] = arr[j];
               j--;
           }
           arr[j+1] = key;
        }
        return arr;


    }
}