import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] info = bf.readLine().split(" ");
        Bomb bomb = new Bomb(info[0], info[1], info[2]);

        System.out.println("code : " + bomb.code);
        System.out.println("color : " + bomb.color);
        System.out.println("second : " + bomb.second); 
    }
}
class Bomb{
     String code;
     String color;
     String second;

    Bomb(String code, String color, String second){
        this.code = code;
        this.color = color;
        this.second = second;
    }
}