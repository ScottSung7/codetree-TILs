import java.util.Scanner;
public class Main {
    private static int x = 0;
    private static int y = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            char direction = sc.next().charAt(0);
            int distance = sc.nextInt();
            // Please Write your code.
            move(direction, distance);

        }
        System.out.printf("%d %d", x, y);
    }
    public static void move(char dir, int n){

        if(dir == 'E'){
            x = x + n; y = y;
        }
        else if(dir == 'N'){
            x = x; y = y + n;
        }
        else if(dir == 'W'){
            x = x - n; y=y;
        }
        else if(dir == 'S'){
            x = x; y = y - n;
        }
    }
}