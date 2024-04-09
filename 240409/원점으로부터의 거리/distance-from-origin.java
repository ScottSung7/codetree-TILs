import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        Point[] points = new Point[length];
        for(int i = 0; i < length; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            points[i] = new Point(x, y, i+1);
        }

        Arrays.sort(points);
        for(int i = 0; i < length; i++){
            Point p = points[i];
            System.out.println(p.num);
        }

    }
}
class Point implements Comparable<Point>{
    int x;
    int y;
    int num;
    int length;

    Point(int x, int y, int i){
        this.x=x;
        this.y=y;
        this.num = i;
        this.length = Math.abs(x) + Math.abs(y); 
    }
    
    @Override
    public int compareTo(Point point){
        if(this.length == point.length){
            return this.num - point.num;
        }
        return this.length - point.length;
    }

}