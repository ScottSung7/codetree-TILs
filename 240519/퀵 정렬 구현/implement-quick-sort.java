import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = getArr();
        arr = quicksort(arr, 0, (arr.length-1));
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
    public static int[] swap(int[] arr, int i, int j){
        int temp = arr[i];
        int temp2 = arr[j];
        arr[i] = temp2;
        arr[j] = temp;
        return arr;
    }
    public static int partition(int[] arr, int l, int r){
        int pivot = arr[r];
        int i = (l-1);

        for(int j = l; j <= r-1; j++){
            if(arr[j] <= pivot){
                i++;
                arr = swap(arr, i, j);
            }
        }
        arr = swap(arr, i+1, r);
        return (i+1);
    }
    public static int[] quicksort(int[] arr, int l, int r){
        if(l < r){
            int p = partition(arr, l, r);
    
            quicksort(arr, l, p-1);
            quicksort(arr, p+1, r);
        }
        return arr;
    }

    public static int[] getArr(){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for(int i = 0; i < length; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }


}