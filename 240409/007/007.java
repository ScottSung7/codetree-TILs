import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] line = bf.readLine().split(" ");
        Secret secret = new Secret(line[0], line[1], line[2]);
        System.out.println("secret code : " + secret.code);
        System.out.println("meeting point : " + secret.point);
        System.out.println("time : " + secret.time);
    }

    static class Secret{
        private String code;
        private String point;
        private String time;

        Secret(String code, String point, String time){
            this.code = code;
            this.point = point;
            this.time = time;
        }


    }
}