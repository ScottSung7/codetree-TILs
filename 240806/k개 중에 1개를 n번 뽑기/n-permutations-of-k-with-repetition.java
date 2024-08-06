import java.util.*;
public class Main {
    private static int k, n;
    public static List<Integer> selectedNums = new ArrayList<Integer>();

    private static void printPermutation(){
        for(int i =0; i < selectedNums.size(); i++){
            System.out.print(selectedNums.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        k = sc.nextInt();
        n = sc.nextInt();

        findPermutations(0);

    }
    private static void findPermutations(int cnt){
        if(cnt == n){
            printPermutation();
            return;
        }

        for(int i = 1; i <= k; i++){
            selectedNums.add(i);
            findPermutations(cnt + 1); 
            selectedNums.remove(selectedNums.size() - 1);
        }
    }
}