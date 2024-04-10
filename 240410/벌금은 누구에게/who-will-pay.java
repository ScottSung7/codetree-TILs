import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        int studentSize = sc.nextInt();
        int length = sc.nextInt();
        int target = sc.nextInt();
        int[] violations = new int[studentSize+1];
        for(int i = 1; i <= studentSize; i ++){
            violations[i] = 0;
        }
        int student = 0;
        for(int i =0; i < length; i++){
            int num = sc.nextInt();
            violations[num]++;
            if(violations[num] >= target){
                student = num;
                break;
            }
        }

        System.out.println(student);


    }
}