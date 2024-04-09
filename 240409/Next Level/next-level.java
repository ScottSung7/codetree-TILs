import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = bf.readLine().split(" ");

        User user = new User();
        System.out.println("user "+user.name+ " lv "+user.level);

        User user1 = new User(arr[0], arr[1]);
        System.out.println("user " + user1.name+ " lv "+user1.level);
    }
}
class User{
    String name = "codetree";
    String level = "10";
    
    User(){}

    User(String name, String level){
        this.name = name;
        this.level = level;
    }
}