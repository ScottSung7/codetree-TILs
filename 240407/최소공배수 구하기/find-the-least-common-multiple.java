import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        int a = sc.nextInt();
        int b = sc.nextInt();
        findLcm(a, b);
    }
    private static void findLcm(int n, int m){
        int lcm = 1;
        List<Integer> cd = new ArrayList<Integer>();
        for(int i = 1; i <= Math.min(n, m)/2; i++){
            if(n%i==0 && m%i==0){
                cd.add(i);
                n = n/i;
                m = m/i;
            }
        }

        for(int i =0; i < cd.size(); i++){
            lcm *= cd.get(i);
        }
        lcm *= n;
        lcm *= m;

        System.out.println(lcm);
    }
}