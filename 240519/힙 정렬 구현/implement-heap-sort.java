import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] arr = getArr();
        arr = heap_sort(arr, (arr.length-1));
        for(int i = 1; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static int[] heap_sort(int[] arr, int n){
        for(int i = n/2; i >= 1; i--){
            arr = heapify(arr, n, i);
        }
        for(int i = n; i > 0; i--){
             arr = swap(arr, 1, i);
             arr = heapify(arr, i-1, 1);
         }
        return arr;
    }
    public static int[] heapify(int[] arr, int n, int i){
        int largest = i;
        int left = i * 2;
        int right = i * 2 + 1;

        if(left <= n && (arr[left] > arr[largest])){
            largest = left;
        }
        if(right <= n && (arr[right] > arr[largest])){
            largest = right;
        }

        if(largest != i){
            swap(arr, i, largest);
            heapify(arr, n, largest);
        }
        return arr;
    }
    public static int[] swap(int[] arr, int from, int to){
        int temp = arr[to];
        arr[to] = arr[from];
        arr[from] = temp;
        return arr;
    }
    public static int[] getArr(){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int mLength = length+1;
        int[] arr = new int[mLength];
        for(int i = 1; i < mLength; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    
}